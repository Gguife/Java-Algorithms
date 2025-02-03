package org.example.hackerrank;

import java.util.Scanner;

public class DrawingBook {
  
  public static int drwaingBooks(int n, int p) {
    int front = (int) Math.floor(p/2);
    int back = (int) Math.floor(n/2 - front);

    System.out.println("Numeros de paginas passadas de frente para traz: " + front);
    System.out.println("Numeros de paginas passadas de traz para frente: " + back);

    int result = Math.min(front, back);

    return result;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero de paginas do livro: ");
    int numberOfBookPages = scanner.nextInt();

    System.out.println("Digite o numero da pagina que deseja abrir: ");
    int numberOfPage = scanner.nextInt();

    scanner.close();
    
    int result = drwaingBooks(numberOfBookPages, numberOfPage);

    System.out.println("Numero minimo de paginas passadas ate chegar a pagina selecionada: " + result);
  }
}
