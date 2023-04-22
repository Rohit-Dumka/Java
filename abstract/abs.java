// A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).
// Abstraction is a process of hiding the implementation details and showing only functionality to the user.

// There are two ways to achieve abstraction in java :
// 1>Abstract class (0 to 100%)
// 2>Interface (100%)

// A method which is declared as abstract and does not have implementation is known as an abstract method.
// ex: abstract void show();

// Notes:
// If there is an abstract method in a class, that class must be abstract.

class ap extends hello{
    public static void main(String[] args) {
        ap a=new ap();
        a.show();
        a.ok();
        a.hehe();
    }
    void show(){
        System.out.println("1");
    }
    void ok(){
        System.out.println("2");
    }
}

abstract class hello{
    abstract void show();
    abstract void ok();
    void hehe(){
        System.out.println("3");
    }
}
