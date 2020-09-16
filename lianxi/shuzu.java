package lianxi;

import java.util.Scanner;

public class shuzu {

	private static int temp2;

	public static void main(String[] args) {//输入温度数组保存
		// TODO Auto-generated method stub
		int temp;
		double ave;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("请输入");
		for(int i=0;i<7;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		ave=sum/7;
		System.out.println(a[2]);
		System.out.println("平均气温"+ave);
		for(int i=0;i<7;i++){
		System.out.println(a[i]);
		}//倒序
		System.out.println("倒序");
		for(int i=6;i>=0;i--){
			System.out.println(a[i]);
		}
		//比较大小冒泡排序通过相邻元素不断的比较将最小值或者最大值一个一个的遍历出来。
		System.out.println("冒泡排序比较大小");
		for(int j=0;j<7;j++){
			for(int i=0;i<7-j-1;i++){
				if(a[i]<a[i+1]){
					int temp1=a[i];
					a[i]=a[i+1];
					a[i+1]=temp1;
					
				}
			}
		}System.out.println("排序后");
		for(int i=0;i<7;i++){
			System.out.println(a[i]);
		}
	//System.arraycopy(a1,startindex,a2,endindex,length)数组的定向拷贝
		//选择排序将数组的第一个数据作为最大或者最小的值，然后通过比较循环
		System.out.println("选择排序");
		for(int i=0;i<7;i++){
			for(int j=i+1;j<7;j++){
				if(a[i]>a[j]){
			   int m = a[i];
				a[i]=a[j];
				a[j]=m;
				}
			}
		}
		for(int i=0;i<7;i++){
		System.out.println(a[i]);
		}
		System.out.println("这是加强循环");//加强for循环
		int b[]={1,5,6,3,9};
		for(int m:b){
			System.out.println(m);
		}
		//二位数组加强循环遍历
		/*System.out.println("二维数组遍历");
		int sum11=0;
		int nums[][]=new int[4][4];
		for(int x[]:nums)
			for(int y:x){
				System.out.println("数组元素: "+y);
				sum11+=y;
			}*/
		
		/*System.out.println("总和: "+sum);
		int[] a1={22,36,56,66,98,96,45,55};
		int s=96;
		boolean found=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==s){
				found=true;
				break;
			}
			
		}*/
		/*if(found==false){
			System.out.println("没有");
		}else{
			System.out.println("找到");
		}*/
	}

}
