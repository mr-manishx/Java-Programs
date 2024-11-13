import java.util.Scanner;

public class ReverseDigitx {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum * 10 + digit;
            num = num / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
