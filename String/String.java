// parseint convert string to integer ..now we can use that vlue as integer 
// and then perform arithmatic operations on it 

class str{
    public static void main(String[] args) {
        String s="12";
        int x=Integer.parseInt(s);
        System.out.println(x+x);
    }
}

//syntax ==> string.replace("char/substring of string","new char/substring")
class str{
    public static void main(String[] args) {
     String s="Rohit";
     s=s.replace("R","M");
     System.out.println(s);   
    }
}


//concat of strings 
// we can concat two or more strings ezpz using + operator or concat method
//syntax==>
// String a="abc"; String b= "cd";a+b;         : abccd
//a+ " hello";                                 : abc hello 
//"ro" + "hit"                                 : rohit 
//"hey" + " java" + " is" + " beautiful"       : hey java is beautiful
//a.concat(b)                                  : abccd
class str{
    public static void main(String[] args) {
        String a="git";
        String b="hub";
        String s1="Rohit";
        String s2="Dumka";

        System.out.println(a+b);
        System.out.println(s1+" hello");   
        System.out.println(s1 + " " + s2);
        System.out.println(a.concat(b));
    }
}

