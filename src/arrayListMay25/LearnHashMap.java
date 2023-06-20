package arrayListMay25;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String args[]) throws Exception{
        LearnHashMap obj = new LearnHashMap();
        obj.hashMapEmployeeDetails();

    }
    // accessing the HashMap

    public void hashMapEmployeeDetails(){
        HashMap<Integer,String> employeeDetails = new HashMap<>();
        employeeDetails.put(1,"Vignesh");
        employeeDetails.put(2,"Dhana");
        employeeDetails.put(3,"Dhanavignesh");
        employeeDetails.put(4,"Chandrasekaran");
        employeeDetails.put(5,"CDVignesh");
        employeeDetails.put(6,"CDV");

        System.out.println(employeeDetails);
    }


}
