package queuewith2stacks;

//25 Aug 2021
/**
 *
 * @author cen7
 *
 */

/*
 * Question 1 Queue with two stacks. Implement a queue with two stacks so that
 * each queue operations takes a constant amortized number of stack operations.
 *
 */
public class QueueTwoStacks<Item> {

	private StackArray<Item> enqueueStack;
	private StackArray<Item> dequeueStack;
	private int size;

	public QueueTwoStacks() {
		enqueueStack = new StackArray<Item>();
		dequeueStack = new StackArray<Item>();
	}

	public void enqueue(Item item) {
		enqueueStack.push(item);
		size++;
	}

	public Item dequeue() {
		if (dequeueStack.isEmpty())
			while (!enqueueStack.isEmpty())
				dequeueStack.push(enqueueStack.pop());
		Item item = null;
		if (!dequeueStack.isEmpty()) {
			item = dequeueStack.pop();
			size--;
		}
		return item;

	}

	public boolean isEmpty() {
		return size == 0;

	}
}
