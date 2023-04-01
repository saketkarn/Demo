class Student{
    private int roll;
    private String name;
    private String city;
        public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setCity(String city) {
//        this.city = city;
//    }
//    public void setRoll(int roll) {
//        this.roll = roll;
//    }

    public Student(String name, String city, int roll){
            this.name=name;
            this.city=city;
            this.roll=roll;
    }

    public String getCity() {
        return city;
    }



    public int getRoll() {
        return roll;
    }


}

public class Encap {
    public static void main(String[] args){
        Student obj=new Student("Saket", "Patna", 1);
        System.out.println("Learning Encapsulation :- ");
//        obj.setCity("Patna");
//        obj.setRoll(1);
//        obj.setName("Saket");
        System.out.println(obj.getName());
        System.out.println(obj.getRoll());
        System.out.println(obj.getCity());
    }
}
