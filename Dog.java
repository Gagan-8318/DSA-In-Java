
public class Dog{
    private String name;
    private String color;
    public Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    public static void main(String[] args) {
        Dog mydog=new Dog("Bailey", "black");
        System.out.println("Dog's Name:" + mydog.name);
        System.out.println("Dog's:"+ mydog.color);
    }
}