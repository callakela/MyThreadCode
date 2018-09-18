package com;

import java.util.concurrent.LinkedBlockingQueue;

public class PoolWorker extends Thread {

	private LinkedBlockingQueue queue;

	public PoolWorker(LinkedBlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {

			Runnable task;
			synchronized (queue) {

				while (queue.isEmpty()) {

					try {
						queue.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

				task = (Runnable) queue.poll();
				try {

					task.run();

				} catch (RuntimeException e) {

					System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());

				}

			}
		}

	}

}
