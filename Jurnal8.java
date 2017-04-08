package jurnal8;

import java.util.Scanner;

public class Jurnal8 {

    public static void main(String[] args) {
          int a=0,b=1,hasil=0,c;
   Scanner input = new Scanner (System.in);
   System.out.print ("Masukan Deret Fibonacci  : ");
        c = input.nextInt ();
        for(int i=0; i<=c; i++){            
    a=b;
    b=hasil;
    System.out.print(hasil+" ");
    hasil=a+b;
    }
    } 
    }
    
