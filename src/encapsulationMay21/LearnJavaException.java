package encapsulationMay21;

public class LearnJavaException {

    // open amazon.com
    // validate logo.There is some error or exception or xpath change test script will fail
    // validate header
    // validate login
    // validate footer
    // quit amazon website

    public static void main(String args[]){
        LearnJavaException obj = new LearnJavaException();
        obj.launchAmazon();
        obj.validateAmazonHeader();
        obj.loginAmazon();
        obj.validateAmazonFooter();
        obj.closingAmazon();
    }

    public void launchAmazon() {
        System.out.println("launching amazon");
    }

    public void validateAmazonHeader(){
        System.out.println("validating header");
    }
    public void loginAmazon(){

        try{
            int a=5/0;
        }
        catch(Exception e) {
            System.out.println("there is a error in login amazon");
        }
    }

    public void validateAmazonFooter(){
        System.out.println("validating Footer");
    }

    public void closingAmazon(){
        System.out.println("quiting the amazon website");
    }
}
