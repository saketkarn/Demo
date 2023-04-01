class Student{
    private int roll;
    private String name;
    private String city;
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

public class Encap {
    public static void main(String[] args){
        Student obj=new Student();
        System.out.println("Learning Encapsulation :- ");
        obj.setCity("Patna");
        obj.setRoll(1);
        obj.setName("Saket");
        System.out.println(obj.getName());
        System.out.println(obj.getRoll());
        System.out.println(obj.getCity());
    }
}
