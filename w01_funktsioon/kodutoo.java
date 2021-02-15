import java.util.Scanner;

public class kodutoo {
    public static void main(String[] args) {
        int num1 = 5, num2 = 15, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta esimene number:  ");
        num1 = sc.nextInt();

        System.out.println("Sisesta teine number: ");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("Nende numbrite summa on: "+sum);
        
        if (sum % 2 == 0)
            System.out.println("Summa on paarisarv");
          else
            System.out.println("Summa on paaritu arv");  
    }
}
