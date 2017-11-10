/**
 * Created by Prasanga Fernando on 11/10/2017.
 */
public class Main {

    public static void main(String[] args) {

        Car mustangGT = new Car();
        Car GTR = new Car();

        mustangGT.setAcceleration(4.5);
        mustangGT.setEngineCapacity(5000);
        mustangGT.setMake("Ford");
        mustangGT.setModel("Mustang GT");
        mustangGT.setNumOfSeats(4);

        GTR.setMake("Nissan");
        GTR.setModel("GTR Nismo");
        GTR.setNumOfSeats(4);
        GTR.setEngineCapacity(6700);
        GTR.setAcceleration(2.7);

        System.out.print(mustangGT.getMake()+" "+ mustangGT.getModel() +"\n");
        System.out.println(mustangGT.getEngineCapacity()+" cc");
        System.out.println(mustangGT.getAcceleration()+" sec");
        System.out.println(mustangGT.getNumOfSeats()+" seats");
        System.out.println();

        System.out.print(GTR.getMake()+" "+ GTR.getModel() +"\n");
        System.out.println(GTR.getEngineCapacity()+" cc");
        System.out.println(GTR.getAcceleration()+" sec");
        System.out.println(GTR.getNumOfSeats()+" seats");
    }
}
