import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter the first side value");
        a=inp.nextInt();
        b=inp.nextInt();
   3
        c=(a*a)+(b*b);
        c=Math.sqrt(c);
        System.out.println(c);

    }
}