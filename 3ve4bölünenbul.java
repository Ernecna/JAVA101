import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int number;
       Scanner inp=new Scanner(System.in);
       number=inp. nextInt();
       int i;
       int sum=0;
       for(i=0;i<=number;i++)
       {
           if(i%3==0 && i%4==0){
               sum+=i;
           }
       }
        System.out.println(sum);
    }
}


