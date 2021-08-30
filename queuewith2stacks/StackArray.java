package queuewith2stacks;

//23 Aug 2021
/**
 *
 * @author cen7
 *
 */
public class StackArray<Item> {

	private Item[] a;
	private int n;

	public StackArray() {
		a = (Item[]) new Object[1];
		n = 0;
		
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int getSize() {
		return n;
	}

	public void push(Item item) {
		if (n == a.length)
			resize(2 * a.length);
		a[n++] = item;
	}

	private void resize(int capacity) {
		Item[] copy = (Item[]) new Object[capacity];
		for (int i = 0; i < n; i++)
			copy[i] = a[i];
		a = copy;
	}

	public Item pop() {
		Item item = a[--n];
		a[n] = null;
		if (n > 0 && n == (a.length / 4))
			resize(a.length / 2);
		return item;
	}

	public Item[] getStack() {
		return a;
	}

	public void printStack() {
		System.out.print("Items: ");
		if (n == 0)
			System.out.print("No Items!");
		else
			for (Item item : a) {
				System.out.printf("%s", a);
			}

	}

}
