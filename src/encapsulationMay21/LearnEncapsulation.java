package encapsulationMay21;

import java.sql.SQLData;
import java.util.Date;

public class LearnEncapsulation {

    // place where at&t keeping private data for all customers
    private int mobileData;
    private float hike;


    /// getter method


    public float getHike() {
        return hike;
    }

    public int getMobileData(){
        return mobileData;
    }

    // setter method

    public void setHike(int empID, Date DOB,String PW){

        this.hike = getHikeDataFromDatabase(empID,DOB,PW);
    }
    public void setMobileData(int mobileNumber,String code){

        this.mobileData = getTheDataFromPrivateDatabase(mobileNumber,code);
    }

    public float getHikeDataFromDatabase(int mobileNumber, Date DOB, String password){

        int individualHike = 0;
        return 8.2f;
    }
    public int getTheDataFromPrivateDatabase(int mobileNumber,String code){

        int data = 0;

        // int data = SQLData;
        return 30;

    }


}
