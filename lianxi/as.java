package lianxi;

import java.util.Scanner;
//二分法
public class as {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(-2>>1);
		int a[]={1,3,4,6,7,9,12,15,17};
		Scanner sc=new Scanner(System.in);
		int low=0;
		int max=a.length-1;
		while(low<max){
			int b=sc.nextInt();
			int middle=(max - low) / 2 + low;//(low+max)/2;
			if(a[middle]>b){
				max=middle-1;
			}else if(a[middle]<b){
				low=middle+1;
			}else {
			System.out.println("找到元素在下标为："+middle);
			System.out.println(a[middle]);
			}
		}
	}
}