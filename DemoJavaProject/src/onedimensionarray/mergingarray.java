package onedimensionarray;


public class mergingarray {

	public static void main(String[] args) {
		int a[]= {2,4,6,8};
		int b[]= {10,20,30,40,50,60};
		int arr1=a.length;
		int arr2=b.length;
		int arr3[]=new int[arr1+arr2];
		int k =0;
		for(int i=0;i<a.length;i++)
		{
			arr3[k]=a[i];
			k=k+1;
		}
		
		for(int j=0;j<b.length;j++)
		{
			arr3[k]=b[j];
			k=k+1;
			
		}
		for(int m=0;m<arr3.length;m++)
		
		System.out.print(arr3[m]+",");
	}

}
/*[2, 4, 6, 8, 10, 20, 30, 40, 50, 60]*/

