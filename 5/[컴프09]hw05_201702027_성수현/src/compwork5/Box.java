package compwork5;
import java.util.Scanner;


public class Box {
	private int wth = 0,lth = 0,high=0;
	
	
	public int getWth()
	{
		return wth;
	}
	public void setWth(int w)
	{
		wth = w;
	}
	public int getLth()
	{
		return lth;
	}
	public void setLth(int l)
	{
		lth = l;
	}
	public int getHigh()
	{
		return high;
	}
	public void setHigh(int h)
	{
		high = h;
	}
	public int getVolume()
	{
		int volume = wth*lth*high;
		return volume;
	}

	private void print()
	{
		Scanner input = new Scanner(System.in);
		System.out.println(wth);
		System.out.println(lth);
		System.out.println(high);
	}
	
		

	

}
