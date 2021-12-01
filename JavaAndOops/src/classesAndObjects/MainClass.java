package classesAndObjects;


class Cat{
	 boolean hasFurr;
	 String color,breed,name;
	 int legs,eyes,ear;
	 
	 public void walk(int a, int b) {
		 if (a>b) {
			
		 System.out.println("Cat is walking");}
			 if(a==b) {
			System.out.println("Cat is sleeping");	 
			 }
		 
		 else {
		 System.out.println("cat is running");
		 }
		 
		 }
	

	 public void eat() {
		 System.out.println("Cat is eating");
	 }
	 public void description() {
		 System.out.println("my cat has" + legs + "legs ," + eyes+ "eyes" + ear + "ear.");
		 System.out.println("my cat has" + breed + "breed");
	 }
}

class Dog{
	boolean hasFurr;
	String color,breed,name;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Dog is walking");
	}
	public void eat() {
		System.out.println("Dog is eating");
	}
	public void description() {
		System.out.println("my dog name is " +name+ " he had " + legs + " legs his color is " + color + "he belogs to " +breed );
	}

 }

class Mobile{
	String Company, name,color,os;
	int price,size;
	
	public void start() {
		System.out.println("Mobile is Starting");
	}
	public void off() {
		System.out.println("phone is turning off");
	}
	public void description() {
		System.out.println("My phone name is " + name+ "his brand name is " + Company+ "his color is " + color + "his size  is " + size + "phone is working on latest os" + os + "price is " +price);
	}
}


public class MainClass {

	public static void main(String[] args) {
		
		{ //Cat1 object and calling function
			
		Cat Cat1 = new Cat();
		
		Cat1.legs = 4;
		Cat1.ear  = 2;
		Cat1.eyes = 2;
		Cat1.breed =" Tara";
		
		Cat1.walk(4,4);
		Cat1.eat(); 
		
		Cat1.description();
		}
		
		
		{ // Dog calling function and object.
			Dog Dog1 = new Dog();
			
			Dog1.legs = 4;
			Dog1.breed= "GermanShefer";
			Dog1.name = "Jabra";
			Dog1.color = "black";
			Dog1.eyes = 2;
			
			
			Dog1.eat();
			Dog1.walk();
			Dog1.description();	
			
		}
	
	{ // Mobile  object and calling function;
		Mobile Samsung = new Mobile();
		
		Samsung.color= "black";
		Samsung.Company= "Samsung";
		Samsung.name= "Galaxy S10";
		Samsung.os= "Piea 11";
		Samsung.size = 5;
		Samsung.price= 50000;
		
		Samsung.start();
		Samsung.off();
		Samsung.description();
	}
	
	Mobile apple = new Mobile();
	apple.color= "red";
	apple.Company= "apple";
	apple.name = "iphone";
	apple.os = "ios11";
	apple.size= 6;
	apple.price= 150000;
	
	apple.description();
	apple.start();
	apple.off();
	
	
}
	
}
