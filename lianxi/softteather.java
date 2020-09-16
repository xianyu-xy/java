package lianxi;

public class softteather extends duixiangjicheng{

	public softteather(String name, String couses) {//调用父类的构造方法
		super(name, couses);
		// TODO Auto-generated constructor stub
	}
	public void fanfa(){
		System.out.println("电脑教课");
		super.diannao();//调用父类的普通方法
	}

}
