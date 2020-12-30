/*

Given a number N and K followed by N elements and K elements. Now insert the given 
K elements one by one into the array and print the maximum in the array after each insertion .
Input Size : K <= N <= 10000(read about priority queues and implement)

Sample Testcase :
=================
INPUT
=====
5 2
1 2 3 4 5
5 4

OUTPUT
======
5 5

*/


// **********************Using Collections*******************//

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Ds_4 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int k=sa.nextInt();
		ArrayList ar=new ArrayList();
		int b[]=new int[k];
		for(int i=0;i<n;i++){
			int num=sa.nextInt();
			ar.add(num);
		}
		for(int i=0;i<b.length;i++){
			b[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			ar.add(b[i]);
			if(i==b.length-1){
				System.out.print(Collections.max(ar));
			}
			else{
				System.out.print(Collections.max(ar)+" ");
			}
		}
	}
}


// *************************************************************//



// Without Using Collections

import java.util.Scanner;
class Ds_4
{
	public static void main(String args[]){
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int k=sa.nextInt();
		int a[]=new int[n+k];
		int b[]=new int[k];
		int index=1;
		for(int i=0;i<a.length;i++){
			if(i<n){
				a[i]=sa.nextInt();
			}
			else{
				a[i]=0;
			}
		}
		for(int i=0;i<b.length;i++){
			b[i]=sa.nextInt();
		}
		for(int i=0;i<b.length;i++){
			if(i==b.length-1){
				int in=(n-1)+index;
				a[in]=b[i];
				for(int j=0;j<a.length;j++){
					for(int k1=j+1;k1<a.length;k1++){
						if(a[j]<a[k1]){
							int temp=a[j];
							a[j]=a[k1];
							a[j]=temp;
						}
					}
				}
				System.out.print(a[0]);
				index++;
			}
			else{
				int in=(n-1)+index++;
				a[in]=b[i];
				for(int j=0;j<a.length;j++){
					for(int k1=j+1;k1<a.length;k1++){
						if(a[j]<a[k1]){
							int temp=a[j];
							a[j]=a[k1];
							a[k1]=temp;
						}
					}
				}
				System.out.print(a[0]+" ");
			}
		}
	}
}