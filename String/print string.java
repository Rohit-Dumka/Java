import java.io.*;
class str
{
    public static void main(String[] args)throws Exception 
    {
        PrintWriter pw=new PrintWriter("x.txt");
        pw.write("ab12XY23uyA80cl");
        pw.close();

        FileReader fr=new FileReader("x.txt");
        int i=fr.read();
        String s="";
        while(i!=-1)
        {
            if((i>47 && i<57))
            {
                i=fr.read();
            }
            else
            {
                s+=(char)i;
                i=fr.read();
            }
        }
        System.out.println(s);
        fr.close();

        StringBuffer s1=new StringBuffer(s);
        for(i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
                s1.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            else
                s1.setCharAt(i,Character.toLowerCase(s.charAt(i)));
        }
        System.out.println(s1);
        System.out.println();

        PrintWriter pw2=new PrintWriter("x.txt");
        pw2.print(s1);
        pw2.close();
        
        FileReader fr2=new FileReader("x.txt");
        int j=fr2.read();
        while(j!=-1)
        {
            System.out.print((char)j);
            j=fr2.read();
        }
        fr2.close();
    }
}
