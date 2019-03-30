public class Main {

    public static void main(String[] args) {
         int number = 1;
        boolean result = isPrimeNumber(number);
        if (result) {
            System.out.println(number + " is not prime") ;
        }else{
            System.out.println(number + " is prime") ;
        }
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= (number/2); i++){
            if (number % i == 0) { return true; }
        }
        return false;
    }
}
