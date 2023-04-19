class A{
    int eid;
    int salary;
    static String ceo;//those variables who are same for all objects are called static variables
   
    static//sequence followed when using >1 static blocks 
    {
        System.out.println("first static");
    }
    
    public A()//loads when yu create an object
    {
        eid=1;
        salary = 69000;
        System.out.println("constructor called");
    }

    static //loads when you load a class
    {
        ceo="Aditya";
        System.out.println("class called");
    }

    public void show()
    {
        System.out.println(eid + " : " + salary + " : " +  ceo);
    }
}

public class J{
    int i=5;
    public static void main(String[] args) {
        A rohit=new A();
        A sumit=new A();
        i=3; //you cannot access not static variable inside a static block 
        //for that you have to make that variable static hehe
        rohit.show();
        sumit.show();
    }
}
