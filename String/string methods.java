
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
