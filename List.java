public class List{
	private Node head;
	private Node tail;
	private int size;

	public List(){
		size = 0;
		head = null;
		tail = null;
	}

	public Boolean isEmpty(){
		if(head == null || tail == null){
			return true;
		}
		else{
			return false;
		}
	}

	public int getSize(){
		return size;
	}

	public void insertAtStart(int d){
		Node node = new Node();
		node.setData(d);
		if (isEmpty() == true){
			head = node;
			tail = node;
			head.setNext(tail);
			head.setPrev(tail);
			tail.setNext(head);
			tail.setPrev(head);
			size++;
		}
		else{
			head.setPrev(node);
			tail.setNext(node);
			node.setNext(head);
			node.setPrev(tail);
			head = node;
			size++;
		}
	}

	public void insertAtLast(int d){
		

		if(isEmpty() == true){
			insertAtStart(d);
		}

		else{
			Node node = new Node();
			node.setData(d);
			tail.setNext(node);
			node.setPrev(tail);
			node.setNext(head);
			tail = node;
			size++;
		}
	}

	public void insertAtPos(int i, int d){
		
		if(i == 1){
			insertAtStart(d);
		}

		else if (i == size + 1){
			insertAtLast(d);
		}

		else{
			Node node = new Node();
			node.setData(d);
			Node temp = head;
			Node t;
			for(int a = 1; a < i-1; a++){
				temp = temp.getNext();
			}
			t = temp.getNext();
			temp.setNext(node);
			node.setPrev(temp);
			t.setPrev(node);
			node.setNext(t);
			size++;
		}

	}

	public void deleteAtStart(){
		//Node node = new Node();
		if(isEmpty() == true){
			System.out.println("List is Empty");
		}

		else{
			head = head.getNext();
			tail.setNext(head);
			head.setPrev(tail);
			size--;

		}
	}

	public void deleteAtLast(){
		if(isEmpty() == true){
			System.out.println("List is Empty");
		}
		else{
			tail = tail.getPrev();
			tail.setNext(head);
			head.setPrev(tail);
			size--;
		}
	}

	public void deleteAtPos(int i){
		if(isEmpty() == true){
			System.out.println("Lsit is Empty");
		}

		else if (i == 1){
			deleteAtStart();
		}

		else if (i == size){
			deleteAtLast();
		}

		else if (i <= 0 || i > size){
			System.out.println("Invalid Input!!!");
		}

		else{
			Node temp = head;
			for(int a = 1; a < i-1; a++){
				temp = temp.getNext();
			}
			Node t = temp.getNext();

			temp.setNext(t.getNext());
			t.getNext().setPrev(temp);
			size--;
		}
	}
	public void swap(int i, int j){
		Node before_index_1 = head;
		Node before_index_2 = head;

		for(int a = 1; a < i-1; a++){
			before_index_1 = before_index_1.getNext();
		}

		for(int b = 1; b < j-1; b++){
			before_index_2 = before_index_2.getNext();
		}

		Node index_1, index_2;

		index_1 = before_index_1.getNext();
		index_2 = before_index_2.getNext();

		Node after_index_1, after_index_2;

		after_index_1 = index_1.getNext();
		after_index_2 = index_2.getNext();

		index_1.setNext(after_index_2);
		index_2.setNext(after_index_1);

		index_1.setPrev(before_index_2);
		index_2.setPrev(before_index_1);

		before_index_1.setNext(index_2);
		before_index_2.setNext(index_1);

		after_index_1.setPrev(index_2);
		after_index_2.setPrev(index_1);
	}


	public void view(){
		Node temp = head;
		for (int i = 1; i < size+1; i++){
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}