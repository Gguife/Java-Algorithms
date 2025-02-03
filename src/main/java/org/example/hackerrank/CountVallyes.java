package org.example.hackerrank;

public class CountVallyes {

  public static int countVallyes(int steps, String path) {
    int altitude = 0;
    int vallyes = 0;


    for(int i = 0; i < steps; i++) {
      if(path.charAt(i) == 'U') {
        altitude++;
      }else if(path.charAt(i) == 'D') {
        altitude--;
      }

      if(altitude == 0 && path.charAt(i) == 'U'){
        vallyes++;
      }
    }

    return vallyes;
  }

  public static void main(String[] args) {
    int steps = 8;
    String path = "DDUUUUDD";

    int result = countVallyes(steps, path);
    
    System.out.println("Numero de vales atravessados durante o caminho: " + result);

  }
}
