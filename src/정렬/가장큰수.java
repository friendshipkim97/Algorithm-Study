package ����;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import ����.K��°��.Solution;

public class ����ū�� {

	public ����ū��() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

		Solution solution = new Solution();
		int[] numbers= {6, 10, 2};
		//int[] numbers= {1, 2, 3, 4};
	//	int[] numbers= {0, 0, 0};
		
		System.out.println(solution.solution(numbers));
	}
	
	static class Solution {
	public String solution(int[] numbers) {
		String answer = new String();
		String str_numbers[] = new String[numbers.length];
		
		for(int i=0; i<str_numbers.length; i++) {
			str_numbers[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(str_numbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2); // ����� ��� �� ����� ��ġ�� �״�� ��, ������ ��� �� ����� ��ġ�� �ٲ۴�. 
			}
		});
		
		
		 for (int i=0; i<numbers.length; i++)
	            answer += str_numbers[i];

	        return answer.charAt(0) == '0' ? "0" : answer;
	        
	}
	}
}
