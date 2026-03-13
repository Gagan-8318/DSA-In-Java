// abstract class TV {
//     abstract void turnon();
//     abstract void turnoff();
    
// }
// class TVRemote extends TV{
//     @Override 
//     void turnon(){
//         System.out.println("TV is turned on");
    
//     }
//     @Override
//     void turnoff(){
//         System.out.println("TV is turned off");

    
    
   
//     }
    

// }

//  public class geeks {
//         public static void main(String[] args){
//             TV remote=new  TVRemote();
//             remote.turnon();
//             remote.turnoff();
//         }


abstract class TV {
    abstract void turnon();
    abstract void turnoff();
}

class TVRemote extends TV {

    @Override 
    void turnon() {
        System.out.println("TV is turned on");
    }

    @Override
    void turnoff() {
        System.out.println("TV is turned off");
    }
}

public class geeks {
    public static void main(String[] args) {
        TV remote = new TVRemote();
        remote.turnon();
        remote.turnoff();
    }
}