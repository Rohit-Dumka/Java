class Palindrome{
    static int c(int x)
    {
        int y=x;
        int r=0,s=0;
        while(x>0)
        {
            r=x%10;
            s=s*10+r;
            x=x/10;
        }
        if(s==y)
            return 1;
        else
            return 0;
    }
	public static void main(String[] args)
           {
               int[] a={111,222,333,121};
               int x=1;
               for(int i=0;i<a.length;i++)
               {
                    x=c(a[i]);
                    if(x==0)
                        System.out.println(0);
                    else
                        System.out.println(1);
               }
           }
}
