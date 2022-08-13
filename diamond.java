import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int wnumber;
       Scanner inp=new Scanner(System.in);
       wnumber=inp.nextInt();
       for(int i=1;i<=wnumber;i++)
       {
           for(int j=1;j<=wnumber-i;j++)
           {
               System.out.print(" ");
           }
           for (int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           if (i>=2)
           {
               for (int j=1;j<=i-1;j++)
               {
                   System.out.print("*");
               }
               for(int j=1;j<=wnumber-i;j++)
               {
                   System.out.print(" ");
               }

           }
           System.out.print("\n");

       }
       // alt kısım
        for(int k=wnumber;0<=k;k--)
        {
            for (int l=0;l<=wnumber-k;l++)
            {
                System.out.print(" ");
            }
            for (int a=1;a<=k*2-3;a++)
            {
                System.out.print("*");
            }
            for (int l=0;l<=wnumber-k;l++)
            {
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}


