package com.array.problem.solution;

public class MyHashMap<K,V> {

	private int n;
	Node<K,V>[] buckets;
	
	public MyHashMap(int size) {
		n = size;
		this.buckets = new Node[n];
	}
	
	public MyHashMap() {
		this(100);
	}
	
	public void put(K key, V value) {
		int hashCode = key.hashCode();
		
		int idx = hashCode & (n-1);
		
		if(buckets[idx] == null) {
			Node node = new Node(key,value);
			buckets[idx] = node;
		}
		else {
			buckets[idx].put(key, value);
		}
	}
	
	public V get(K key) {
		int hashCode = key.hashCode();
		int idx = hashCode & (n-1);
		if(buckets[idx] == null) {
			return null;
		} else {
			return buckets[idx].get(key);
		}
	}
	
	public static void main(String[] args) {

		MyHashMap<String, String> map = new MyHashMap();
		map.put("test1", "MyTest1");
		map.put("test2", "MyTest2");
		map.put("test3", "MyTest3");
		map.put("test4", "MyTest4");
		
		System.out.println("Test 4 value is : "+map.get("test4"));
		
		
	}

}
