package org.system;

public class Desktop extends Computer {
	
	private void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("My Desktop Size : 1280×720(from desktop size)");

	}
	
	public static void main(String[] args) {
		Desktop D=new Desktop();
		D.computerModel();
		D.desktopSize();
	}

}
