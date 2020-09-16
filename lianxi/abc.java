package lianxi;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		System.out.println("请输入：");
		for(int m=0;m<3;m++)
		{
			if(m==0)
			{
				System.out.println("a的值：");
			arr[m]=sc.nextInt();
			}
			if(m==1)
			{
				System.out.println("b的值：");
			arr[m]=sc.nextInt();
			}
			if(m==2)
			{
				System.out.println("c的值：");
			arr[m]=sc.nextInt();
			}
			
		}
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				if(arr[i]>arr[j]){
			   int m = arr[i];
			   arr[i]=arr[j];
				arr[j]=m;
				}
			}
		}
		System.out.println("由小到大排列");
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
