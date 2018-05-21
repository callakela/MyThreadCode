package com;
public class HashMapCustom<k,v, V, K> {
	
	
	private Entry<K,V>[] table;   //Array of Entry.
    private int capacity= 4; 
	
	public static class Entry<K,V>{
		
		K key;
		V value;
		Entry<K,V> next;
		
		public<k,v> Entry(K key,V value,Entry<K,V> next){
			
			this.key=key;
			this.value=value;
			this.next=next;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public HashMapCustom(){
	       table = new Entry[capacity];
	    }

	public void put(K newKey, V data){
		
		 if(newKey==null) 
			 return;
		 
		 int hascode=hash(newKey);
		 
		 Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);
		 
		 if(table[hascode]==null) {
			 
			 table[hascode]=newEntry;
		 }else {
			 
			 Entry<K,V> prev=null;
			 Entry<K,V> current=table[hascode];
			 
			 while(current != null){ //we have reached last entry of bucket.
		           if(current.key.equals(newKey)){           
		               if(prev==null){  //node has to be insert on first of bucket.
		                     newEntry.next=current.next;
		                     table[hascode]=newEntry;
		                     return;
		               }
		               else{
		                   newEntry.next=current.next;
		                   prev.next=newEntry;
		                   return;
		               }
		           }
		             prev=current;
		             current = current.next;
		         }
			 prev.next = newEntry;
				 
		 }
	}
	
	 public V get(K key){
	        int hash = hash(key);
	        if(table[hash] == null){
	         return null;
	        }else{
	         Entry<K,V> temp = table[hash];
	         while(temp!= null){
	             if(temp.key.equals(key))
	                 return temp.value;
	             temp = temp.next; //return value corresponding to key.
	         }         
	         return null;   //returns null if key is not found.
	        }
	    }
	private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }
}