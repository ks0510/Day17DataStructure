/*
 * This java program store weekdays and dates of month in stack
 */

package datastructureprogram;

/**
 * 
 * @author Kaif
 *
 * @param <T>
 */

class StackNew4<T> {

	Node2<T> top;

	/*
	 * To define constructor which save value of top of stack
	 */
	public StackNew4() {
		super();
		this.top = top;
	}

	/*
	 * To define push method
	 */
	public void push(T x) {

		/*
		 * To create node object for new node
		 */
		Node2<T> temp = new Node2<>();

		/*
		 * To check stack fully filled or not
		 */
		if (temp == null) {
			System.out.println("Stack Overflow");
			return;
		}
		temp.data = x;
		temp.link = top;
		top = temp;
	}

	/*
	 * To check stack is empty or not
	 */
	public boolean isEmpty() {
		return top == null;
	}

	public T peek() {
		/*
		 * check for empty stack
		 */
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			Object obj = (int) -1;
			return (T) obj;
		}
	}

	/*
	 * Utility function to pop top element from the stack
	 */
	public void pop() {
		/*
		 * To check for stack underflow
		 */
		if (top == null) {
			System.out.println("Stack Underflow");
			return;
		}

		/*
		 * To update the top pointer to point to the next node
		 */
		top = (top).link;
	}

	public void display() {
		/*
		 * check for stack underflow
		 */
		if (top == null) {
			System.out.println("Stack Underflow");
			return;
		} else {
			Node2<T> temp = top;
			while (temp != null) {

				/*
				 * print node data
				 */
				System.out.print(temp.data + "->");

				/*
				 * assign temp link to temp
				 */
				temp = temp.link;
			}
			System.out.println();
		}
	}
}


public class Calender1 {

	public static void main(String[] args) {
		
		StackNew4<String> weekDay = new StackNew4<>();
		
		weekDay.push("Sun");
		weekDay.push("Mon");
		weekDay.push("Tue");
		weekDay.push("Wed");
		weekDay.push("Thu");
		weekDay.push("Fri");
		weekDay.push("Sat");
		
		StackNew4<Integer> Day = new StackNew4<>();
		
		for(int i=1;i<31;i++) {
			Day.push(i);
		}
		

	}

}
