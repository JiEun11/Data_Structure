package com.javaex.structure.linkedlist;


public class Node {
	// field
	private String data;     // 노드가 갖는 값
	private Node postNode;  // 뒤에 노드
	
	// constructor
	public Node() {
		this(null, null);
	}
	
	public Node(String data) {
		this(data,null);
	}
	
	public Node(String data, Node postNode) {
		this.data = data;
		this.postNode = postNode;
	}
	
	// getter, setter
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public Node getPostNode() {
		return postNode;
	}
	public void setPostNode(Node postNode) {
		this.postNode = postNode;
	}
	
}