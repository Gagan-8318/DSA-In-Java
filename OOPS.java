class car{
    String color;
    int speed;
    void driver(){
        System.out.println(color+ "car is driving at"      +       speed);
    }
}

public class OOPS {
    public static void main(String[] args){
       car myCar=new car();
       myCar.color="red";
       myCar.speed=122;
       myCar.driver();

    }
    
}
