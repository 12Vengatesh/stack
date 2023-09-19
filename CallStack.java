package pro;

public class CallStack {
	public static void main(String args[]) {
	Stack obj=new Stack();
	obj.push(5);
	obj.push(20);
	obj.push(10);
	System.out.println(obj.pop());
	System.out.println(obj.pop());
	System.out.println(obj.pop());
	System.out.println(obj.pop());
	}
}
