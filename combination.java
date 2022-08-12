import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int number;
       int number1;
       Scanner inp=new Scanner(System.in);
       number=inp. nextInt();
        number1=inp. nextInt();
        int n;
        int  fact=1;
        for(n=1;n<=number;n++)
        {
            fact=fact*n;
        }
        int r=1;
        for(n=1;n<=number1;n++)
        {
            r=r*n;
        }
        int last=1;
        for(n=1;n<=number-number1;n++)
        {
            last=last*n;
        }
        System.out.println(fact/(r*last));
    }
}


