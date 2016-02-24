import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Stack<String> temp = new Stack<String>();
		
		printStack(temp);
		
		temp.push("first");
		printStack(temp);
		temp.push("second");
		printStack(temp);
		temp.push("third");
		
		printStack(temp);
		temp.pop();
		printStack(temp);
		temp.pop();
		printStack(temp);
		temp.pop();
		printStack(temp);
	}

	private static void printStack(Stack<String> temp) {
		// TODO Auto-generated method stub
		if(temp.isEmpty()!=true){
			System.out.println(temp);
		}else {
			System.out.println("Stack is blank");
		}
	}

}
