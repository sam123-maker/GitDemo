
public class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat drinks milk");
	}
	public static void main(String[] args){
		
		Cat c=new Cat();
		c.eat();
	}
	
	

}
