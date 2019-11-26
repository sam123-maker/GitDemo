
public class Dog extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eats bones");
	}
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.eat();
	}
	
	

}
