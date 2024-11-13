import java.util.Scanner;

public class Amstrong {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        int sum = 0;

        while(n != 0){

            int lastDigit = n % 10;
            sum =  sum + (int)(Math.pow(lastDigit, 3)) ;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
