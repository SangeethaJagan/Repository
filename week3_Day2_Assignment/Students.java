package week3_Day2_Assignment;

public class Students {

	
	public void getStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("Details of Student");
      
	}
	public void getStudentInfo(int RegId)
	{
		System.out.println("Certificate Reg No: "+RegId);
	}
	
	private void getStudentInfo(int RegId, String StuName) {
		// TODO Auto-generated method stub
		System.out.println("Register No : "+RegId);
		System.out.println("Student Name : "+StuName);

	}
	
	private void getStudentInfo(String EmailId, long PhoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Email Id : "+EmailId);
		System.out.println("Phone Number : "+PhoneNumber);

	}
	
	public static void main(String[] args)
	{
		Students S=new Students();
		int RegNo=12345;
		int CertiRegNo=767676;
		String Name="Sangeetha";
		String Email="ssangitha02@gmail.com";
		long mobile=7708768258l;
		
		S.getStudentInfo();
		S.getStudentInfo(CertiRegNo);
		S.getStudentInfo(RegNo, Name);
		S.getStudentInfo(Email, mobile);
		
	}


}

