public class Main {
    public static void main(String[] args) {
        String message=greetUser("Abdoulkalim","Bazambanza");
        System.out.println(message);
        Addition addobj=new Addition();
        int sum=addobj.sum(3,5);
        System.out.println("the sum is "+sum);
    }
    public static String greetUser(String firstName,String lastName){

        return "hello "+firstName+" "+lastName;
    }
}