package co.yedam.inherit;
/*
 * Bus -> Vehicle, Taxi -> Vehicle
 */
public class DriveExample {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(null);//Vehicle 
		
	}
}	
