public import java.util.Scanner;

public class CountIntegers {

    public static int countIntegers(int k, int l, int r) {
        // Handle edge cases
        if (k <= 1 || l >= r) {
            return 0;
        }

        // Generate prime numbers up to k
        boolean[] isPrime = new boolean[k + 1];
        for (int i = 2; i <= k; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= k; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= k; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Use sieve to mark non-primes
        boolean[] notPrime = new boolean[r - l + 1];
        for (int i = 2; i <= k; i++) {
            if (isPrime[i]) {
                int start = Math.max(i * i - l, 0);
                for (int j = start; j < notPrime.length; j += i) {
                    notPrime[j] = true;
                }
            }
        }

        // Count primes in the range
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (!notPrime[i - l]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int count = countIntegers(k, l, r);
        System.out.println(count);
    }
}
{
    
}
