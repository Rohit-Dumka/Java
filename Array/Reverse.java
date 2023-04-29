class Reverse//class with main
{
	public static void main(String args[])
	{
		int a[]={2,4,8,9};
		for(int i=0;i<a.length;i++)
		System.out.print(a[i] + " ");
		a=B.reverse(a);
		System.out.println("\n reversed array -");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i] + " ");//printing reversed array
	}
}


class B
{
	static int[] reverse(int a[])
	{	
		int l=a.length-1;
		int x[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			x[i]=a[l--];
		}
		return x;
	}
}
