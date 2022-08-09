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

        System.out.println("enter the physic point");
        phy=inp.nextInt();

        System.out.println("enter the chem point");
        chem=inp.nextInt();


        double avg=(math+phy+chem)/3;
        System.out.println(avg);
        boolean res=avg>60;
        String str=res ? "PASSED":"UNSUCCESFUL";
        System.out.println(str);


    }
}