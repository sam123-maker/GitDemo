
public class Firefoxdriver extends Webdriver {

	
	
	@Override
	public void getwebdriver() {
		// TODO Auto-generated method stub
		System.out.println("get firefox driver method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Firefoxdriver F=new Firefoxdriver();
		F.getwebdriver();
		
		 Chromedriver C=new  Chromedriver();
				 C.getwebdriver();
		
		

	}

}
