class S
{
    public static void main(String[] args) {
        String str="racecar";
        int a=check(str);
        if(a==1)
        {
            System.out.println("palindrome");
        }    
        else
            System.out.println("not a palindrome");
    }
    static int check(String s)
    {
        int l=s.length();
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(l-1-i))
            {
                return 0;
            }
        }
        return 1;
    }
}

