package constructorMay23;

import org.w3c.dom.ls.LSOutput;

    public class LearnConstructor {
        public int empID = 0;
    public  void constructorLearn(){
    System.out.println("This is Constructor");
    empID = 12345;
    }

    public static void main(String args[]) throws Exception{
       LearnConstructor obj = new LearnConstructor();
       obj.constructorLearn();
       System.out.println("Emp ID is " +obj.empID);
    }



}
