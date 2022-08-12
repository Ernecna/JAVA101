import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            int wnumber;
            Scanner inp = new Scanner(System.in);
            wnumber = inp.nextInt();
            int check=0;
            int temp;
            temp=wnumber;
                while(temp>0)
            {
                check++;
                temp =temp/10;
            }
        //System.out.println(check);
        int sum=0;
                int div=0;
                for(int i=0;i<check;i++)
                {
                    div=wnumber%10;
                    sum+=div;
                    wnumber=wnumber/10;
                }
        System.out.println(sum);
    }
}



