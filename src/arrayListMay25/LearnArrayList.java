package arrayListMay25;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String args[]){
        LearnArrayList obj = new LearnArrayList();
        //obj.arrayListStudentName();
        obj.arrayListEmployeeID();
    }
    //access arraylist by Index
    public void arrayListStudentName(){
        // declaration of array list string type
        ArrayList<String> studentName = new ArrayList<String>();
        studentName.add("vignesh");
        studentName.add("dhana");
        studentName.add("vicky");
        studentName.add("Dhanavignesh");
        studentName.add("Chandrasekaran");
        studentName.add("CDvignesh");
        studentName.add("Dhanavignesh Chandrasekaran");

        System.out.println(studentName);
        // try catch method
        try {
            System.out.println(studentName.get(7));
        }
        catch(Exception e){
            System.out.println("no student name found");
        }

        // reset the value of arraylist
        studentName.set(2,"CDV");
        System.out.println(studentName.get(2));

        System.out.println(studentName);

        studentName.set(4,"vicky");
        System.out.println(studentName);

        // remove data from arraylist
        studentName.remove(6);
        System.out.println(studentName);

        System.out.println(studentName.get(5));

        // using loop iterate the array list

        for(String stName:studentName){
            System.out.println("The Student Name is " +stName);
        }
    }

    public void arrayListEmployeeID(){
        // array list declaration for integer
        ArrayList<Integer> employeeID = new ArrayList<>();
        employeeID.add(12345);
        employeeID.add(67890);
        employeeID.add(13579);
        employeeID.add(24680);
        employeeID.add(15015);


        System.out.println(employeeID);

    }

}
