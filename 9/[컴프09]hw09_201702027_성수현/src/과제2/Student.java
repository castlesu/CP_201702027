package ����2;

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
		System.out.println("�кλ�");
		System.out.println("�̸�:"+name+"\n"+"�й�:"+coden+"\n"+"�а�:"+department+"\n"+"�г�:"+grade+"\n"+"�̼�����:"+credithour+"\n"+
				"���Ƹ�:"+circle);
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
		System.out.println("���п���");
		System.out.println("�̸�:"+name+"\n"+"�й�:"+coden+"\n"+"�а�:"+department+"\n"+"�г�:"+grade+"\n"+"�̼�����:"+credithour+"\n"+
	 	             "��������:"+assist+"\n"+"���бݺ���:"+scholarship);
	}
     
	
}