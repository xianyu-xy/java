package lianxi;

public class Human {
		// TODO Auto-generated method stub
                String hahha;
                String hehehej;
		String name;
		String sex;
		int age;
		String addr;
		public Human(String nam,String se,int ag,String add){
			this.name=nam;
			this.sex=se;
			this.age=ag;
			this.addr=add;
		}
		public void work(){
			System.out.println("工作");
		}
		public void eat(){
			System.out.println("吃饭");
		}//方法参数
		/*public String getState(int time){
			if(time>=0 && time<=24)
				if(time>=8 || time<=17){
					System.out.println("工作");
				}
				else{
					System.out.println("玩耍");
				}
			return null;*/
			public String toString(){
				return this.name+this.sex+this.age+this.addr; 
			}
}
