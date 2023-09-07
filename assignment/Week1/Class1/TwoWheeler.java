package assignment.Week1.Class1;

public class TwoWheeler {
	
	
		// TODO Auto-generated method stub
    int noOfWheels=2;
    Short noofMirrors=2;
    long chassisNumber=123456779l;
    boolean isPunctured=false;
    String bikeName="TVS Apache";
    double runningKM=11.44;
    
public static void main(String[] args) {
	TwoWheeler T=new TwoWheeler();
	System.out.println("My Bike Details\n");
	System.out.println("No of Wheels: "+T.noOfWheels);
	System.out.println();
	System.out.println("No of Mirrors: "+T.noofMirrors);
	System.out.println();
	System.out.println("Chas is Number: "+T.chassisNumber);
	System.out.println();
	System.out.println("Punctured: "+T.isPunctured);
	System.out.println();
	System.out.println("Bike Name: "+T.bikeName);
	System.out.println();
	System.out.println("Running KM: "+T.runningKM);
	System.out.println();
}

}
