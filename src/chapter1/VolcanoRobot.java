package chapter1;

public class VolcanoRobot {//����VolcanoRobot��
	//�����������Ա���
	String status;
	int speed;
	float temperature;
	
	//����һ���������Լ���¶����Բ�������
	void checkTemperature() {
		if(temperature>660) {
			status="returning home";
			speed=5;
		}
	}
	
	//����һ������չ����������
	void showAttributes() {
		System.out.println("status:"+status);
		System.out.println("speed:"+speed);
		System.out.println("temperature:"+temperature);
	}
}
