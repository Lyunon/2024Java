package ygh.sec01.exam01;

public class Truck extends Car {
	public double speed;
	Truck(double speed)
	{
		super(10); //car()
		this.speed = speed;
	}
	
	public void ShowSpeed() {
		System.out.println("Truck Speed : " + speed);
	}
}
