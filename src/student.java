abstract class University{
   
public abstract void printInfo();
       

}

class Department extends University{

    String DeptId;
    String Location;
    int TotalStudent;

    public Department(String a,String b,int c){
        DeptId=a;
        Location=b;
        TotalStudent=c;
    }
   public void printInfo(){

    System.out.println("DeptID:"+DeptId+" "+"Location:"+Location+" "+"Total Students:"+ TotalStudent);

   }
}






public class student {
   public static void main(String[] args){

Department SWE=new Department("35","DSS",50000);
Department CSE=new Department("15","Changao",70000);
SWE.printInfo();
CSE.printInfo();

    }
    
}
