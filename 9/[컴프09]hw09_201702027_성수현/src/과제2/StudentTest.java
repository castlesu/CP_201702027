package 과제2;

public class StudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate u =new Undergraduate("성수현",201702027,"컴퓨터공학과",3,1,"유스호스텔");
		Postgraduate p = new Postgraduate("성수현",201702027,"머모과",2,1,"교육조교",0.7);
		
		u.print();
		System.out.println();
		p.printAE();

	}

}
