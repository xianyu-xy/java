package lianxi;

import java.util.Scanner;

public class isswitch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int k1;
		do{
		System.out.println("请输入");
		
		k1=scanner.nextInt();
		switch(k1){
		case 1:
			System.out.println("你好");
			break;
		case 2:
			System.out.println("帅哥");
			break;
		case 3:
			System.out.println("美女");
			break;
		
		}
		}while(k1!=0);System.out.println("你已经退出选择");
	}
}
