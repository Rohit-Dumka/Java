import java.io.*;

import javax.lang.model.util.ElementScanner14;
class f
{
    public static void main(String[] args)throws Exception 
    {
        PrintWriter pw=new PrintWriter("f.txt");
        pw.print("abcDE12fGhiJk34");
        pw.close();

        FileReader fw=new FileReader("f.txt");
        int i=fw.read();
        String s="";
        while(i!=-1)
        {
            if((i>47&&i<57))
            {
                i=fw.read();
            }
            else
            {
                System.out.print((char)i);
                s=s+(char)i;
                i=fw.read();
            }
        }
        System.out.println();
        System.out.println(s);
        StringBuffer s1=new StringBuffer(s);
        for(i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
                s1.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            else if(Character.isUpperCase(s.charAt(i)))
                s1.setCharAt(i,Character.toLowerCase(s.charAt(i)));
        }

        System.out.println(s1);

        PrintWriter p=new PrintWriter("f.txt");
        p.print(s1);
        p.close();

        FileReader filer=new FileReader("f.txt");
        int j=filer.read();
        while(j!=-1)
        {
            System.out.print((char)j);
            j=filer.read();
        }
        filer.close();
    }
}
