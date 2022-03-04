package Micro.caprice.stackANDqueue.CBuildStack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program Before2020
 * @description: 225. 用队列实现栈
 * @author: ding
 * @create: 2022/03/04 22:42
 */
public class MyStack {
	private Deque<Integer> queue;

	/** Initialize your data structure here. */
	public MyStack() {
		queue = new ArrayDeque<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		queue.push(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		return queue.removeFirst();
	}

	/** Get the top element. */
	public int top() {
		return queue.getFirst();
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return queue.isEmpty();
	}
}
