package Vehicle;

public class bus extends Master {

    private int numberOfPassengers;

    public bus(int model, int engine, String color, int numberOfPassengers) {
        super(model, engine, color);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Bus [numberOfPassengers=" + numberOfPassengers + ", toString()=" + super.toString() + "]";
    }
    
    void busOut() {
        super.Masterout();
        System.out.println("Number of Passengers = " + numberOfPassengers);
    }
}