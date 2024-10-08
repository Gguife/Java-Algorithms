package org.example.hackerrank;

public class DiagonalDifference {


    private static int sumDiagonals(int[][] matriz){
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        int difference = 0;

        for(int i = 0; i < matriz.length; i++){
            firstDiagonal += matriz[i][i];
            secondDiagonal += matriz[i][matriz.length - 1 - i];
        }

        difference = Math.abs(firstDiagonal - secondDiagonal);
        return difference;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

        int result = sumDiagonals(matriz);

        System.out.println("O resultado da soma das diagonais das matrizes é: " + result);

    }

}
