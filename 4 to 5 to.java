import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int number;
       Scanner inp=new Scanner(System.in);
       number=inp. nextInt();
       int i=1;
       int j=1;
       while(i<number || j<number)
       {
           System.out.print(i+" ");
           System.out.print(j+"\n");
           i=i*4;
           j=j*5;


       }
    }
}


