@FunctionalInterface
interface Abc{
    int fu(int x , int y);
}

public class LambaExpressionWithReturn {
    public static void main(String[] args){
        Abc obj = (int x,int y) -> x+y;  //here return keyword is not required
        System.out.println(obj.fu(7,90));
    }
}
