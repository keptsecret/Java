public class ForPrimeNumbers {
    static void print(int i) {
        System.out.println(i + " is a prime number.");
    }

    public static void main(String[] args) {
        for (int x = 2; x <= 200; x++) {
            int testNumber = x;
            boolean isPrime = true;

            for (int r = 2; r < x; r++) {

                if (x % r == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                print(testNumber);
            }
        }
    }
}
