class Employee{
    private String name;
    private int age;
   
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
      
        return name ;
     }

    public int getAge(){
      
System.out.println(name);
return age;
    }

    public void setAge(int age){
        if(age>0)
           { this.age=age;}
        
    }
    public void petName(String name){
        this.name=name;
        System.out.println(name);
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("Alice");
      emp.setAge(30);
        System.out.println("Name:"+emp.getName());
        System.out.println("Age:"+emp.getAge());
       

    }
}
