package chapter1;

public class VolcanoRobot {//定义VolcanoRobot类
	//定义三个属性变量
	String status;
	int speed;
	float temperature;
	
	//定义一个方法用以检查温度属性并做调整
	void checkTemperature() {
		if(temperature>660) {
			status="returning home";
			speed=5;
		}
	}
	
	//定义一个方法展现三个属性
	void showAttributes() {
		System.out.println("status:"+status);
		System.out.println("speed:"+speed);
		System.out.println("temperature:"+temperature);
	}
}
