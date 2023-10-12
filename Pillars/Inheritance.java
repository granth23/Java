class Bicycle {
	public int gear;
	public int speed;

	public Bicycle(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
		// System.out.println(toString());
	}

	public String toString()
	{
		return ("No of gears are " + gear + "\n"
				+ "speed of bicycle is " + speed) + "\n";
	}
	public void test1(){
		System.out.println(toString());
	}
}

class MountainBike extends Bicycle {

	public int seatHeight;

	public MountainBike(int gear, int speed,
						int startHeight)
	{
		super(gear, speed);
		seatHeight = startHeight;
        // System.out.println(super.toString());
	}

	public void test2(){
		System.out.println(super.toString());
	}

	@Override public String toString()
	{
		return (super.toString() + "seat height is "
				+ seatHeight + "\n");
	}
}

public class Inheritance {
	public static void main(String args[])
	{
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
		mb.test1();
	}
}
