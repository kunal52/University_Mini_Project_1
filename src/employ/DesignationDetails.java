package employ;

public class DesignationDetails {

	char deg_code;
	String designation;
	int da;
	
	
	public DesignationDetails(char deg_code, String designation, int da) {
		super();
		this.deg_code = deg_code;
		this.designation = designation;
		this.da = da;
	}
	
	
	public char getDeg_code() {
		return deg_code;
	}
	
	public String getDesignation() {
		return designation;
	}
	public int getDa() {
		return da;
	}
	
	
	
	
}
