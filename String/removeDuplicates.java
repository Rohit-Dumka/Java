class str{
    public static void main(String[] args) {
        String s="abcaabgedda";
        String m="";
        for(int i=0;i<s.length();i++)
        {
            if(!m.contains(""+s.charAt(i)))
            {
                m+=s.charAt(i);
            }
        }
        System.out.println(m);
    }
}
