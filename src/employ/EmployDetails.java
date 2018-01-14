package employ;

public class EmployDetails {


	public EmployDetails(int emp_no, String emp_name, String join_date,
			char deg_code, String dept, int basic, int hea, int it) {
		
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.join_date = join_date;
		this.deg_code = deg_code;
		this.dept = dept;
		this.basic = basic;
		this.hea = hea;
		this.it = it;
	}

	int emp_no;
	String emp_name;
	String join_date;
	char deg_code;
	String dept;
	int basic;
	int hea;
	int it;
	


	public int getEmp_no() {
		return emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public String getJoin_date() {
		return join_date;
	}
	public char getDeg_code() {
		return deg_code;
	}
	public String getDept() {
		return dept;
	}
	public int getBasic() {
		return basic;
	}
	public int getHea() {
		return hea;
	}
	public int getIt() {
		return it;
	}
	
	
	private int calculateSalary()
	{
			DesignationDetails d=Utils.getDesignationDetails(this.deg_code);
			return basic+hea+it+d.da;
	}
	
	public String details()
	{
		DesignationDetails d=Utils.getDesignationDetails(this.deg_code);
		String s="Emp_no\tEmp_name\tDepa\tDesignation\tSalary\n";
		String s1=this.emp_no+"\t"+this.emp_name+"\t\t"+this.dept+"\t"+d.designation+"\t"+calculateSalary();
		return s+s1;
	}
	
	
	
}
