package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder ();
	
		ArrayList<Integer> list = new ArrayList<>();
		
		int testcase = in.nextInt();
		
		for (int i = 0 ;i < testcase;i++) {
			String str = in.next();
			switch (str) {
	           case "push":
	        	   int value = in.nextInt();
	        	   push(list, value);
	        	   break;
	           case "pop":  
	        	   	sb.append(pop(list) + "\n");
	                break;
	           case "size":  
	           		sb.append(size(list) + "\n");
                    break;
	           case "empty" :  
	           		sb.append(empty(list) + "\n");
                    break;
	           case "front": 
	           		sb.append(front(list) + "\n");
                    break;
	           case "back": 
	           		sb.append(back(list) + "\n");
                    break;
			}
			
		}
		System.out.println(sb);
		
		
		
		
	}
//	push X: 정수 X를 큐에 넣는 연산이다.	
	static ArrayList<Integer> push (ArrayList<Integer> list , int n) {
		list.add(n);
		return list; 
	}
//	pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	static int pop (ArrayList<Integer> list) {
		if (list.size() >= 1) {
			int value = list.get(0);
			list.remove(0);
			return value;
		}
		return -1;
	}
//	size: 큐에 들어있는 정수의 개수를 출력한다.
	static int size (ArrayList<Integer> list) {
		int value = list.size();
		return value; 
	}
//	empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
	static int empty (ArrayList<Integer> list) {
		if (list.size() == 0) {
			return 1;
		}
		return 0;
	}
//	front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	static int front (ArrayList<Integer> list) {
		if (list.size() >= 1) {
			return list.get(0);
		}
		return -1;
	}
//	back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	static int back (ArrayList<Integer> list) {
		if (list.size() >= 1) {
			return list.get(list.size()-1);
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
