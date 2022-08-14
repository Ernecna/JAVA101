import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int wnumber;
        Scanner inp=new Scanner(System.in);
        wnumber=inp.nextInt();
        for(int i=10;0<=i;i--)
        {
            for(int j=0;j<wnumber-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            for(int j=0;j<wnumber-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("\n");

        }















    }
}


