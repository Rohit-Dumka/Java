// class ar{
//     public static void main(String[] args) {
//         int a[]=null;
//         System.out.println(a);
//         System.out.println(a[0]);
//     }
// }


// class arr
// {
// 	public static void main(String[] args)
// 		{
// 			int a[]=null;
// 			System.out.println(a);
// 			//System.out.println(a[0]);//null pointer exception
// 			int b[]={1,2};
// 			System.out.println(b);//objcode
// 			System.out.println(b[0]);
// 			System.out.println(b[1]);
// 			int c[][]={b,a};
// 			System.out.println(c[0][0]);
// 			System.out.println(c[0][1]);
// 			//System.out.println(c[0][2]);//index out of bound
// 			System.out.println(c[1]);//null
// 			System.out.println(c[1][0]);//null pointer exception
// 		}
// }



// class ar{
//     public static void main(String[] args) {
//         int a[][]={{1,2},{1,2,3,4},{1,4,5}};
//         // for(int i=0;i<a.length;i++)
//         // {
//         //     for(int j=0;j<a[i].length;j++)
//         //     {
//         //         System.out.print(a[i][j]);
//         //     }
//         //     System.out.println();
//         // }

//         for(int i[]:a)
//         {
//             for(int j:i)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//         System.out.println("**********************\n********************");
//         int b[][][]={{{2,11},{11,9,12}},{{1,12,9},{2,4,5}}};
//         // for(int i=0;i<b.length;i++)
//         // {
//         //     for(int j=0;j<b[i].length;j++)
//         //     {
//         //         for(int k=0;k<b[i][j].length;k++)
//         //         {
//         //             System.out.print(b[i][j][k]+ " ");
//         //         }
//         //         System.out.println();
//         //     }
//         //     System.out.println();
//         // }

//         for(int i[][]:b)
//         {
//             for(int j[]:i)
//             {
//                 for(int k:j)
//                 {
//                     System.out.print(k+ " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
        
//     }
// }

// class ar
// {
//     public static void main(String[] args) {
//         int a[];
//         // a=new int [2];
//         // System.out.println(a[0]);
//         // System.out.println(a[1]);
//         int b[][]=new int[2][];
//         System.out.println(b[0]);//null
//         System.out.println(b[1]);//null
//         // System.out.println(b[2]);//indexout of bound
//         // System.out.println(b[0][0]);//null pointer exc
//         // System.out.println(b[0][1]);//null pointer exc
//         System.out.println(b[0][2]);//null pointer exc lol
//     }
// }


// class arr{
//     public static void main(String[] args) {

//         String a="Rohit";
//         System.out.println(a);
//         System.out.println(a.charAt(0));
//         System.out.println(a.charAt(2));
//         System.out.println(a.hashCode());
//         String b="a";
//         System.out.println(b.hashCode());
//         System.out.println(a.replace('R', 'M'));//Mohit 
//     }
// }

//remove dup----


// class ar{
//     public static void main(String[] args) {
//         String s="abcadafabe";
//         String m="";

//         for(int i=0;i<s.length();i++)
//         {
//             if(!m.contains(""+ s.charAt(i)))
//             {
//                 m=m+ s.charAt(i);
//             }
//         }
//         System.out.println(m);
//     }
// }

//number of a--

// class ar{
//     public static void main(String[] args) {
//         String s="abcabdaeef";
//         int count=0;
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)=='a')
//             {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// class ar
// {
//     public static void main(String[] args) {
//         String s="abcdEF";
//         // System.out.println(s.toUpperCase());

//         // for(String i:args)
//         // {
//         //     System.out.println(i);
//         // }
//         // //to print cla

//         //reverse print cla

//         // for(int i=args.length-1;i>=0;i--)
//         // {
//         //     System.out.println(args[i]);
//         // }
        

//         // reverse cla input===============
//         System.out.println();
//     }
// }


// class ar
// {
//     public static void main(String[] args) {
//         String s="1a2345B12cd678x";
//         int count=0;
//         for(int i=0;i<s.length();i++)
//         {
//             char c=s.charAt(i);
//             if(Character.isDigit(c))
//             {
//                 count++;
//                 String s=""+ c;

//             }
//             if(count>=3)
//             System.out.println(s);
//         }
//     }
// }

// class ar{
//     public static void main(String[] args) {
//         String s="12xr45df";
//         int sum=0;
//         for(int i=0;i<s.length();i++)
//         {
//             char c=s.charAt(i);
//             if(Character.isDigit(c))
//             {
//                 int k=Character.getNumericValue(c);
//                 sum+=k;
//             }
//         }
//         System.out.println(sum);
//     }
// }
