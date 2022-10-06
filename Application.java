/**
 * Application.java
 * @author Jerrin C. Redmon
 * Simulates a waiting line using a queue
 */

import java.util.Scanner;
public class Application {

	public static void main(String args[]) {
		Queue<String> list = new Queue<>();
		Scanner input = new Scanner(System.in);		
		System.out.println("Welcome to the Queue!\nA list of commands is below:"
				+ "\nEnqueue(Add items to the queue)\nDequeue"
				+ "(remove items from queue)\nList(List all items in the queue)"
				+ " \nSize(Show size of the queue)\nEmpty(Clear and empty the queue)\nQuit(ends program)");
		
		boolean quit = false;
		while (!quit) {
			System.out.print("Queue Command: ");
			String command = input.nextLine();
			String[] tokens = command.split(" ", 2);
		
			
			switch (tokens[0]) {
			case "Enqueue":
				list.enqueue(tokens[1]);
				System.out.printf("%s is enqueued\n", tokens[1]);
				break;
			case "Dequeue":
				System.out.printf("%s is dequeued\n", list.dequeue());
				break;
			case "List":
				Queue<String> temp = new Queue<>();
				while (!list.isEmpty()) {
					String item = list.dequeue();
					System.out.println(item);
					temp.enqueue(item);
				}
				list = temp;
				break;
			case "Size":
				System.out.println(list.getSize());
				break;
			case "Empty":
				list.clear();
				break;
			default:
				quit = true;
				
			}
		}
		input.close();
	}
	
}
