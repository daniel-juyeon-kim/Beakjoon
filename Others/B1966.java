package Main;

import java.util.*;

public class Main {
    static Scanner in = new Scanner (System.in);
	static ArrayList <Integer> q = new ArrayList <> ();
	
	public static void main(String[] args) {
       
    	int testcase = in.nextInt();
    	
    	for (int i = 0 ; i < testcase ;i++) {
    		
    		int paper = in.nextInt();
    		int qIndex = in.nextInt();
    		q.clear();
    		for (int cntPaper = 0;cntPaper < paper;cntPaper++) {
    			q.add(in.nextInt());
    		}
    		System.out.println(print (q, qIndex));
    		
    	}
    }
	
	static int print (ArrayList <Integer> q, int qIndex) {
		int result = 0;
		
		while (true) {
			// 최대값을 찾음
			int qMax = q.get(0);
			int qMaxIndex = 0;
			for (int searchMax = 0; searchMax < q.size(); searchMax++) {
				if (qMax <= q.get(searchMax)) {
					qMax = q.get(searchMax);
					qMaxIndex = searchMax;
				}
			}
			
			// 최대값을 맨 앞으로
			for (int i = 0;i <= qMaxIndex;i++) {
				if (qIndex == 0 && q.get(0) == qMax) {
					result++;
					return result;
				}
				else if (q.get(0) == qMax) {
					qIndex--;
					result++;
					q.remove(0);
				}
				else {
					// 리스트가 변함
					qIndex--;
					q.add(q.get(0));
					q.remove(0);
					if (qIndex == -1) {
						qIndex = q.size()-1;
					}
				}				
			}
		}
		
		
		
	}

}