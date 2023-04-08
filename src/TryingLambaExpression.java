@FunctionalInterface
interface ANew{
    abstract void newFun(int x, int y);
}

public class TryingLambaExpression {
    public static void main(String[] args){
        ANew obj=(x,y) ->  //LambdaExpression only works with Functional Interface
                System.out.println(x+y);
        obj.newFun(5,6);
    }

}
