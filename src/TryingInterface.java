
interface oldCity{
    abstract void city();
}

class newCity implements oldCity{
    public void city(){
        System.out.println("New city is Pune");
    }
}
public class TryingInterface{
    public static void main(String[] args){
        newCity obj=new newCity();
        obj.city();
    }
}
