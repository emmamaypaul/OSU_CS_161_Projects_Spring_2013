
public class Lab3OODesign //public class PolymorphismExample
{
	
		/*
		 * Animal interface defines what it means to be an Animal (clearly not an exhaustive definition of an animal) 
		 *
		 */
	public interface Animal 
	{
		public String talk(); //same method name as methods in child classes 
	}
	
	//Dog class is capable of doing all the actions that define an Animal according to my interface 
	public class Dog implements Animal 
	{
		@Override //marks when a method implements an interface, also use it when you override a method so the compiler warns you if you misspelled, ect. 
		public String talk()
		{
			return "Dog says Woof! Woof!";
		}
	}
	
	//cat class is also capable of doing all the actions that define an Animal according to my interface 
	public class Cat implements Animal //subclass implements superclass
	{
		@Override
		public String talk () //String paramaters for return 
		{
			return "Cat says Meow!";
		}
	}
	
	public Lab3OODesign()//public Polymorphism Example 
	{
		Animal[] animals = new Animal[2]; //array called animals with data type Animal and 2 elements 
		animals[0] = new Cat();
		animals[1] = new Dog();
		
		//you may not be familiar with a for loop that looks like this, it is sometimes referred to as a for-each loop, and it essentially
		//attempts to take each Animal in the animals array (or iterator, which will learn about later) and perform the body of the loop 
		//(similar to a longer definition of a for loop 
		for (Animal a : animals) //for loop that goes through animals array 
		{
			System.out.print(a.talk()); //
		}
	}
	
	/* 
	 * main creates an array of Animals and fills it with the different kinds of Animals that I have defined 
	 * When you run this, the output should be: 
	 * 		Cat says Meow!
	 * 		Dog says Woof! Woof! 
	 */
	
	public static void main(String[] args)
	{
		Lab3OODesign pe = new Lab3OODesign();
	}

/*
	
	//The next example shows polymorphism and inheritance 
	
public interface Drivable //new interface 
{
	//these methods do not have a body definition 
	void stop();
	void accelerate (double acceleration);
	void brake (double acceleration); //it's okay the method has the same parameter name as above because the signature (name and paramater type)
	//is what Java uses to determine which method to call 
}
	


public class Vehicle implements Drivable //must have all the methods from the interface or else it won't compile 
{
	//notice variables are protected, so subclass can access the variables 
	protected double speed;
	protected int numberOfWheels; 
	protected int numberOfEntries; 
	
	public Vehicle() //same as class name 
	{
		speed = 0.0;
		numberOfWheels = (int)(Math.random()*4)*2; 
		numberOfEntries = (int)(Math.random()*7); //for 0-6 entries, so 7 total 
		
	}
	
	public void stop() //method to stop vehicle 
	{
		speed = 0.0;
	}
	
	public void accelerate(double acceleration)//method to speed up the vehicle 
	{
		speed += acceleration;
	}
	
	public void brake(double brakingPower)//method to slow vehichle down 
	{
		speed-= brakingPower;
	}
	
}

public interface SmartDrivable extends Drivable //extends in order to add new methods? 
{
	int getNumberOfWheels();
	int getNumberOfEntries();
	double getCurrentSpeed();
}

public class SmartVehicle extends Vehicle implements SmartDrivable 
{
	public SmartVehicle()
	{
		super(); //uses the constructor of the Vehicle, parent class
	}
	
	public int getNumberOfWheels()
	{
		return numberOfWheels;
	}
	
	public int getNumberOfEntries() //smart vehicle can tell how many entries it has 
	{
		return numberOfEntries;
	}
	
	public double getCurrentSpeed() //can tell how fast it's going 
	{
		return speed;
	}
	
	//my SmartVehicle is somehow better at accelerating than the standard Vehicle, as reflected in my overriding accelerate method
	@Override //this allows the SmartVehicle to use this accelerate method, which is what you want for a faster smartvehivle 
	public void accelerate(double accel)
	{
		speed += 2*accel; //this method overrides the parent method, which is what you want because it is more appropriate for a faster car  
	}
	
	public void brake()//doesn't take a double like the parent class does, which is called overloading (ie using the same method name for two or more 
	//methods but using different arguments or parameter lists 
	{
		speed -= 1; //breaks by reducing speed by 1, and this method overloads the break method 
	}

}
*/

}








	
	
	
	

