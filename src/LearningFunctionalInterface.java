@FunctionalInterface
interface A{
    void show();
//    void fill();
}

public class LearningFunctionalInterface {
    public static void main(String[] args){
        A obj=new A(){
            public void show(){
                System.out.println("A");
            }
//            public void fill(){
//                System.out.println("Fill function");
//            }
        };
        obj.show();
//        obj.fill();
    }
}
