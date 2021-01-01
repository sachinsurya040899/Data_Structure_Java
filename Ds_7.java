/*

Given a number N. There will be N numbers given. Print the smallest number in the given list 
after each input(Hint use priority queue).
Input Size : N <= 100000

Sample Testcase :
=================

INPUT
=====
4
3 2 4 1

OUTPUT
======
3 2 2 1

Input:
======
5
5 3 6 1 0

Expected Output:
================
5 3 3 1 0

*/
import java.util.Scanner;
class Ds_7 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=-1;
		}
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
			for(int j=0;j<a.length;j++){
				for(int k=j+1;k<a.length;k++){
					if(a[j]!=-1 && a[k]==-1){
						System.out.print(a[j]+" ");	
						break;
					}
					else if(a[j]!=-1 && a[j]>a[k]){
						int temp=a[j];
						a[j]=a[k];
						a[k]=temp;
					}
				}
				if(i==a.length-1){
					System.out.print(a[j]);
					break;
				}
				else{
					break;
				}
			}
		}
	}
}