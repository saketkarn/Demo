import java.util.*;
class MyKindOfException extends Exception{
    public String getMessage(){
        return "Radius has been entered in negative";
    }
}
public class TryingUserDefinedException{
    static void area(int i) throws MyKindOfException{
        if(i<0)
            throw new MyKindOfException();
        else
            System.out.println("Area is "+i*i);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius : -");
        int i=sc.nextInt();
        try{area(i);}
        catch(Exception e){
            System.out.println("Enter the radius in positive");
            System.out.println(e.getMessage());
        }
    }
}
