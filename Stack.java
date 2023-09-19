package pro;

public class Stack {
	int stack[]= new int [10];
	int tos=-1;
	
	void push(int a) {
		tos++;
		if(tos!=9)
			stack[tos]=a;
		else
			System.out.println("No space available in stack");
	}
	int pop() {
		if(tos>=0)
			return (stack[tos--]);
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
}
