package lianxi;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Human zhangsan=new Human("张三", "男", 20, "北京");
		/*a.name="小王";
		a.addr="四川";
		a.age=20;
		a.sex="男";
		System.out.println(a.name+"你在干什么");
		System.out.println(a.getState(12));*/
		//System.out.println(zhangsan.toString());
		//System.out.println(zhangsan.name);
		//zhangsan.work();
		/*String[] na1=new String[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
		 na1[i]=sc.nextLine();
		}*/
		String na="asf65s6g893s3";//把数字字符分离开
	    char[] ch1=new char[20];
	    char[] shuzi=new char[20];
	    System.out.println("字母");
		for(int i=0;i<na.length();i++){
			char ch=na.charAt(i);//根据索引位置取字符
			if(ch>='A'&&ch<'z'){
			    ch1[i]=ch;
				System.out.print(ch1[i]);
			}
		}
	    System.out.println("\n");
		System.out.println("数字");
	    for(int i=0;i<na.length();i++){
			char ch=na.charAt(i);//根据索引位置取字符
			if(ch<'A'){
		shuzi[i]=ch;
		System.out.print(shuzi[i]);
		
	}

}   
	System.out.println("\n");
    System.err.println("随机数字");
	Double suiji=Math.random()*26+65;//产生随机数
	System.out.println(suiji);
	System.out.println("\n");
    System.err.println("随机字母");
    int zimu=(int)(Math.random()*26+65);//产生随机数
    System.out.println((char)zimu);
	System.out.println("\n");
    System.err.println("以逗号分隔");
    String ids="12,12,32,56,23,66,rrt,ry,454";
    String[] id=ids.split(",");//以逗号分隔数字
    for(int i=0;i<id.length;i++){
    	System.out.println(id[i]);
    }
    
    
}
}