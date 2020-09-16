package lianxi;

public class testjicheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		softteather zhang=new softteather("张老师", "电脑");
		heibanteather wang=new heibanteather("王老师", "黑板");
		zhang.diannao();
		zhang.fanfa();
		System.out.println(zhang.toString());
		wang.diannao();
		wang.fafa();
		System.out.println(wang.toString());

	}

}
