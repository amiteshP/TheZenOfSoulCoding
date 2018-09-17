/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	PriorityQueue<Integer> maxHeap;
	PriorityQueue<Integer> minHeap;
	public static void main (String[] args) {
		Scanner rdi = new Scanner(System.in);
		maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		minHeap = new PriorityQueue<>();

	}
	public static void addNumber(int num){
		maxHeap.offer(num);
		minHeap.offer(maxHeap.poll());

		if(maxHeap.size()<minHeap.size())
		{
			maxHeap.offer(minHeap.poll());
		}
	}
	public static int returnMedian(){
		if(maxHeap.size()==minHeap.size())
			return (int)(maxHeap.peek()+minHeap.peek())/2;
		else
			return maxHeap.peek();
	}

}