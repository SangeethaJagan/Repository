package week3_Day1;

public class Samsung extends AndroidTV {

	

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Play Video");
		
	}
	
	public static void main(String[] args) {
		
		Samsung S=new Samsung();
		S.openApp();
		S.playVideo();
	}

}
