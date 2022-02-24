package javaTest;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackAndQueus {
	public static void main(String[] args) {
		// stack là ngăn xếp hình dung như một chồng sách được xếp lần lượt . khi lấy phần tử ra thì chỉ lẩy từ đầu
		// theo quy tắc vào trước ra sau.
		
		// queus thì ngược lại vào trước ra trước.
		
	    // KHAI BÁO
	    PriorityQueue<String> queue =  new PriorityQueue<>();
	    queue.offer("A1");
	    queue.offer("A2");
	    queue.offer("A3");
	    // xếp hàng đưa vào trước sẽ được lấy trước
	    System.out.println(queue.poll());
	    System.out.println(queue.poll());
	    System.out.println(queue.poll());
	    // queue in ra là a1 a2 a3
	    
	   
	    
	    Stack<String> stack = new Stack<>();
	    stack.push("A1");
	    stack.push("A2");
	    stack.push("A3");
	    System.out.println("stack là " +stack.pop());
	    System.out.println("stack là " +stack.pop());
	    System.out.println("stack là " +stack.pop());
	    // nếu stack khi lấy ra nó sẽ là in a3 a2 a1
		
	}

}
