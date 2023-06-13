package constructorMay23;

public class ReturnIntegerTypeMethod {

    public static void main (String args[]) throws Exception{
        ReturnIntegerTypeMethod obj =new ReturnIntegerTypeMethod();
        int sum = obj.addThreeNumbers(10,20,30);
        System.out.println(sum);
    }

    public int addThreeNumbers(int a,int b,int c){
        return a+b+c;
    }

    public void addTwoNumbers(int a,int b){
        System.out.println(a+b);
    }

}
