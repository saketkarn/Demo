abstract class myDream{
    abstract void dream();
}
public class TryingAbstract {
    public static void main(String[] args) {
        myDream obj = new myDream() {
            @Override
            void dream() {
                System.out.println("bike");
            }
        };
        obj.dream();
    }
}
