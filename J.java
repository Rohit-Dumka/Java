//these are just the line of codes i used to learn before few hours of my university exam.

//don't forget to pass command line arguments hehe
// public class J
// {
// 	public static void main(String args[])
// 		{

// 			for(String i:args)
// 			System.out.println(i);

// 		}
// }

// public class J
// {
//     public static void main(String args[])
//     {
//         for(int i=args.length-1;i>=0;i--)
//         System.out.println(args[i]);
//     }
// }
//CLA in reverse order


//reverse of string - error have to fix rip
// public class J
// {
//        public static void main(String args[])
//     {
//         String x="hello";
//         String r="";
//         for(int i=x.length()-1;i>=0;i--)
//         r=r+x.charAt(i);

//         for (String i : r) {
//             System.out.println(i);
//         }
//     }
// }


//wrapper class ============>>>>>>>>>>>>
//unboxing ------
// public class J
// {
//     public static void main(String args[])
//     {
//         int a=5;
//         Integer b=new Integer(a);//unboxing(integer to object conversion)
//         System.out.println(b);
//     }
// }


// obj to string========>>>>

// public class J
// {
//     public static void main(String args[])
//     {
//         int a=5;
//         Integer b=new Integer(a);
//         String c=b.toString(); //object to string conversion
//         System.out.println(c+c);
//     }
// }

// public class J
// {
//     public static void main(String args[])
//     {
//         int a=5;
//         Integer b=new Integer(a);
//         String c=b.toString(); 
//         int i=Integer.parseInt(c); //string to integer
//         System.out.println(i+i);
//     }
// }

//string to integer ====>>>>>>>>>

// public class J
// {
//     public static void main(String args[])
//     {
//         String s="4";
//         int a=Integer.parseInt(s);//string to integer
//         System.out.println(a+a);
//     }
// }

//number format exception
// public class J
// {
//     public static void main(String args[])
//     {
//         String x="1x3";
//         int i=Integer.parseInt(x);
//         System.out.println(i+i);
//     }
// }

//afer jdk 1.5 concept of autoboxing and autounboxing come in existence
// Integer i=4; //explicitly converting to object(int to obj)
//int k=i;  //obj to integer

// public class J
// {
//     public static void main(String args[])
//     {
//         Integer a=14; //auto boxing
//         System.out.println(a);

//         int x=a; //auto unboxing
//         System.out.println(x);

//         System.out.println(x+a);
//     }
// }

// public class J
// {
//     public static void main(String args[])
//     {
//         Object o=new Integer(8); //upcasting
//         System.out.println(o);
//         System.out.println(o+o);//auto unboxing is not possible in case of objects
//     }
// }


// public class J
// {
//     public static void main(String args[])
//     {
//         Object o=new Integer(7);
//         if(o instanceof Integer)
//         System.out.println((Integer)o + (Integer)o); //downcasting
//     }
// }

// public class J
// {
//     public static void main(String args[]) {
//         Object a=20;//upcasting
//         System.out.println(a);
//     }
// }

// public class J
// {
//     public static void main(String args[]) {
//         Integer i=10;//autoboxing
//         Object a=i;//upcasting
//         Object b=15;
//         // System.out.println(a+a);//error coz + operator is not overloaded in case of object;
//         System.out.println((Integer)a + (Integer)a);

//     }
// }


// public class J
// {
//     public static void main(String args[]) {
//         Object a[]={1,2.3,'hello'};//upcasting
//         System.out.println(a[0]);
//     }
// }

// public class J
// {
//     public static void main(String args[]) {
//         Object a[]={3,4.5,"hello"};//upcasting
//         System.out.println((Double)a[1]+3);
//         System.out.println((Integer)a[0]+2);
//     }
// }

// class A
// {
//     int eid;
//     int salary;
//     String ceo;
//     public void show()
//     {
//         System.out.println(eid + " : " + salary + " : " + ceo);
//     }
// }
// public class J
// {
//     public static void main(String[] args) {
//        A rohit = new A();
//        rohit.eid=10;
//        rohit.salary=5000;
//        rohit.ceo="Pant";

//        A sumit = new A();
//        sumit.eid=13;
//        sumit.salary=6000;
//        sumit.ceo="Pant";
//        rohit.show();
//        sumit.show();
//     }
// }

//to access static vars we don't need object (Can use class name simply)
//using static ==========>>>>>>>>>>>

// class A
// {
//     int eid;
//     int salary;
//     static String ceo;
//     public void show()
//     {
//         System.out.println(eid + " : " +  salary + " : " + ceo);
//     }
// }

// public class J{
//     public static void main(String[] args) {
//         A rohit = new A();
//         rohit.eid=8;
//         rohit.salary=5000;

//         A sumit = new A();
//         sumit.eid=9;
//         sumit.salary=6000;

//         A.ceo="Pant";

//         rohit.show();
//         sumit.show();
// //both works for same company
// //ceo common for both . isliye make it static so that it can be common for all 

//     }
// }

// class A{
//     int eid;
//     int salary;
//     static String ceo; //those vars who are same for all the objects
//     static{
//         System.out.println("hello");
//     }
    
//     public A()//when you create an object 
//     {
//         eid=1;
//         salary = 69000;
//         System.out.println("constructor called");
//     }

//     static //when you load a class , class loads first 
//     {
//         ceo="Pant";
//         System.out.println("class called");
//     }

//     public void show()
//     {
//         System.out.println(eid + " : " + salary + " : " +  ceo);
//     }
// }

// public class J{
//     static int i=5;
//     public static void main(String[] args) {
//         A rohit=new A();
//         A sumit=new A();
//         i=3;//you cannot access not static var inside a static block
//         rohit.show();
//         sumit.show();
//     }
// }

// class Calc
// {
//     int num1;
//     int num2;
//     int result;

//     public void perform()//method
//     {
//         result=num1+num2;
//     }
// }
// public class J{
//     public static void main(String[] args) {
//         // Calc obj;//reference
//         // obj=new Calc(); //that is object

//         Calc obj = new Calc(); //knows something and does something;
//         //does with help of methods;    

//         obj.num1=3;
//         obj.num2=5;
//         obj.perform();
//         System.out.println(obj.result);
//     }
// }

//constructors ============>>>>>>>>>>>

// class A{
//     int a;
//     int b;
//     int result;

//     public A(){
//         a=4;
//         b=2;
//         System.out.println("in constructor");
//     }
// }

// public class J{
//     public static void main(String[] args) {
//         A obj=new A();
//         System.out.println(obj.a);
//     }
// }

//class and objects 

// class Box
// {
//     private int length, breadth, height;
//     public void setDimension(int l,int b,int h)
//     {
//         length=l;breadth=b;height=h;
//     }
//     public void showDimension()
//     {
//         System.out.println("L: " + length);
//         System.out.println("B: " + breadth);
//         System.out.println("H: " + height);
//     }
//     //both fn's are also instance member function 
// }
// class J
// {
//     public static void main(String[] args) {
//         Box smallBox=new Box();
//         smallBox.setDimension(5, 3, 2);
//         smallBox.showDimension();
//         smallBox=new Box();//created new object on same smallbox
//         //old one is now garbage block 
//         //smallbox doesn't refers to old block anymore
//         smallBox.showDimension();//by def value of instance variable is 0 if not init

//     }
// }

//wrapper class in java
// java allows you to include the primitives in the family of objects by using wrapper classes
//there is a wrapper class for every primitive data type in java
// boolean -> Boolean
// byte -> Byte
// char -> Character
// short -> Short
// int -> Integer
// long -> Long
// float -> Float
// double -> Double 

// useful methods of wrapper class->

// valueOf()
// =>static method
// Return object reference of relative wrapper class

// public class J{
//     public static void main(String[] args) {
//         Integer i=Integer.valueOf("123");
//         Integer i2=Integer.valueOf("1011",2);
//         Double d=Double.valueOf("3.14");
//         System.out.println(i);
//         System.out.println(i2); 
//         System.out.println(d);
//     }
// }
// parseXxx() imp
// => static method
// => Xxx can be replaced by any primitive datatype 
// => 

// public class J{
//     public static void main(String[] args) {
//         int a=Integer.parseInt("123"); //returns int value
//         //string to int
//         double b=Double.parseDouble("13.45");
//         //string to double
//         int x=Integer.parseInt("a");
//         //string to int

//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(x);
//     }
// }

// xxxValue()
// => instance method/function of wrapper class
// => Xxx can be replaced by any primitive
// =>Returns corresponding primitive type

// public class J{
//     public static void main(String[] args) {
//          Integer i= Integer.valueOf("1011",2);
//          int j=i.intValue(); //
//     }
// }

// class J{
//     public static void main(String[] args) {
//         Integer I=new Integer(10);
//     }
// }


// public final class Integer/Character/Boolean/....
// all wrapper classes are final

//An object of a wrapper class is immutable
// kisi class ka obj agr immutable hai means obj me jo stored value hai usko modify nhi kr skte

// number=>
// Byte , Short , Integer, Long, Float, Double
// all are sibling classes since parent is same.

// ek wrapper class me 1 hi value store kar sakte hai 

// class J{
//     public static void main(String[] args) {
//         int a=7;
//         Integer b=new Integer(6); //boxing
//         you are taking a primite value and storing that in a pri obj/ obj/class obj
//         //strikethrough -> depricated
//         System.out.println(b);
//         Integer c=5; //autoboxing coz this will be converted into obj automatically 
//         System.out.println(c);
//     }
// }

// class J{
//     public static void main(String[] args) {
//         int a=7;
//         Integer b=a;             //autoboxing
//         // when you store a primitive type in the object automatically
//         // int c=b.intValue();      //unboxing 
//         int c=b;                 //autounboxing
//         //when you take out the primitive value from the object
//         System.out.println(c);


//         String str="12";
//         // System.out.println(str*2); //error
//         int d=Integer.parseInt(str);
//         System.out.println(d*2);
//     }
// }

// Integer i=new Integer(10);
// i-> reference of an integer class
// Integer -> constructor



// exam =>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//we can initialize instance variable in 3 ways=>
// 1. by using constructor
// 2. by using block
// 3. by using instance initialization

// // 1. using constructor====>>>>>>>>>>>>>
// class J{
//     public static void main(String[] args) {
//         A a=new A();
//     }
// }
// class A{
//     A()
//     {
//         int x=5;
//         System.out.println(x);
//     }
// }


// // 2. using block =>>>>>>>>>>>>>>>>>>
// class J{
//     public static void main(String[] args) {
//         B b=new B();
//     }
// }

// class B{
//     {
//         int i=3;
//         System.out.println(i);
//     }
// }


// 3. using block 
// class J{
//     public static void main(String[] args) {
//         A a=new A();
//     }
// }

// class A{
//     // {
//     //     System.out.println("hello"); //block har time constructor me copy hota hai
//     // }
    
//     // System.out.println("hwlllo");  //error hehe 
// }


// 3. instance initialization==========>>>>>>>>>>>>>>>>>>
// class J{
//     public static void main(String[] args) {
//         A a = new A();
//         System.out.println(a.i);
//     }
// }
// class A{
//     int i=40;
// }

//static variable takes only 1 value in memory
// can access static variable without any instance i.e. we can access it without class

// class J{
//     public static void main(String[] args) {
            // static int i=3; //variable can't be static inside a method
//         K k =new K();
//     }
// }
// class K{
//     // int a=5;
//     // static int b=a; //we cannot use non-static things in static context
//     static int c=4;
//     static int d=c;
// }


// class J{
//     public static void main(String[] args) {
//         A a=new A();
//         System.out.println(a.i);
//         System.out.println(A.j);
//     }
// }
// class A{
//     int i=5;          //instance variable
//     static int j=6;   //class variable ->loads when class loads in memory
// }


// >As java is strongly typed language : it is necessary to initialize local variable prior to use.

// >constructor - intialize value to a variable if the value isn't assigned already

// >In a same scope , we cannot declare same name variable more than once

// >local variable can have same name as instance variable/class variable

// class J{
//     public static void main(String[] args) {
//         A a=new A();
//         a.show();
//     }
// }
// class A{
//     int i=3;//instance variable
//     void show(){
//         int i=12;//local variable
//         A a=new A();
//         System.out.println(i); //variable hiding
//         System.out.println(a.i);
//     }
// }

// >If we are having local variable same as instancee variable , we have to differenciate it using this keyword
// >this can be used with variable too (var must be instance variable)
// >this can't be used in static context
// class J{
//     public static void main(String[] args) {
//         A a=new A();
//         a.show();
//         B b=new B();
//         b.hello();
//     }
// }
// class A{
//     int i=3;//instance variable
//     void show(){
//         int i=12;//local variable
//         A a=new A();
//         System.out.println(i); //variable hiding
//         System.out.println(this.i);
//     }
// }
// class B{
//     int j=6;
//     static void hello(){
//         int j=9;
//         B b=new B();
//         System.out.println(j);
//         System.out.println(this.j);//this can't be used in static context
//     }
// }

// >no two methods inside a class can be of same name (& same signature) 

// class J{
//     public static void main(String[] args) {
//         A a=new A();
//         a.show();
//         }
// }
// class A{
//     void show(){
//         System.out.println("hello");
//     }
//     void show(int x){
//         System.out.println("ok");
//     }
// }

//methods with same name and diff signature=> polymorphism =>
// class J{
//     public static void main(String[] args) {
//         A a=new A();
//         a.show();
//         a.show(3);
//     }
// }
// class A{
//     void show(){
//         System.out.println("hello");
//     }
//     void show(int x){
//         System.out.println("ok");
//     }
// }

// >>As we know Java is object oriented programming language . So it supports the concept of polymorphism. It can be achieved in 2 ways-->
// 1. compile time polymorphism(method overloading)
// 2. runtime polymorphism(method overriding)

// 1.compile time (method overloading)=> 
// > same class
// > method name -same, signature - different
// > constructor can overload 
// > static & final method can be overloaded


// 2. runtime polymorphism(method overriding)
// >different class(child-parent)
// >method name - same , signature - same
// >constructor can't override
// >static & final can't be overloaded

//method overloading never saves memory
//it is simple concept of reusability using naming convention. ex: println()

// as we are overloading a method, we can overload constructor too
//this => used to refer current object


// ----------------------------------------------------
                    // super
// ----------------------------------------------------

//           1. variable
// super =>  2. method
//           3.constructor

// it is used to differenciate the members of the superclass from the members of 
//subclass if the name of both the variables/methods are same

// 1.variable=========>>>>>>>>>>>
// class A{
//     int a=10;
// }
// class B extends A{
//     int a=20;
//     void show(){
//         System.out.println(a);
//         System.out.println(super.a);
//     }
// }
// class J{
//     public static void main(String[] args) {
//         B b=new B();
//         b.show();
//     }
// }

// 2.method=============>>>>>>>>>>>>>>>
// class A{
//     void show()
//     {
//         System.out.println("hello world");
//     }
// }
// class B extends A{
//     void show()
//     {
//         System.out.println("hello boi");
//         super.show();//calls the method of super class
//     }
// }
// class J{
//     public static void main(String[] args) {
//         B b=new B();
//         b.show();
//     }
// }

// 3.constructor====================>>>>>>>>>>>>>>>>>>>
//super wil get printed first
// class B extends A{
//     B(){
//         System.out.println("hola");
//     }
// }
// class A{
//     A(){
//         System.out.println("hello super");
//     }
// }
// class J{
//     public static void main(String[] args) {
//         B b=new B();
//     }
// }


// 3.2 parameterised constructor============>>>>>>>>>>>>>>>
// class A{
//     A(int x){
//         System.out.println("ok");
//     }
// }
// class B extends A{
//     B(int b){
//         super(10);//in case of parameterise constructor we have to use super keyword 

//         System.out.println("hello");
//     }
// }
// class J{
//     public static void main(String[] args) {
//         B b=new B(10);
//     }
// }



// -----------------------------------------------
//              this keyword in java
// ----------------------------------------------


// 1.this keyword refers to the current object inside a method or constructor

// class J{
//     public static void main(String[] args) {
//         J a=new J();
//         System.out.println(a);
//         a.show();
//     }
//     void show(){
//         System.out.println(this);
//     }
// }


// 2. whenever the name of instance and local variables both are same then our
// runtime environment JVM gets confused that which one is local & which one is 
// instance variable,  to avoid this problem we should use this keyword..
// class J{
//     public static void main(String[] args) {
//         B b=new B();
//         b.show();
//     }
// }
// class B{
//     int a=10;   //instance
//     void show(){
//         int a=6;    //local
//         System.out.println(a);
//         System.out.println(this.a);
//     }
// }

// class J{
//     public static void main(String[] args) {
//         B b=new B(10);
//         b.show();
//     }
// }
// class B{
//     int i;
//     B(int i)
//     {
//         i=i;
//     }
//     void show(){
//         System.out.println(i);
//     }
// }


// class J{
//     int i;
//     J(int i)
//     {
//         i=i;
//     }
//     void show(){
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         J a=new J(10);
//         a.show();
//     }
// }
// 0-> ignore our value and print default value of i . i.e. 0(by constructor)


// class J{
//     int i;
//     J(int i)
//     {
//         this.i=i; //this => part of current object
//     }
//     void show(){
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         J a=new J(10);
//         a.show();
//     }
// }

// 3. It is also used when we want to call the default constructor of it's own class
//calling the def const of same class using this ->>>>>>>>'


// class J{
//     J(){
//         System.out.println("learn");
//     }
//     J(int a){
//         this();
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         J i=new J(100);
//     }
// }

//this also called parameterized constructor of it's own class
// class J{
//     J(){
//         this(10);
//     }
//     J(int i){
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         J a =new J();
//     }
// }


// ERROR 404 
    // ERROR 404 
    //         ERROR 404 
    //                 ERROR 404 



// class J{
//     public static void main(String[] args) {
//         B b=new B();
//         b.show();
//     }
// }
// class A{
//     public void show(){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     public void show(){
        
//         System.out.println("B");
//     }
// }

//why it's working

//static method can't be override 

// class J{
//     public static void main(String[] args) {
        
//     }
// }
// class A{
//     static void show(){

//     }
// }
// class B extends A{
//     void show(){

//     }
// }

