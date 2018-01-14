package employ;


public class Utils {

	
	
	public static EmployDetails getDetails(int empid)
	{
		
		EmployDetails[]employDetails=new EmployDetails[7];
		employDetails[0]=new EmployDetails(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
		employDetails[1]=new EmployDetails(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
		employDetails[2]=new EmployDetails(1003, "Rahul", "13/11/2008", 'k', "Acct", 10000, 8000, 1000);
		employDetails[3]=new EmployDetails(1001, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000);
		employDetails[4]=new EmployDetails(1002, "Ranjan", "16/07/2005", 'm', "Emgg", 50000, 20000, 20000);
		employDetails[5]=new EmployDetails(1003, "Suman", "01/01/2000", 'e', "Manufacturer", 23000, 9000, 4400);
		employDetails[6]=new EmployDetails(1001, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000);
		
		
		switch (empid) {
		case 1001:return employDetails[0];
		case 1002: return employDetails[1];
		case 1003:return employDetails[2];
		case 1004: return employDetails[3];
		case 1005:	return employDetails[4];
		case 1006: return employDetails[5];
		case 1007:return employDetails[6];
		
		default:
			/*System.out.print("There is no employ with id "+empid);*/
			return null;
		}
		
	}
	
	public static DesignationDetails getDesignationDetails(char des)
	{
		switch(des)
		{
		case 'e':return new DesignationDetails('e', "Engineering", 20000);
		case 'c':return new DesignationDetails('c', "Consultant", 32000);
		case 'k':return new DesignationDetails('k', "Clerk", 12000);
		case 'r':return new DesignationDetails('r', "Receptionalist", 15000);
		case 'm':return new DesignationDetails('m', "Manager", 40000);
	
		default: return null;
		
		
		}
	}
	
}
