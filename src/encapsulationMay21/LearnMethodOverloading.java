package encapsulationMay21;

public class LearnMethodOverloading {
    public static void main(String args[]) throws Exception{

        LearnMethodOverloading obj = new LearnMethodOverloading();
        int result = obj.addNumbers(5,5,"addition");
        System.out.println(result);
    }

    public int addNumbers(int a,int b){
        return a+b;
    }

    public int addNumbers(int a,int b,int c) {
        return a + b + c;
    }

    public int addNumbers(int a,int b,String typeOfCalculation){
        int c=0;
        if (typeOfCalculation.equals("addition")) {
            c = a + b;
        }
        if (typeOfCalculation.equals("subtraction")) {
            c = a - b;
        }
        if(typeOfCalculation.equals("multiplication")){
            c=a*b;
        }
        return c;
    }
}
