package encapsulationMay21;

public class CallEncapsulation {
    // to see the mobile data of the individual

    public static void  main(String args[]){

        LearnEncapsulation obj = new LearnEncapsulation();
        obj.setMobileData(98765,"*123#");
        System.out.println("you hav balance ==> "+obj.getMobileData()+" GB");
    }

}
