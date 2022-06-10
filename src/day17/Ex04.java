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
			System.out.println("1.등록 2.출력 3.검색");
			int num = scan.nextInt();
			switch(num) {
			case 1:
				StInfo s = new StInfo();
				System.out.println("이름 입력");
				name = scan.next();
				System.out.println("나이 입력");
				age = scan.nextInt();
				s.setName(name);
				s.setAge(age);
				
				arr.add(s);
				break;
			case 2:
				for(int i =0;i<arr.size();i++) {
				StInfo ss = arr.get(i);
				System.out.println("이름 : "+ss.getName());
				System.out.println("나이 : "+ss.getAge());				
				}				
				break;
			case 3:
				System.out.println("찾을 이름 입력");
				name = scan.next();
				for(StInfo st : arr) {
					if(st.getName().equals(name)) {
						System.out.println("이름 : "+st.getName());
						System.out.println("나이 : "+st.getAge());
					}
				}
				break;
			}
		}
	}

}
