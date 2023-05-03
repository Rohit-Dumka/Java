import java.net.SocketTimeoutException;
import java.rmi.StubNotFoundException;
import java.util.Scanner;

import javax.xml.transform.SourceLocator;

// class arr{
//     public static void main(String[] args) {
//         int a[]={1};
//         System.out.println(a);
//         int b[]={3};
//         System.out.println(b[0]);
//         int c[]=null;
//         System.out.println(c);
//         System.out.println(c[0]);
//     }
// }



// ---------------------------------------
//                      dupsort
// ---------------------------------------

// class ar{
// 	public static void main(String args[])
// 		{	
// 			int t=0;
// 			int a[]={1,4,2,9,6,2};
// 			for(int i=0;i<a.length;i++){
// 			    for(int j=i+1;j<a.length;j++)
// 			    {
// 					if(a[i]>a[j])
// 					{
// 						t=a[i];
// 						a[i]=a[j];
// 						a[j]=t;
// 					}
// 			    }
//             }

// 			for(int i=0;i<a.length;i++)
// 			{
// 				for(int k=i+1;k<a.length;k++)
// 				{
// 					if(a[i]==a[k])
// 						a[k]=-1;
// 				}
// 				if(a[i]!=-1)
// 				System.out.println(a[i]);
// 			}
// 		}
// }

// class ar{
// 	public static void main(String args[])
// 		{	
// 			int a[][]={{1},null};
// 			// System.out.println(a[0]);//hashcode
//             // System.out.println(a);//hashcode
//             // System.out.println(a[1]);//null????????????
//             // System.out.println(a[0][0]);
//             System.out.println(a[0][1]);//error index out of bound
// 		}
// }




// class ar{
// 	public static void main(String args[])
// 		{	
// 			int a[][]={{1},null};
//             System.out.println(a[0][1]);//error index out of bound
//             // int b[]=null;
//             // System.out.println(b[0]); //null pointer exception
// 		}
// }
// // esa isliye coz null dalne pe memory nhi milti ,but agr humne koi value daldi to memory mil jayegi aur ,null to wese bhi accessiable nhi hai
// // this is why value milne ke baad udhr kuch bhi nhi rhege heheeehhehehehe



// class ar{
//     public static void main(String[] args) {
//         int a[][]={null,null};
//         System.out.println(a[0]);//null
//         System.out.println(a[1]);//null
//         System.out.println(a[0][0]);//null pointer exception
//         System.out.println(a[0][1]);//null pointer exception
//     }
// }

// class ar{
// 	public static void main(String args[])
// 		{	
// 			int b[]=null;
// 			System.out.println(b);//null
// 			//System.out.println(b[0]);//null pointer exception
// 			int a[][]={null,null};
// 			System.out.println(a);//hashcode of a
// 			System.out.println(a[0]);//hashcode of a[0]
// 			System.out.println(a[1]);//null
// 			System.out.println(a[0][0]);//1
// 			System.out.println(a[0][1]);//indexoutofbound
// 		}
// }



// class ar{
//     public static void main(String[] args) {
//         int a[][]={{1,2},{3,4,5,6}};
//         // System.out.println(a[0][0]);
//         // System.out.println(a[0][1]);
//         // System.out.println(a[1][0]);
//         // System.out.println(a[1][1]);
//         for(int i=0;i<a.length;i++)
//         for(int j=0;j<a[i].length;j++)  
//         System.out.println(a[i][j]);
//     }
// }


//avg of every row
// class ar{
//     public static void main(String[] args) {
//         int a[][]={{1,2,3},{4,5},{6}};

//         for(int i=0;i<a.length;i++)
//         {
//             int sum=0;
//         for(int j=0;j<a[i].length;j++)
//             {
//                 sum+=a[i][j];
//             }
//             Float avg=sum/a[i].length;
//             System.out.println("avg of "+i+ " length is  : "+ avg);
//         }
//     }
// }

//avg of 2nd largest and 2nd smallest
// class ar{
//     public static void main(String[] args) {
//         int a[]={1,9,3,6,7,8,5,8,11};
//         int t=0;
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[i]<a[j]){
//                     t=a[i];
//                     a[i]=a[j];
//                     a[j]=t;
//                 }
//             }
//         }


//         for(int x: a)
//         {
//          System.out.println(x);
//         }

//     int e=a.length-2;
//     System.out.println("2nd largest: "+a[1]);
//     System.out.println("2nd smallest: "+a[e]);
//         int sum=a[1]+ a[e];
//         int avg=sum/2;
//         System.out.println("average: "+avg);
//     }
// }

//print common -----!!!!!!!!!!!dup errorrrrrrrrrrrrrrrrrr ;(
// class ar{
//     public static void main(String[] args) {
//         int a[]={1,2,3,9,9,3};
//         int b[]={3,4,5,1,7,9};
//         int flag=0;
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a.length;j++)
//             {
//                 if(a[i]==b[j])
                
//                 System.out.println(a[i]);
//             }
//         }
//     }
// }

// print element which is twice in first and once in 2nd

// class ar{
//     public static void main(String[] args) {
//         int a[]={1,2,3,9,9,3};
//         int b[]={3,4,5,1,7,9};
//         int c1=0,c2=0;
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[i]==a[j])
//                 c1++;
//             }
//             if(c1==2){
//                 for(int k=0;k<b.length;k++){
//                     if(a[i]==b[k]){
//                         c2++;
//                     }
//                     if(c2==1){
//                         System.out.println(b[i]);
//                     }
//                 }
//             }
//         }
        
        
//     }
// }
//error again 


// we can use uneven array after allocating memeory using new keyword as -
// class arr{
//     public static void main(String[] args) {
//         // int a[][]=new int[2][3];
//         // System.out.println(a);
//         // System.out.println(a[0][0]);
//         // System.out.println(a[1][2]);
//         int b[][]=new int[2][];
//         System.out.println(b);
//         System.out.println(b[0]);//null
//         System.out.println(b[1]);//null
//         // System.out.println(b[0][0]);//nullpointer exception
//         // System.out.println(b[0][1]);//null pointer exception
//         // System.out.println(b[1][0]);//null pointer expection
//         // System.out.println(b[0][2]);//npe
//         // System.out.println(b[0][100]);//npe
//         // System.out.println(b[1][10000]);//npe
//         // System.out.println(b[2][0]);//index out of bound hehe
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         // int a[][]=new int [2][];
//         int c[][]={{1,2},{3,4}};
//         int d[][][]={c,c};
//         System.out.println(d[0][0][0]);
//         System.out.println(d[0][0][1]);
//         System.out.println(d[0][1][0]);
//         System.out.println(d[0][1][1]);
//         System.out.println(d[1][0][0]);
//         System.out.println(d[1][0][1]);
//         System.out.println(d[1][1][0]);
//         System.out.println(d[1][1][1]);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         int a[]={1,2,3,9,4,2,7};
//         int b[]=new int[5];
//         System.arraycopy(a, 0, b, 0, 5);
//         // System.arraycopy(a, 0, b, 0, 3);
//         // System.arraycopy(a,1,b,2,3);
//         for(int c:b)
//         System.out.println(c);
//     }
// }
//(obj src,int srcpos,obj dest,int destpos,int len)


// this form is discouraged
// int a[];
// however,convention discourages this form;the brackets identify the array type and 
// should appear with the type designation
//use this instead--
//int[] a;


// class ar{
//     public static void main(String[] args) {
//         int[][] a=new int[3][2];

//         a[0][0]=1;
//         a[0][1]=2;
//         a[1][0]=3;
//         a[1][1]=4;
//         a[2][0]=5;
//         a[2][1]=6;
//         //3*2=6 done

//         for(int[] x: a){
//             for(int y:x)
//             System.out.println(y);
//         }
//     }
// }

// variable ariety
// class ar{
//     public static void main(String[] args) {
//         A a=new A();
//         a.show(2,3,4,1,9);
//         // Scanner sc=new Scanner(System.in);
//         // int x=sc.nextInt();
//         // a.show(x);
//     }

// }
// class A{
//     void show(int a,int b,int ...arr){
//         System.out.println("array length is : "+arr.length);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String a=new String("Rohit");
//         System.out.println(a);
//         String b="Rohit";
//         System.out.println(b);
//         b=b+" Dumka";
//         System.out.println(b);
//         String c="Ana";
//         System.out.println(c+ " De Armas");
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String a="Rohit";
//         // System.out.println(a);
//         // System.out.println(a.charAt(0));
//         // System.out.println(a.charAt(2));
//         // System.out.println(a.hashCode());
//         // String b="a";
//         // System.out.println(b.hashCode());
//         // System.out.println(a.replace('R', 'M'));//Mohit 
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         // String s="Rohit";
//         String s=new String("Rohit");
//         s.concat(" Dumka");
//         System.out.println(s);//stirng is immutable 


//         StringBuffer sb=new StringBuffer("Rohit");
//         sb.append(" Dumka");
//         System.out.println(sb);//mutable
//     }
// }


// 2. in string class eq method meant for content comparison
// but in string buffer eq method meant for reference /address
// class ar{
//     public static void main(String[] args) {
//         String s=new String("Rohit");
//         String s2=new String("Rohit");
//         System.out.println(s==s2);//reference comparison or address comparison
//         System.out.println(s.equals(s2));


//         StringBuffer sb=new StringBuffer("Rohit");
//         StringBuffer sb2=new StringBuffer("Rohit");

//         System.out.println(sb==sb2);
//         System.out.println(sb.equals(sb2));
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s=new String("Rohit");
//         s.concat(" Dumka");
//         s=s.concat(" Hello");
//         System.out.println(s);
//     }
// }


// class ar{
//     public static void main(String[] args) {
//         String s=new String("Spring");
//         s.concat(" Fall");
//         String s2=s.concat(" Winter");
//         s2.concat(" Summer");

//         System.out.println(s);
//         System.out.println(s2);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s="RohitD";
//         System.out.println(s.substring(3));
//         System.out.println(s.substring(1,4));
//         System.out.println(s.indexOf('h'));
//         System.out.println(s.indexOf('z'));//not avail
//         String s2="abcda";
//         System.out.println(s2.indexOf('a'));
//         System.out.println(s2.lastIndexOf('a'));
//     }
// }

// class ar{
//     public static void main(String[] args) {
//     String s="JavaProgramming";
//     char a[]=s.toCharArray();
//     for(int x:a)
//     System.out.println(x);
//     }
// }

//remove duplicacy
// class ar{
//     public static void main(String[] args) {
//         String s="abcada";
//         String m="";
//         for(int i=0;i<s.length();i++)
//         {
//         if(!m.contains(""+s.charAt(i)))
//         {
//             m+=s.charAt(i);

//         }
//         }
//         System.out.println(m);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s="hello";
//         System.out.println(s.contains("he"));
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String a="abcada";
//         String result = "";
//         for (int i = 0; i < a.length(); i++) {
//             if(!result.contains(String.valueOf(a.charAt(i)))) {
//                 result += String.valueOf(a.charAt(i));
//             }
//         }
//         System.out.println(result);
//     }
// }


// class ar{
//     public static void main(String[] args) {
//         String s="ababbbaccdba";
//         System.out.println(remdup(s));
//     }
//     public static String remdup(String str){
//         String m="";

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(m.indexOf(ch)==-1){
//                 m+=ch;
//             }
//         }
//         return m;
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s="Java is a programming language";
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
//             {
//                 System.out.println(s.charAt(i)+" ");
//             }
//         }
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s="abadaacddebba";
//         String m="";
//         for(int i=0;i<s.length();i++){
//             if(!m.contains(""+s.charAt(i))){
//                 m=m+s.charAt(i);
//             }
//         }
//         System.out.println(m);
//     }
// }


// class ar{
//     public static void main(String[] args) {
//         String s="abacda";
//         int count =0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='a'){
//                     count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s="abacdsa";
//         String s2="a";
//         int count=0;
//         int index=s.indexOf(s2);
//         for(int i=0;i<s.length();i++){
//             if(index!=-1){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// s1>s2 : returns positive num
// s1<s2 : returns negative num
// s1==s2: returns 0


// class ar{
//     public static void main(String[] args) {
//         String s1="ABCD";
//         String s2="BCDE";
//         System.out.println(s1.compareTo(s2));//A-B=65-66=-1
//     }
// }


// class ar{
//     public static void main(String[] a) {
//         // System.out.println(a[0]);

//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i]);
//         }
//     }
// }


//string reverse
// class ar{
//     public static void main(String[] args) {
//         String m="hello hehe";

//         String r="";
//         for(int i=m.length()-1;i>=0;i--){
//             r=r+m.charAt(i);
//         }
//         System.out.println(r);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         int s=0;
//         for(int i=0;i<args.length;i++){
//             s=s+Integer.parseInt(args[i]);//wrapper class
//         }
//         System.out.println("Sum is : "+s);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s="hello";
//         String rev="";
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             rev+=s.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }


// class ar{
//     public static void main(String[] args) {
//         String s="hello";
//         String rev="";
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             rev+=s.charAt(i);
//         }

//         System.out.println(s.equals(rev));
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s="12P3rd";
//         int sum=0;
//         for(int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             if(Character.isDigit(c))
//             {
//                 int x=Character.getNumericValue(c);
//                 sum+=x;
//             }
//         }
//         System.out.println(sum);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         try{
//             System.out.println(6/0);
//         }
//         catch(ArithmaticException e)
//         {
//             sout(e);
//         }
//         System.out.println("hi");
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         try{
//             int a[]={1,2};
//             System.out.println(a[3]);
//             System.out.println("heool");
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("/ by zero");
//         }
//         System.out.println("end of program");
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         System.out.println(5/2);
//         throw new ArithmeticException("/by zero");

//         // System.out.println(3/2);
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         int i=5;
//         try{
//             if(i<10){
//                 throw new Exception("Error i is less than  10");
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         A a=new A();
//         a.add();
//     }
// }
// class A{
//     void add(){
//         System.out.println("hello");
//     }
//     int add(int x){
//         return x;
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         ar a=new ar();
//         B b=new B();
//         b.show();
//     }
//     void show(){
//         System.out.println("hello : ar");
//     }

// }
// class B extends ar{
//     void show(){
//         System.out.println("hello : b");
//     }
// }

// class arr{
//     public static void main(String[] args) {
//         Animal animal=new B();
//         animal.run();
//     }
// }
// interface Animal{
//     void run();
// }
// class B implements Animal{
//     public void run(){
//         System.out.println("Dog is running");
//     }
// }


// class arr{
//     public static void main(String[] args) {
//         int i=5;
//         try{
//             if(i<10)
//             {
//                 throw new Exception("error hehe");
//             }
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//     }
// }

// class arr{
//     public static void main(String[] args) {
//         int i=5;
//         try{
//             if(i<10)
//             {
//                 throw new MyException("error hehe");
//             }
//         }
//         catch(MyException e)
//         {
//             System.out.println(e);
//         }
//     }
// }

// class MyException extends Exception{
//     public MyException(String s){
//         super(s);
//     }
// }



//======================================================
//Abstract class

//------------------------------------------------------

// class ap extends hello{
//     public static void main(String[] args) {
//         ap a=new ap();
//         a.show();
//         a.ok();
//         a.hehe();
//     }
//     void show(){
//         System.out.println("1");
//     }
//     void ok(){
//         System.out.println("2");
//     }
// }

// abstract class hello{
//     abstract void show();
//     abstract void ok();
//     void hehe(){
//         System.out.println("3");
//     }
// }


//-----------------------------------------
//inheritance
//--------------------------------------


// public class Inhert extends Inherit2{
//     int a=9;
//     // Inhert(){
//     //     super(1);

//     // }
//     public static void main(String args[]){
//         // Inherit2 obj = new Inherit2();
//         Inhert obj2 = new Inhert();
//         System.out.println(obj2.huihui());
//     }

//     int show(){
//         return super.a;
//     }
//     int huihui(){
//         return super.show();
//     }

// }
// class Inherit2{
//     int a=8;
//     Inherit2(){        System.out.println("hello");
//     }
//     int show(){
//         return 3;
//     }
// }

//=======================================
//           overloading
//---------------------------------------

// class o extends p{
//     public static void main(String[] args) {
//         o obj = new o();
//         obj.show();
//         obj.show(1);
//     }
//     //
//     void show(int a){
//         System.out.println("parameters : "+a);
//     }
// }
// class p{
//     void show(){
//         System.out.println("P");
//     }
// }
// //overloading in inhertance coz iski copy bhi child me avial hai too same class me 2 same methods hogye hehe 


// //overloading in same class=> same method name but diff signature
// class o extends p{
//     public static void main(String[] args) {
//         o obj = new o();
//         obj.show();
//         obj.show(1);
//     }
//     void show(){
//         System.out.println("without parameter");
//         super.show();
//     }
//     void show(int a){
//         System.out.println("parameters : "+a);
//     }
// }


// //overloading + overriding
// class o extends p{
//     public static void main(String[] args) {
//         o obj = new o();
//         obj.show();
//         obj.show(1);
//     }
//     void show(){
//         System.out.println("without parameter");
//         super.show();
//     }
//     void show(int a){
//         System.out.println("parameters : "+a);
//     }
// }
// class p{
//     void show(){
//         System.out.println("P");
//     }
// }

// overload- compiletime 
// overriding - runtime



//annonymous class-----------------------
//----------------------------------

// class eno{
//     public static void main(String[] args) {
//         //parent a=new chld()
//         eno a = new eno(){//eno=eno+additional => inheritance in simple terms or upcasting . annonymous class
//             int a=10;
//             void show(){
//                 System.out.println("Anonymous class");
//             }
//         };
//         a.show();
//     }
//     void show(){
//         System.out.println("eno");
//     }
// }



//wrapper class 

// public class wrap {
//     int i=0;
//     Integer j = (Integer)2;
//     int k=(int)j;
// }


//------------------------------------

//upcasting and downcasting

//------------------------------------

import java.security.cert.CertPathBuilderException;

// public class updown extends temp{
//     public static void main(String[] args) {
//         temp obj = new updown(); //parent ka obj , memory mil rhi hai child ki
//         obj.show();
//         // obj.disp(); coz disp ke liye storage nahi hai 
//         obj.display();
//     }
//     // void show(){
//     //     System.out.println("updown : show");
//     // }
//     void disp(){
//         System.out.println("updown : disp");
//     }
// }
// class temp{
//     int a=9;
//     void show(){
//         System.out.println("temp : show");
//     }
//     void display(){
//         System.out.println("temp : display");
//     }
// }



// public class updown extends temp{
//     public static void main(String[] args) {
//         // temp obj3=new child();
//         //child obj4=(child)(obj3);
//         temp obj = new updown(); 
//         updown obj2 = (updown)(obj);
//         //parent ki memory, child ko milegi.... 
//         //jiss child ko upcast kiya h.... uah object wapas ussi child me downcast hoga
//         obj2.show();
//         obj2.display();
//         obj2.disp();
//     }
//     void show(){
//         System.out.println("updown : show");
//     }
//     void disp(){
//         System.out.println("updown : disp");
//     }
// }
// class child extends temp{
//     void show(){
//         System.out.println("child : show");
//     }
//     void disp(){
//         System.out.println("child : disp");
//     }
// }
// class temp{
//     int a=9;
//     void show(){
//         System.out.println("temp : show");
//     }
//     void display(){
//         System.out.println("temp : display");
//     }
// }
