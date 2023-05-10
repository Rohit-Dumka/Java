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
