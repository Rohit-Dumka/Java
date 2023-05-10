// find minimum of an array
class str{  
    static void min(int arr[]){  
        int min=arr[0];  
        for(int i=1;i<arr.length;i++)  
            if(min>arr[i])  
            min=arr[i];  
      
        System.out.println(min);  
    }  
      
    public static void main(String args[]){  
        int a[]={33,3,4,5,-3,-13,0};
        min(a);
    }
}  


// print 3rd largest element of an array: 

public class str{  
    public static int getThirdLargest(int[] a){  
    int temp;  
    for (int i = 0; i < a.length; i++)   
            {  
                for (int j = i + 1; j < a.length; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
            for(int x: a)
                System.out.print(x + " ");
            System.out.println();
           return a[a.length-3];  
    }  
    public static void main(String args[]){  
    int a[]={1,3,-12,21,15,7};  
    int b[]={44,76,11,-2,2,1,19,22};  
    System.out.println("Third Largest num: "+getThirdLargest(a));  
    System.out.println("Third Largest num: "+getThirdLargest(b));  
    }
}  

// output: 

// -12 1 3 7 15 21 
// Third Largest: 7
// -2 1 2 11 19 22 44 76
// Third Largest: 22

    
    
