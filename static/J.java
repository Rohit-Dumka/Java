class A{
    int eid;
    int salary;
    static String ceo;
   
    static//sequence followed when using >1 static blocks 
    {
        System.out.println("first static");
    }
    
    public A()
    {
        eid=1;
        salary = 69000;
        System.out.println("constructor called");
    }

    static 
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
        i=3;
        rohit.show();
        sumit.show();
    }
}
