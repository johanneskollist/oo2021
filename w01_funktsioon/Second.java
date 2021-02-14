public class Second {
    public static void main(String[] args) {
        System.out.println(myName());
        System.out.println(add(8, 12));
        System.out.println(fullName("Johannes", "Kollist"));
        
    }

    public static String myName(){
        return "Johannes";
    }

    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName + " !";
    }
}
