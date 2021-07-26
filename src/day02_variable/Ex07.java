package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner를 추가하여 입력받기
		int age;
		// 나이는 숫자로 저장
		String name;
		// 나이는 문자열로 저장
		System.out.print("이름 입력 : ");
		name = input.next();
		// next로 입력받기
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		// nextInt로 입력받기
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
