import java.util.*;

class Comp{
    private int p;
    private int t;

    private static int r;
    private int si;

    static{
        r=9;
    }
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter the principal amount :- ");
        p=sc.nextInt();
        System.out.println("Enter the time period :- ");
        t=sc.nextInt();
    }

    void compute(){
        si=(p*r*t)/100;
        System.out.println("The Interest would be :- "+si);
    }

}

public class Bank {
    public static void main(String[] args){
        Comp f1=new Comp();
        f1.input();
        f1.compute();
    }
}
