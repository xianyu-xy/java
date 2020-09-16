package lianxi;

import java.util.Scanner;

public class tiaojian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		int n=0;
		while(b){
			if(n>=10)
			{
				b=false;
			}
			n++;
		}
		System.out.println(n);
		Scanner scanner=new Scanner(System.in);
		int k=scanner.nextInt();
		String str="null";
		if(k<0|k>100){
			System.out.println("不合法");
		}
		else if(k>90&k<100){
			System.out.println("优秀");
		}else{
			System.out.println("不及格");
		}
		
		
	}

}
