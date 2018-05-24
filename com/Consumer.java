package com;

public class Consumer implements Runnable {

	    private DataStore dataStore;
	    
	    
	    public Consumer(DataStore dataStore, int numberOfItems) {
	        this.dataStore = dataStore;
	       
	    }

	@Override
	public void run() {
		
		 for(int count = 0; count < dataStore.store.size(); count++) {
	            dataStore.get();
	        }
		
	}

}
