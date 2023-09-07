package org.inter;

public class Automation extends MultipleLanguage implements Language, TestTool{

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Language : Ruby (Execution class-extended MultipleLanguage)");
		
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Tool : Selenium(Execution class-implemented TestTool)");
		
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Language : Java (Execution Class-implemented Language)");
	}
	
	public static void main(String[] args) {
		Automation A= new Automation();
		A.selenium();
		A.python();
		A.java();
		A.ruby();
	}
}
