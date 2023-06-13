package constructorMay23;

public class LearnInheritance extends Practice{
    public static void main(String args[]){
        LearnInheritance obj = new LearnInheritance();
        obj.totalCost = String.valueOf(Integer.parseInt(obj.cost)+Integer.parseInt(obj.tax));
        System.out.println(obj.totalCost);
    }
}
