/**
 * Created by @authoer haquem on Dec 28, 2019 
 */
package com.mhaque.datastructure.stack;

/**
 * @author haquem
 *
 */
public class DiskStack {
	
	private int[] stackArray;
	private int maxSize;
	private int top;
	public DiskStack(int length) {
		stackArray = new int[length];
		maxSize= length;
		top= -1;
	}
	
	public void push(int value) {
		stackArray[++top]= value;
	}
	public int pop() {
		return stackArray[top--];
	}
	
	public int peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	

	public boolean isFull() {
		return top == maxSize-1;
	}
}
