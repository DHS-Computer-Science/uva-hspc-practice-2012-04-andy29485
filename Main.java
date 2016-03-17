//Andriy Zasypkin
//2016-03-17
//Practice 2012 - 04: Math Tutoring

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int nCases = input.nextInt();
    
    for(int i=0; i<nCases; i++) {
      System.out.printf("Case %d: ", i+1);
      int nOrder = input.nextInt();
      
      for(int j=0; j<nOrder+1; j++) {
        System.out.print((nOrder-j)*input.nextInt());
        if(j < nOrder)
          System.out.print(" ");
      }
      
      System.out.println();
    }
    
    System.exit(0);
  }
}
