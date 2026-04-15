class Car{
    String CarName;
    String CarColor;

    Car(String a, String b){
        CarName=a;
        CarColor=b;
    }
    String getcardetails(){
        return CarName+" Color " +CarColor;
    }
}

class Driver {
    String DriverName;
    Car carDrives;

    Driver(String a, String b, String c) {
        DriverName = a;
        carDrives = new Car(b, c);
    }

    String DriverDetails() {
        return DriverName + " Drives " + carDrives.getcardetails();
    }
}
public class Main{
    public static void main(String[] args){
        Driver d1= new Driver("Sazed","Lambo","Black");

                System.out.println(d1.DriverDetails());
    }
        }

