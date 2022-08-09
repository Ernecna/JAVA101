import javax.swing.*;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // create variables
        int math,phy,chem,history;
        // for the getting value we use scanner class
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the mat point");
        math=inp.nextInt();
        System.out.println(math);
        System.out.println("enter the physic point");
        phy=inp.nextInt();
        System.out.println(phy);
        System.out.println("enter the chem point");
        chem=inp.nextInt();
        System.out.println(chem);

        double avg=math+phy+chem;
        System.out.println(avg/3);

    }
}