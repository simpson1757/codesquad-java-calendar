package calendar_project;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// ctrl + shift + m -> 자동 import
		System.out.println("input 2 numbers");
		Scanner sc = new Scanner(System.in);
		
		 // 굳이 splite 함수 안 써도 됨
		 String first_input, second_input;
		 first_input = sc.next();
		 second_input = sc.next();
		 int first = Integer.parseInt(first_input);
		 int second = Integer.parseInt(second_input);
		
//		String inputValue = sc.nextLine();
//		String[] splitedValue = inputValue.split("\\s+");
//		
//		int first = Integer.parseInt(splitedValue[0]);
//		int second = Integer.parseInt(splitedValue[1]);
		
//		int sum_number = first + second;		
//		System.out.println("Those sum of two numbers is " + sum_number);
		
		System.out.printf("sum of %d and %d is %d.", first, second, first + second);
		sc.close();
		
		//입력 : 키보드
		//출력 : 화면에 두 수의 합을 출력한다.
	}

}
