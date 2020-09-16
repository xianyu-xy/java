package lianxi;

import java.util.ArrayList;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nihao");
		ArrayList<String> arraylist=new ArrayList<String>();//无指定空间
		arraylist.add("sdsf");//直接插入
		arraylist.add("sdsfds");
		System.out.println(arraylist.toString());//arraylist直接有的方法
		Object[] a=arraylist.toArray();
		for(Object o:a){
			System.out.println(o);
		}

	}

}
