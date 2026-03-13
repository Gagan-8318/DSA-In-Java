public class Book {
    private String title;
    private String author;
    private double price;

    //Default Constructor
    public Book(){
        this.title="m2";
        this.author="RD SHARMA";
        this.price=0.4;
    }

    //Parameterized constructor
    public Book(String title,String author){        
        this.title=title;
        this.author=author;
        this.price=0.1;

    }
    //Again parameterized constructor
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //Main methode to test the Book class
    public static void main(String[] args){
        Book Book1=new Book();
        //print the value of instance variable for book1
        System.out.println("Book1 Title:"+Book1.title);
        System.out.println("Book1 Author:"+Book1.author );
      System.out.println("Book1 price:"+Book1.price);
      System.out.println();
      //create a new Book object using the parameterized constructor(title,author)
      Book Book2=new Book("Amatka","Karin Tidbeck");
      //print the value of the instance variable for book2
      System.out.println("Book2 Title:"+ Book2.title);
      System.out.println("Book2 Author:"+Book2.author);
      System.out.println("Book2 price"+Book2.price);
System.out.println();
      Book Book3=new Book("Altered Carbon","Richard",19.90);
      System.out.println("Book3 title:"+ Book3.title);
      System.out.println("Book3 Author:"+Book3.author);
      System.out.println("Book3 price:"+Book3.price);
    }
}
