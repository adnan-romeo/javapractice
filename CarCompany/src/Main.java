abstract class Person{
    private String name;
    private String ID;
    Person(String name,String ID){
        this.name=name;
        this.ID=ID;
    }
    String getName(){
        return name;
    }
    String getID(){
        return ID;
    }
    void displayInfo(){
        System.out.println(name+" "+ ID);
    }
}
class Passenger extends Person{
    private String destination;
    Passenger(String a,String b,String c){
        super(a,b);
        this.destination=c;
    }
    void displayInfo(){
        System.out.println(getName()+" "+ getID()+ " "+ destination);
    }

}

class Driver extends Person{
    private String licenseNumber;

    Driver(String name,String ID,String licenseNumber){
        super(name,ID);
        this.licenseNumber=licenseNumber;
    }
    void displayInfo(){
        System.out.println(getName()+" "+ getID()+ " "+ licenseNumber);
    }
}
class Vehicle implements Trackable{
    private String vehicleNumber;
    private String type;
    private Driver driver;
    private Passenger[] passengers;
    private int passengersCount;

    Vehicle(String vehicleNumber,String type,Driver driver){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.driver= driver;
        this.passengers=new Passenger[10];

    }

    void addPassenger(Passenger p){
        passengers[passengersCount]=p;
        passengersCount++;

    }

    @Override
    public void trackVehicle() {
    }
    public void showVehicleInfo(){
        System.out.println(vehicleNumber);
        System.out.println(type);
        driver.displayInfo();
    }
}

class TransportCompany{
    private String companyName;
    private Passenger[] passengers;
    private Vehicle[] vehicles;
    private int passengerCount;
    private int vehicleCount;

    TransportCompany(String companyName){
        this.companyName=companyName;
        this.passengers= new Passenger[10];
        this.vehicles= new Vehicle[10];
    }
    void addPassenger(Passenger p){
        passengers[passengerCount]=p;
        passengerCount++;
    }
    void addVehicle(Vehicle v){
        vehicles[vehicleCount]=v;
        vehicleCount++;
    }
    void showCompanyInfo(){
        System.out.println(companyName);
        System.out.println(passengerCount);
        System.out.println(vehicleCount);

    }
}

interface Trackable {
    void trackVehicle();
}

public class Main {
    public static void main(String[] args){
 TransportCompany tc1= new TransportCompany("Adnan Travels");
 Driver p1= new Driver("Sazed","1234","Madafada");
 Passenger ps1= new Passenger("Romeo","1234","Shahbagh");
        Passenger ps2= new Passenger("Tanzil","1234","Shahbagh");
 Vehicle v1= new Vehicle("6678","Bus",p1);
tc1.addPassenger(ps1);
tc1.addPassenger(ps2);
tc1.addVehicle(v1);
tc1.addVehicle(v1);
tc1.showCompanyInfo();
v1.showVehicleInfo();



    }
}