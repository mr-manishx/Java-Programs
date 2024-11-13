import java.util.Scanner;

public class Pelindrom_Number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        while(n != 0){

            int digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }
        if(sum == temp){
            System.out.println("Pelindrom number");
        }
        else{
            System.out.println("Not pelindrom number");
        }
        sc.close();
    }
}
