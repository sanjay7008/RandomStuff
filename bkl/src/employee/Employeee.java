package employee;

public class Employeee {
	private employeeQUALIFICATION qual;
	private String name;
	
	public Employeee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employeee(employeeQUALIFICATION qual, String name) {
		super();
		this.qual = qual;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employeee [qual=" + qual + ", name=" + name + "]";
	}
	public employeeQUALIFICATION getQual() {
		return qual;
	}
	public void setQual(employeeQUALIFICATION qual) {
		this.qual = qual;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	
}
