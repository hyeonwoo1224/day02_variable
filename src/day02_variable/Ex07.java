package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner�� �߰��Ͽ� �Է¹ޱ�
		int age;
		// ���̴� ���ڷ� ����
		String name;
		// ���̴� ���ڿ��� ����
		System.out.print("�̸� �Է� : ");
		name = input.next();
		// next�� �Է¹ޱ�
		System.out.print("���� �Է� : ");
		age = input.nextInt();
		// nextInt�� �Է¹ޱ�
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
