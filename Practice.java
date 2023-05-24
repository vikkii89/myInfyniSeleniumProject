package constructorMay23;
// type casting
public class Practice {
    String cost = "100";
    String tax = "10";

    String totalCost = null;

    public static void main(String args[]){
        Practice obj = new Practice();
        obj.totalCost = String.valueOf(Integer.parseInt(obj.cost)+Integer.parseInt(obj.tax));
        System.out.println(obj.totalCost);
    }
}
