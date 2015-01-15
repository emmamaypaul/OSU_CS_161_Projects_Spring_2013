//Emma Paul 
//September 1, 2013
//Driver class for Lab 9
//has a driver class that creates and demonstrates the functionality of the Stack and Queue structures,
//(a stack should have at least push, pop, and peek methods)
//a queue should have at least the methods of: add, which adds to the back of the queue; remove,
//which removes from the front of the queue; and peek which checks the front of the queue)
//I got help on this lab from my tutor Lewis Coates 
public class Lab9Driver 
{
	public static void main(String[] args)
	{
		QueueInterface queue = new QueueClass();//do QueueInterface to specify using the methods of the abstract interface class rather than QueueClass methods
		StackInterface stack = new StackClass();
		
		queue.add(1);//adds 1 to queue (at head)
		queue.add(2);//adds 2 to queue 
		queue.add(3);//adds 3 to queue (at tail) 
		System.out.println(queue.peek());//prints 1 because it peeks at head of queue 
		System.out.println(queue.peek());//prints 1 because it peeks at head of queue (shows peek only looks but doesn't remove)
		System.out.println(queue.remove());//prints 1 because it removes the head of the queue (which is one) 
		System.out.println(queue.peek());//prints 2 because the new head of the queue is 2 
		
		stack.push(1);//adds 1 to stack 
		stack.push(2);//adds 2 to stack 
		stack.push(3);//adds 3 to stack 
		System.out.println(stack.peek());//prints 3 (because it's the top of the stack)
		System.out.println(stack.peek());//prints 3 (because it's the top of the stack and peek only views) 
		System.out.println(stack.pop());//prints 3 because it removes the top of the stack (which is 3)
		System.out.println(stack.peek());//prints 2 because 2 is now the top of the stack 
	}
}
