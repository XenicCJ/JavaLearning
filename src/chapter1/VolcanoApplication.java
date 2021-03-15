package chapter1;

public class VolcanoApplication {
	//定义一个静态的main方法，供所有VolcanoRobot对象共享
	public static void main(String[] args) {
		//创建一个VolcanoRobot类的对象
		VolcanoRobot dante=new VolcanoRobot();
		//设定dante对象的属性值
		dante.speed=2;
		dante.temperature=510;
		dante.status="exploring";
		
		//使用对象函数展现对象属性
		dante.showAttributes();
		System.out.println("Change speed to 3");
		dante.speed=3;
		dante.showAttributes();
		System.out.println("Change temperature to 670");
		dante.temperature=670;
		dante.showAttributes();
		System.out.println("Checking the temperature");
		//使用对象函数检查温度并修改对象属性
		dante.checkTemperature();
		dante.showAttributes();
		
		VolcanoRobot virgil=new VolcanoRobot();
		virgil.status="maintaining";
		virgil.speed=0;
		virgil.temperature=75;
		System.out.println("Checking the attributes of virgil robot");
		virgil.showAttributes();
	}

}
