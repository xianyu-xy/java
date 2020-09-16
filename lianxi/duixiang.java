package lianxi;

public class duixiang {
	private String name;
	private int age;
	public static String city="a城";//static静态变量可以直接用0
	public String getName(){
		return this.name;
	}
	public duixiang(){//为对象建立容器空间
	}
	public duixiang(String nam,int ag){
		this.name=nam;
		this.age=ag;
	}
	public void setName(String n){
		this.name=n;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int a){
		if(a<=0){
			System.out.println("输入的年龄不正确");
		}else{
			this.age=a;
		}
	}
	public void speak(){
		System.out.println("我可以讲话");
	}
	public String toString(){
		return "姓名:"+this.name+"年龄:"+this.age+city;
		
	}

}
