
class A
{
    public static void main(String[] args) {
        String s="  ";
  //       isEmpty()=> check if the string is empty or not  loophole - consider whitespaces as string too
   //      isBlank()=>      doesn't consider whitespaces as string  hehe 
        System.out.println(s.isBlank());
    
        System.out.println("123456".endsWith("3"));
        System.out.println("123456".startsWith("4",3));
        // startswith("prefix",offset) 
        //endswith("suffix")
    }
}


class A
{
    public static void main(String args[])
    {
        System.out.println("java".indexOf("a");
        Sytem.out.println("java".indexOf("v");
        System.out.println("abcdaba".indexOf("a",1); //ignore what's before start checking from index 1 if found return index
        System.out.println("aabjavacde".indexOf("av"); //return index of av if av is found , return only 1 index from where the substring begins
    }
}
