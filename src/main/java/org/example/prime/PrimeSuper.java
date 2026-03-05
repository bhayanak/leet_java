package org.example.prime;
import java.util.ArrayList;
import java.util.List;

public class PrimeSuper {
    public static int increment = 0;
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n < 2) return primes;
        
        // Base primes
        primes.add(2);
        if (n == 2) return primes;
        primes.add(3);
        if (n == 3) return primes;

        // bitSet represents numbers 6k-1 and 6k+1
        // We only need to store potential primes. 
        // Index mapping: 
        // 6k-1 -> index 2k-1
        // 6k+1 -> index 2k
        int size = (2 * (n / 6)) + ( (n % 6 >= 5) ? 2 : (n % 6 >= 1 ? 1 : 0) );
        boolean[] isComposite = new boolean[size + 1];

        for (int i = 5; i * i <= n; i += 6) {
            // Check 6k-1
            increment++;
            if (!isComposite[getIdx(i)]) {
                markMultiples(isComposite, i, n);
            }
            // Check 6k+1
            if (i + 2 <= n && !isComposite[getIdx(i + 2)]) {
                markMultiples(isComposite, i + 2, n);
            }
        }

        // Collect results
        for (int i = 5; i <= n; i += 6) {
            increment++;
            if (!isComposite[getIdx(i)]) primes.add(i);
            if (i + 2 <= n && !isComposite[getIdx(i + 2)]) primes.add(i + 2);
        }

        return primes;
    }

    // Maps a number of form 6k +/- 1 to its compressed index
    private static int getIdx(int num) {
        int k = num / 6;
        return (num % 6 == 5) ? (2 * k + 1) : (2 * k);
    }

    // Efficiently marks multiples starting from p*p
    private static void markMultiples(boolean[] isComposite, int p, int n) {
        // We only mark multiples of p that are of form 6k +/- 1
        // Multiples of p that are also multiples of 2 or 3 are already ignored by our wheel
        for (int j = p * p; j <= n; j += 2 * p) {
            if (j % 3 != 0) { // Only care about multiples not divisible by 2 or 3
                increment++;
                isComposite[getIdx(j)] = true;
            }
        }
    }

    public static void main(String[] args) {
        int N = 100;
        List<Integer> primes = generatePrimes(N);
        System.out.println("Primes up to " + N + ": " + primes);
        System.out.println("loop went till: " + increment);
        System.out.println("Space is: " + primes.size());
    }

}
