package lianxi;

public class testduixiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duixiang xiaohong=new duixiang();
		duixiang xiaozhang=new duixiang("小张", 22);
		xiaohong.setAge(6);
		xiaohong.setName("小红");
		xiaohong.speak();
		duixiang.city="b城";
		System.out.println(xiaohong.toString());
		System.out.println(xiaozhang.toString());

	}

}
