class A{
    int eid;
    int salary;
    static String ceo;
    static{
        System.out.println("hello");
    }
    
    public A()
    {
        eid=1;
        salary = 69000;
        System.out.println("constructor called");
    }

    static 
    {
        ceo="Pant";
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
