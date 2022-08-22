import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
        static int exp(int x,int y)
        {
            if (y==0 || x==1){
                return 1;
            }
            else{
                return exp(x,y-1)*x;
            }
        }


    public static void main(String[] args) {

        System.out.println(exp(1,1));

    }

}

