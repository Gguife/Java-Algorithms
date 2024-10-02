package org.example.hackerrank;

public class CompareTheTripletes {
    private int[] a = {};
    private int[] b = {};
    private int aliceScore = 0;
    private int bobScore = 0;

    public CompareTheTripletes(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    public int[] compare(){
        for(int i = 0; i < 3; i++){
            if(a[i] > b[i]){
                aliceScore += 1;
            }
            if(a[i] < b[i]){
                bobScore += 1;
            }
        }

        return new int[]{aliceScore, bobScore};
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 3};
        int[] b = {3, 0, 2};

        CompareTheTripletes compareTheTripletes = new CompareTheTripletes(a, b);
        int[] score = compareTheTripletes.compare();

        System.out.println("Essa é a pontuação de Alice nas 3 rodadas: " + score[0]);
        System.out.println("Essa é a pontuação de Bob nas 3 rodadas: " + score[1]);
    }
}
