// import java.io.File;
// class io
// {
//     public static void main(String[] args) {
//         File f=new File("C:/Users/Rohit Dumka/Desktop/javapr/practise/a.txt");
//         System.out.println(f.exists());//tells if file exists or not
//         System.out.println(f.canWrite());
//         System.out.println(f.getName());
//         System.out.println(f.length());
//     } 
// }

// import java.io.*;
// class io{
//     public static void main(String args[])throws Exception
//     {
//         int i;
//         // to write--
//         FileOutputStream fout=new FileOutputStream("C:/Users/Rohit Dumka/Desktop/javapr/practise/a.txt",true);
//         // to write and append--
//         // FileOutputStream fout=new FileOutputStream("C:/Users/Rohit Dumka/Desktop/javapr/practise/a.txt",true);

//         String s="TATA";

//         char ch[]=s.toCharArray();
//         for(i=0;i<s.length();i++)
//             fout.write(ch[i]);
//         fout.close();
//     }
// }

// import java.io.*;
// class io{
//     public static void main(String[] args) throws Exception
//     {
//         int i;
//         // FileOutputStream fo=new FileOutputStream("C:/Users/Rohit Dumka/Desktop/javapr/practise/a.txt");
//         FileOutputStream fo=new FileOutputStream("C:/Users/Rohit Dumka/Desktop/javapr/practise/a.txt",true);
//         String s=" haahhaaha";
//         char ch[]=s.toCharArray();
//         for(i=0;i<s.length();i++)
//             fo.write(ch[i]);
//         fo.close();

//         FileInputStream f=new FileInputStream("C:/Users/Rohit Dumka/Desktop/javapr/practise/a.txt");
//         do{
//             i=f.read();
//             if(i!=-1)
//                 System.out.print((char)i);
//         }while(i!=-1);
//         f.close();
//     }
// }


// import java.io.*;
// class io{
//     public static void main(String[] args)throws Exception 
//     {
//         FileWriter f=new FileWriter("a.txt",true);
//         BufferedWriter bf=new BufferedWriter (f);
//         bf.write("computer");
//         bf.close();
//     }
// }

// import java.io.*;
// class io{
//     public static void main(String[] args)throws Exception
//     {
//         int ch;
//         BufferedReader bf=new BufferedReader(new FileReader("C:/Users/Rohit Dumka/Desktop/javapr/practise/a.txt"));
//         while((ch=bf.read())!=-1)
//         {
//             System.out.print((char)ch);
//         }
//         bf.close();
//     }
// }



// import java.io.*;
// class io{
//     public static void main(String[] args)throws Exception
//     {
//         int ch;
//         BufferedReader bf=new BufferedReader(new FileReader("a.txt"));
//         String s;
//         while((s=bf.readLine())!=null)
//         {
//             System.out.println(s);
//         }
//         bf.close();
//     }
// }
