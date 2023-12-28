public class Main{
	public static void main(String[] args) {
		List obj = new List();
		obj.insertAtStart(1);
		obj.insertAtStart(2);
		obj.insertAtLast(3);
		obj.insertAtPos(2,99);
		obj.insertAtLast(9);
		obj.insertAtLast(7);
		obj.insertAtLast(6);
		obj.insertAtPos(5,66);
		obj.insertAtPos(8,69);
		obj.swap(3,6);
		obj.view();
		System.out.println("The size of list is: " +obj.getSize());
	}
}