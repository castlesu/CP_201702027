package 과제2;

class Student
{
	public String name;
	public int coden;
	public String department;
	public int grade;
	public int credithour;
	
	public Student(String name,int coden,String department,int grade,int credithour)
	{
		this.name=name;
		this.coden=coden;
		this.department=department;
		this.grade=grade;
		this.credithour=credithour;
	}
	
}
class Undergraduate extends Student
{
	public String circle;
	
	public Undergraduate(String name,int coden,String department,int grade,int credithour,String circle)
	{
		super(name,coden,department,grade,credithour);
		this.circle=circle;
	}
	public void print()
	{
		System.out.println("학부생");
		System.out.println("이름:"+name+"\n"+"학번:"+coden+"\n"+"학과:"+department+"\n"+"학년:"+grade+"\n"+"이수학점:"+credithour+"\n"+
				"동아리:"+circle);
	}
}
class Postgraduate extends Student
{
	public String assist;
	public double scholarship;
	
	public Postgraduate(String name,int coden,String department,int grade,int credithour,String assist,double scholarship)
	{
		super(name,coden,department,grade,credithour);
		this.assist=assist;
		this.scholarship=scholarship;
	}


	public void printAE()
	{
		System.out.println("대학원생");
		System.out.println("이름:"+name+"\n"+"학번:"+coden+"\n"+"학과:"+department+"\n"+"학년:"+grade+"\n"+"이수학점:"+credithour+"\n"+
	 	             "조교유형:"+assist+"\n"+"장학금비율:"+scholarship);
	}
     
	
}