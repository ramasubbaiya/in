package A4;

import java.util.Iterator;
import java.util.LinkedList;

public class HashTable {

	static Object[] hashTableArr;
	static int hashTableSize = -1;
	
	// initialize the new hashtable with size
	public HashTable(int size) {
		hashTableArr = new Object[size];
		hashTableSize = size;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) <E> void insert(Object key, Object value) {
		int index = getHashIndex(key);
		Record newRecord = new Record(key, value);
		
		if(hashTableArr[index] == null) { // pointer is empty so no linked list needed
			hashTableArr[index] = newRecord;
		} else {
			LinkedList<Record> list = null;
			
			if(hashTableArr[index] instanceof Record) { // only one record present
				Record  record = (Record) hashTableArr[index];
				list = new LinkedList<Record>();
				list.add(record);
				list.add(newRecord);
			} else if(hashTableArr[index] instanceof LinkedList){ // this is a list
				list = (LinkedList) hashTableArr[index];
				list.add(newRecord);
			}
			
			hashTableArr[index] = list;
		}
	}
	
	// display the table as it is
	static void displayHashTable() {
		for(int i = 0; i < hashTableSize; i++) {
			if(hashTableArr[i] != null) {
				System.out.print(" index : " + i);
				if(hashTableArr[i] instanceof Record) { // print that single array
					Record record = (Record) hashTableArr[i];
					System.out.print(" => key : [" + record.getKey().toString() + "] value : " + record.getValue().toString());
				} else if(hashTableArr[i] instanceof LinkedList) { 
					@SuppressWarnings({ "rawtypes", "unchecked" })
					LinkedList<Record> list = (LinkedList) hashTableArr[i];
					Iterator<Record> iterator = list.iterator();
					// loop through linked list
					while(iterator.hasNext()) {
						Record record = (Record) iterator.next();
						System.out.print(" => key : [" + record.getKey().toString() + "] value : " + record.getValue().toString());
					}
				}
			} else {
				System.out.print(" index : " + i + " => ");
			}
			System.out.println();
		}
	}
	
	// hash function that returns a index based on the size;
	public static int getHashIndex(Object obj) {
		if(hashTableSize == -1) {
			return -1;
		} else {
			return (obj.hashCode() % hashTableSize)  == -1 ? 0 : obj.hashCode() % hashTableSize; // TODO: later will write my own hash code
		}
	}
	
	// Execute the HashTable
	public static void main(String[] args) {
		HashTable hashTable = new HashTable(3);
		hashTable.insert("Test 2", "Test value");
		hashTable.insert("Test", "Test value");
		hashTable.insert("Test 2", "Test value");
		System.out.println();
		displayHashTable();
	}
}

class Record {
	Object key;
	Object value;
	
	Record(Object key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public Object getKey() {
		return key;
	}

	public Object getValue() {
		return value;
	}
}
