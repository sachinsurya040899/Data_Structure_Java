/*

Mr. Kanga had a PhD in Heap Algorithms. Today, he was given a list of strings in random order. 
Help him sort the list in increasing order(lexicographically increasing) using heap sort.

Input Description:
===================
The first line is an integer N denoting the number of strings. The next line contains N space 
separated strings containing lower case English Alphabets.

Output Description:
===================
Print N space separated strings in increasing order.

Sample Input :
==============
2
bag axe

Sample Output :
===============
axe bag


*/
import java.util.Scanner;
class Ds_1 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		String a[]=new String[n];
		int b[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.next();
		}
		for(int i=0;i<a.length;i++){
			if(a[i].charAt(0)<=122 && a[i].charAt(0)>=97){
				b[i]=a[i].charAt(0);
			}
		}
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]>b[j]){
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					int temp1=b[i];
					b[i]=b[j];
					b[j]=temp1;
				}
			}
		}
      for(int i=0;i<a.length;i++){
         if(i==a.length-1){
           System.out.print(a[i]);
         }
         else{
          System.out.print(a[i]+" ");  
         }
      }
	}
}