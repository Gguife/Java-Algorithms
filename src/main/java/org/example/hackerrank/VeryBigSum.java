package org.example.hackerrank;

public class VeryBigSum {

    private static long bigSum(int[] ar) {
        long sum = 0;

        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        long result = bigSum(ar);

        System.out.println("A soma de todos os numeros grandes é: " + result);
    }

}
