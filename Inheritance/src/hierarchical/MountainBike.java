package hierarchical;

public class MountainBike extends Bike {
	private int gear;
	private int seatHeight;
	
	public MountainBike()
	{
		
	}
	public MountainBike(int modelno, String brand, float price,int gear,int seatHeight)
	{
		//super(modelno,brand,price);
		this.gear=gear;
		this.seatHeight=seatHeight;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSeatHeight() {
		return seatHeight;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	
}
