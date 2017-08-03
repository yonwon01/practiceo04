package prob04;

public class Depart extends Employee {
	private String department;
	public Depart(String name,int salary,String depart) {
		super(name,salary);
		this.department=depart;
	}
	
	public void getInformation() {
		
		System.out.printf("이름 :%s  연봉 :%d  부서 :%s",getName(),getSalary(),department);
	}
	
}
