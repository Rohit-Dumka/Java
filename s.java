//------------------------------------------------------
//                     check file and create
//------------------------------------------------------

// import java.io.*;
// class ab
// {	
// 	public static void main(String[] args)throws IOException
// 		{
            // create a object of file a.txt if it exists then f refers to a.txt else just obj will be created
// 			File  f = new File("a.txt");
// 			System.out.println(f.exists()); //true if file exists else false
// 			if(!f.exists()) 
// 			f.createNewFile(); //if file not exists then create a new file 
// 			System.out.println(f.exists()); //check if file exists ---obviously true coz we have created hehe 
// 		}
// }

//---------------------------------------------------
//                   check directory and create
//---------------------------------------------------

// import java.io.*;
// class s
// {	
// 	public static void main(String[] args)throws Exception
// 		{
// 			File  f = new File("ok");
// 			System.out.println(f.exists()); //true if directory exists else false
//             if(!f.exists()) 
// 			f.mkdir(); //if directory  not exists then create a new directory
// 			System.out.println(f.exists()); 
// 		}
// }



//----------------------------------------------------
//      create file in another location
//----------------------------------------------------

// import java.io.*;
// class s
// {	
// 	public static void main(String[] args)throws IOException
// 		{
// 			File  f = new File("C:/Users/Rohit Dumka/Desktop/javapr/file","hehe.txt"); // (file subdirectory,string name)
//             System.out.println(f.exists());
//             f.createNewFile();
// 			System.out.println(f.exists());
//             System.out.println(f.isFile());
//             System.out.println(f.isDirectory());
// 		}
// }

// f.isFile(); //check if f is referring to file 
// f.isDirectory(); //check if f is referring to directory
// long l =f.length(); //store length
// System.out.println(f.length()); //prints length of file


//------------------------------------------------------------------------
//             print all files & directories inside a direcotory
//                          also count files and dirs
//-------------------------------------------------------------------------
// import java.io.*;
// class s
// {	
// 	public static void main(String[] args)throws Exception
// 		{
//             int count=0;
// 			File  f = new File("C:/Users/Rohit Dumka/Desktop/javapr/practise");
//             String[] s=f.list();
//             for(String s1:s)
//             {
//                 count++;
//                 System.out.println(s1);
//             }
//             System.out.println("total number of files are : "+count);
//     	}
// }


//------------------------------------------------------
//      print and count only files no directories
//------------------------------------------------------

// import java.io.*;
// class s
// {	
// 	public static void main(String[] args)throws Exception
// 		{
//             int count=0;
// 			File  f = new File("C:/Users/Rohit Dumka/Desktop/javapr/practise");
//             String[] s=f.list();
//             for(String s1:s)
//             {
//                 File f1=new File(f,s1);
//                 if(f1.isFile()) //or => !f1.isfile()  => if you want directories etc
//                 {
//                     count++;
//                     System.out.println(s1);
//                 }
//             }
//             System.out.println("total number of files are : "+count);
//     	}
// }

//------------------------------------------------
//                names of directories and count
//------------------------------------------------


// import java.io.*;
// class s
// {	
// 	public static void main(String[] args)throws Exception
// 		{
//             int count=0;
// 			File  f = new File("C:/Users/Rohit Dumka/Desktop/javapr/practise");
//             String[] s=f.list();
//             for(String s1:s)
//             {
//                 File f1=new File(f,s1);
//                 if(f1.isDirectory())
//                 {
//                     count++;
//                     System.out.println(s1);
//                 }
//             }
//             System.out.println("total number of Directories are : "+count);
//     	}
// }


// import java.io.*;
// class s{
//     public static void main(String[] args)throws Exception 
//     {
//         FileWriter fw=new FileWriter("abc.txt",true);
//         fw.write(100);
//         fw.write("urga\nsoftware solutions");
//         char[] ch={'a','b','c'};
//         fw.write('\n');
//         fw.write(ch);
//         fw.flush();
//         fw.close();
//     }
// }

// import java.io.*;
// class s{
//     public static void main(String[] args)throws Exception
//     {
//         FileReader fr=new FileReader("s.java");
//         int i=fr.read();
//         while(i!=-1)
//         {
//             System.out.print((char)i);
//             i=fr.read();
//         }
//     }
// }

// import java.io.*;
// class s{
//     public static void main(String[] args)throws Exception
//     {
//         File f=new File("s.java");
//         //typecast necessary coz return type of length() is long but in java array maximum size is int only 
//         char[] ch=new char[(int)f.length()];
//         FileReader fr=new FileReader(f);

//         fr.read(ch); //all data stored in ch;

//         for(char ch1:ch)
//             System.out.print(ch1);
//          fr.close();
//     }
// }


//buffered writer 

// import java.io.*;
// class s{
//     public static void main(String[] args)throws Exception 
//     {
//         FileWriter fw=new FileWriter("a.txt");//cant' communicate directly therefore fw required
//         BufferedWriter bw=new BufferedWriter(fw);
//         bw.write(100);
//         bw.newLine();
//         char[] ch={'a','b','c'};
//         bw.write(ch);
//         bw.newLine();
//         bw.write("durga");
//         bw.newLine();
//         bw.write("software solutions");
//         bw.flush();
//         bw.close();
//     }
// }

//buffered reader------------

import java.io.*;
class s{
    public static void main(String[] args) throws Exception
    {
        FileReader fr=new FileReader("a.txt");
        BufferedReader br=new BufferedReader(fr);

        String line=br.readLine();

        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
    }
}
