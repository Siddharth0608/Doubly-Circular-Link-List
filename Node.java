public class Node{
	private int data;
	private Node next;
	private Node prev;

	public Node(){
		data = 0;
		next = null;
		prev = null;
	}

	public Node(int d, Node n, Node p){
		data = d;
		next = n;
		prev = p;
	}

	public void setNext(Node n){
		next = n;
	}

	public void setPrev(Node p){
		prev = p;
	}

	public void setData(int d){
		data = d;
	}

	public int getData(){
		return data;
	}

	public Node getNext(){
		return next;
	}

	public Node getPrev(){
		return prev;
	}
}