package lianxi;

public class duixiangjicheng {
	private String name;
	private String couses;
	public duixiangjicheng(String name,String couses){
		this.name=name;
		this.couses=couses;
	}
	public void diannao(){
		System.out.println("知识点讲解");
	}
	public String toString(){
		return "姓名:"+this.name+"课程:"+this.couses;
	}

}
