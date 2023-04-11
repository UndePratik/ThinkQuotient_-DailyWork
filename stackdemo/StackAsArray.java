package com.stackdemo;

class MyStack
{
	
 int top;
 int size;
 int[] stk;
 
 MyStack()
 {
	 
 }
 
 MyStack(int size)
 {
	 top=-1;
	 this.size=size;
	 stk= new int[size];
 }
 
 void push(int data)
 {
	 if(top<size-1)
	 {
		 top++;
		 stk[top]=data;
		 System.out.println("Element inserted:"+data);
	 }
	 
	 else
	 {
		 System.out.println("Stack is full");
	 }
 }
 
void pop()
 {
	if(top!=-1)
	{
		System.out.println("Element deleted:"+stk[top]);
		top--;
	}
	else
	{
		System.out.println("Stack is empty");
	}
 }
 
void show()
{
	if(top!=-1)
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(stk[i]);
		}
	}
	
	else
	{
		System.out.println("No elements is stack");
	}
   

}

}


public class StackAsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack s1= new MyStack(5);
		s1.pop();
		s1.show();
		s1.push(56);
		s1.push(89);
		s1.push(78);
		s1.push(67);
		s1.push(90);
		
		s1.show();
		
		s1.push(100);

		s1.show();
		
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		
		s1.pop();
		
	}

}
