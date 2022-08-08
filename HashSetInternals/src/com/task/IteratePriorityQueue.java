package com.task;

import java.util.PriorityQueue;

public class IteratePriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("satyam");
		queue.add("mohan");
		queue.add("naresh");
		queue.add("sandeep");
		System.out.println(queue);

		System.err.println(queue.peek());
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
			;
		}

		System.out.println(queue.poll());
		System.out.println(queue.isEmpty());
		System.out.println(queue.peek());
		System.out.println(queue.offer("na"));
	}

}
