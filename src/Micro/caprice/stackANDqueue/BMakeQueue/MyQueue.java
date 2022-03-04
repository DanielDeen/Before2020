package Micro.caprice.stackANDqueue.BMakeQueue;

import java.util.Stack;

/**
 * @program Before2020
 * @description: 232.用栈实现队列
 * @author: ding
 * @create: 2022/03/04 22:29
 */
public class MyQueue {
	private Stack<Integer> leftStack;
	private Stack<Integer> rightStack;

	/**
	 * Initialize your data structure here.
	 */
	public MyQueue() {
		leftStack = new Stack<>();
		rightStack = new Stack<>();
	}

	/**
	 * Push element x to the back of queue.
	 */
	public void push(int x) {
		while (!rightStack.isEmpty()) {
			leftStack.push(rightStack.pop());
		}
		leftStack.push(x);
	}

	/**
	 * Removes the element from in front of queue and returns that element.
	 */
	public int pop() {
		while (!leftStack.isEmpty()) {
			rightStack.push(leftStack.pop());
		}
		return rightStack.pop();
	}

	/**
	 * Get the front element.
	 */
	public int peek() {
		while (!leftStack.isEmpty()) {
			rightStack.push(leftStack.pop());
		}
		return rightStack.peek();
	}

	/**
	 * Returns whether the queue is empty.
	 */
	public boolean empty() {
		return leftStack.isEmpty() && rightStack.isEmpty();
	}
}
