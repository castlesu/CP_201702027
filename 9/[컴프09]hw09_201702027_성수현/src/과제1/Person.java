package ����1;

class Person 
{
	public String name;
	public String address;
	public int  phone;
	
	public Person(String name,String address , int phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String setName()
	{
		return name;
	}
	public void getName(String n)
	{
		this.name=n;
	}
	public String setAddress()
	{
		return address;
	}
	public void getAddress(String a)
	{
		this.address = a;
	}
	public int setPhone()
	{
		return phone;
	}
	public void getPhone(int p)
	{
		this.phone=p;
	}
	
}

class Customer extends Person
{
	public int cusnumber;
	public int mil;
	

	public Customer(String name,String address , int phone,int cusnumber,int mil)
	{
		super( name, address , phone);
		this.cusnumber=cusnumber;
		this.mil=mil;
	}
	public void Print()
	{
		System.out.println("�� �̸� :"+name+"\n"+
				" �� �ּ�:"+address+"\n"+
				" �ڵ��� ��ȣ:"+phone+"\n"+
				" ����ȣ:"+cusnumber+"\n"+
				" ���ϸ���:"+mil);
	}
	
}

