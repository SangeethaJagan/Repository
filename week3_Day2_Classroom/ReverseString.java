package week3_Day2_Classroom;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String input="TestLeaf";
		
		char[] ch=input.toCharArray();
		int len=ch.length;
		
		/*System.out.println("Printing the number in normal order");
		for (int i=0;i<len;i++)
		{
			System.out.println(ch[i]);
	}*/
		
		System.out.println("Printing the number in Reverse order");
		for (int i=len-1;i>0;i--)
		{
			System.out.print(ch[i]);
	}
		
		

}
}
