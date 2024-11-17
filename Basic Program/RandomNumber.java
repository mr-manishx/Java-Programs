public class RandomNumber {
    public static void main(String[] args) {
        
        while(true){

            int random_number = (int) (Math.random() * 100);
            if(random_number > 10){
                System.out.println(random_number);
            }
            else{
                break;
            }
        }
    }
}




