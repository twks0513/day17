package day17;

import java.util.ArrayList;
import java.util.Scanner;

class StInfo{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}


public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>();
		
		String name;
		int age;
		while(true) {
			System.out.println("1.��� 2.��� 3.�˻�");
			int num = scan.nextInt();
			switch(num) {
			case 1:
				StInfo s = new StInfo();
				System.out.println("�̸� �Է�");
				name = scan.next();
				System.out.println("���� �Է�");
				age = scan.nextInt();
				s.setName(name);
				s.setAge(age);
				
				arr.add(s);
				break;
			case 2:
				StInfo ss = arr.get(0);
				System.out.println("�̸� : "+ss.getName());
				System.out.println("���� : "+ss.getAge());
				ss = arr.get(1);
				System.out.println("�̸� : "+ss.getName());
				System.out.println("���� : "+ss.getAge());
				
				
				break;
			case 3:break;
			}
		}
	}

}