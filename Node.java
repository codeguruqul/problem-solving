package com.array.problem.solution;

public class Node<K,V> {

	K key;
	V value;
	Node next;
	
	public Node(K key, V value) {
		this.key= key;
		this.value = value;
		this.next = null;
				
	}
	public void setValue(V value) {
		this.value = value;
	}
	public V getValue() {
		return value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void put(K key, V value) {
		Node node = new Node(key,value);
		add(node);
		
	}
	
	private void add(Node node) {
		Node start = this;
		while(true) {
			if(start.equals(node)) {
				start.setValue(node.getValue());
				break;
			} else if (start.getNext() == null) {
				start.setNext(node);
				break;
			} else {
				start = start.getNext();
			}
			
			
		}
		
	}
	
	public V get(K key) {
		
		Node start = this;
		while(true) {
			if(start.getKey().equals(key)) {
				return (V)start.getValue();
			} else if(start.getNext() == null) {
				return null;
			} else {
				start = start.getNext();
			}
		}
	}
	
	public K getKey() {
		return key;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass() != obj.getClass())
			return false;
		Node node = (Node)obj;
		return key.equals(node.getKey());
	}
}
