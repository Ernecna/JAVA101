import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int number;
       Scanner inp=new Scanner(System.in);
       number=inp. nextInt();
       int sum=0;
       while(number%2==0)
       {
           if(number%4==0)
           {
               sum+=number;
           }
           number=inp. nextInt();
       }
        System.out.println(sum);
    }
}


