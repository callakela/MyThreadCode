package com;

import java.io.File;

public class FileTransferJob extends Thread  {

	 private TransferFile transferFile;
	 
	 public FileTransferJob(TransferFile transferFile) {
	        this.transferFile = transferFile;
	    }
	 
	 
	    public void run() {
		 
	        File dummyFile = new File("");
	        System.out.printf("%s, Start sending dummy file to another machine\n",Thread.currentThread().getName());
	        transferFile.transfer(dummyFile);
	        System.out.printf("%s,Successfully sent file to another machine\n",Thread.currentThread().getName());
	    }
}
