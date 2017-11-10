/**
 * Created by Prasanga Fernando on 11/10/2017.
 */
public class Car {

    private int engineCapacity;
    private int numOfSeats;
    private String model;
    private double acceleration;
    private String make;

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public  void setEngineCapacity(int engineCapacity){
        this.engineCapacity =engineCapacity;
    }

    public int getEngineCapacity(){
        return engineCapacity;
    }


}
