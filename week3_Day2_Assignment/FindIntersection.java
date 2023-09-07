package week3_Day2_Assignment;

public class FindIntersection {

	public void Intersection()
	{
		int[] a1= {3,2,11,4,6,7};
		int[] a2= {1,2,8,4,9,7};
		
		int len1, len2;
		len1=a1.length;
		len2=a2.length;
		
		System.out.println("Intersection of Two Strings");
		
		for (int i=0;i<len1;i++)
		{
			for (int j=0;j<len2;j++)
			{
				if(a1[i]==a2[j])
				{
					System.out.println(a1[i]);
					
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		FindIntersection FI=new FindIntersection();
		FI.Intersection();
	}
}
