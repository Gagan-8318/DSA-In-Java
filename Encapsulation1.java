class student{
    private String name;
    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation1{
    public static void main(String[] args) {
        student s =new student();
        s.setName("Gagan");
        System.out.println("student name is" + " "+s.getName());
    }
}