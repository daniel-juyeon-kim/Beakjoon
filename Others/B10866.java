package Main;

import java.util.*;



public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		StringBuilder sb = new StringBuilder ();
		
		int order = in.nextInt();
		
		ArrayList <Integer> list = new ArrayList <> ();
		
		for (int i = 0; i < order; i++) {
			String str = in.next();
			
			switch(str){
	//		push_front X: 정수 X를 덱의 앞에 넣는다.
			    case "push_front" :
			    	list.add(0, in.nextInt());
			    	break;
	//		push_back X: 정수 X를 덱의 뒤에 넣는다.
			    case "push_back" : 
			         list.add(in.nextInt());
			    	break;  
	//		pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			    case "pop_front" : 
			    	if (list.isEmpty()) 
			    		sb.append(-1 + "\n");
			    	else {
			    		sb.append(list.get(0) + "\n");
			    		list.remove(0);
			    	}
			        break;  
	//		pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			    case "pop_back" : 
			    	if (list.isEmpty()) 
			    		sb.append(-1 + "\n");
			    	else {
			    		sb.append(list.get(list.size()-1) + "\n");
			    		list.remove(list.size()-1);
			    	}
			        break;  
	//		size: 덱에 들어있는 정수의 개수를 출력한다.
			    case "size" : 
			         sb.append(list.size() + "\n");
			        break;  
	//		empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
			    case "empty" : 
			         if (list.isEmpty())
			        	 sb.append(1+"\n");
			         else
			        	 sb.append(0+"\n");
			        break;  
	//		front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			    case "front" : 
			         if (list.isEmpty())
			        	 sb.append(-1+"\n");
			         else
			        	 sb.append(list.get(0)+"\n");
			        break;  
	//		back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			    case "back" : 
			    	 if (list.isEmpty())
			    		 sb.append(-1+"\n");
			         else
			        	 sb.append(list.get(list.size()-1)+"\n");
			        break;  
			}
		}
		System.out.println(sb);
	}	
}