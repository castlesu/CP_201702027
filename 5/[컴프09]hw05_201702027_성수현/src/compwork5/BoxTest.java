package compwork5;

public class BoxTest {

	public static void main(String[] args)
	{
		Box myBox = new Box();
		
		myBox.setWth(10);
		myBox.setLth(20);
		myBox.setHigh(50);
		
		System.out.println("������ ���α��̴� : "+myBox.getWth());
		System.out.println("������ ���α��̴� : "+myBox.getLth());
		System.out.println("������ ���̴� : "+myBox.getHigh());
		System.out.println("������ ���Ǵ� : "+myBox.getVolume());
		
	}
}
