package org.example.hackerrank;

public class SimpleArraySum {

    public static int simpleArraySum(int[] ar){
        int sum = 0;

        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3};

        int result = simpleArraySum(ar);
        System.out.println("A soma dos valores internos do array é: " + result);
    }
}
