//package Vehicle;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Master vehicle =new Master(2010,999,"red");
//		
//		System.out.println(vehicle.toString());
//		
//		vehicle.Masterout();
//		
//		bike b =new bike(2010,99,"blue","Sports");
//		
//		System.out.println(b.toString());
//		
//		b.bikeout();
//	}
//
//}
package Vehicle;

public class Main {

    public static void main(String[] args) {
    	
    	Master vehicle = new Master(2010, 999, "red");
        System.out.println(vehicle.toString());
        vehicle.Masterout();
        
        bike b = new bike(2010, 99, "blue", "Sports");
        System.out.println(b.toString());
        b.bikeout();
        
        bus bus = new bus(2015, 5000, "yellow", 50);
        System.out.println(bus.toString());
        bus.busOut();
        
        Car car = new Car(2022, 1500, "black", "Diesel");
        System.out.println(car.toString());
        car.carOut();
    }
}
