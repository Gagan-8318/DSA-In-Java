import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Wrapper class
        Integer in=new Integer(7);
        System.out.println(in);
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Boolean> l2=new ArrayList<>();
        ArrayList<Float>l3=new ArrayList<>();
        

        //Add new element 
        l1.add(1);
        l1.add(2);
        l1.add(3);

        //get element at ith index
        System.out.println(l1.get(0));

        //print with loop
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
System.out.println();
        // Printing arraylist directly
        System.out.println(l1);
    }

    //adding element at ith index
//    l1.add(1,2);

//modifying element at ith inndex
l1.set()

    
}
