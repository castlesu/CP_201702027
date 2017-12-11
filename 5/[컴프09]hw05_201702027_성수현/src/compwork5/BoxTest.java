package compwork5;

public class BoxTest {

	public static void main(String[] args)
	{
		Box myBox = new Box();
		
		myBox.setWth(10);
		myBox.setLth(20);
		myBox.setHigh(50);
		
		System.out.println("상자의 가로길이는 : "+myBox.getWth());
		System.out.println("상자의 세로길이는 : "+myBox.getLth());
		System.out.println("상자의 높이는 : "+myBox.getHigh());
		System.out.println("상자의 부피는 : "+myBox.getVolume());
		
	}
}
