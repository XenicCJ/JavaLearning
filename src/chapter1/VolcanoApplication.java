package chapter1;

public class VolcanoApplication {
	//����һ����̬��main������������VolcanoRobot������
	public static void main(String[] args) {
		//����һ��VolcanoRobot��Ķ���
		VolcanoRobot dante=new VolcanoRobot();
		//�趨dante���������ֵ
		dante.speed=2;
		dante.temperature=510;
		dante.status="exploring";
		
		//ʹ�ö�����չ�ֶ�������
		dante.showAttributes();
		System.out.println("Change speed to 3");
		dante.speed=3;
		dante.showAttributes();
		System.out.println("Change temperature to 670");
		dante.temperature=670;
		dante.showAttributes();
		System.out.println("Checking the temperature");
		//ʹ�ö���������¶Ȳ��޸Ķ�������
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
