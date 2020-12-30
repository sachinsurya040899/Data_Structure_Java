/*

Given two numbers N,K and an array of size N, print the three nearest neighbours of 
K(nearest neighbours are numbers which have least difference with K).
Input Size : 4 <= N, K <= 100000

Sample Testcases :
==================
INPUT
=====
5 3
1 2 3 4 6

OUTPUT
======
2 4 1

*/
import java.util.Scanner;
class Ds_3 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int k=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[3];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==k){
				b[i]=a[i]+10;
				continue;
			}
			else{
				if(a[i]>k){
					b[i]=a[i]-k;
				}
				else{
					b[i]=k-a[i];
				}
			}
		}
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]>b[j]){
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					int temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
				}
			}
			if(i<3){
				c[i]=a[i];
			}
			else{
				break;
			}
		}
		for(int i=0;i<c.length;i++){
				if(i==c.length-1){
					System.out.print(c[i]);
				}
				else{
					System.out.print(c[i]+" ");
				}
		}
	}
}
