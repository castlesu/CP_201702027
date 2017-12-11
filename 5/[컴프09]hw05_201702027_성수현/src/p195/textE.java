package p195;

public class textE {
	
	public static void main(String[] args)
	{
	Employee myEp = new Employee();
	
	myEp.setName("성수현");
	myEp.setPhone(1050304952);
	myEp.setMoney(100000000);
	
	System.out.println("직원의 이름은 : " +myEp.getName());
	System.out.println("직원의 전화번호는 : "+ myEp.getPhone());
	System.out.println("직원의 연봉은 : "+myEp.getMoney());
	
	}

}
