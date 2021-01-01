/*

Given 2 numbers a and B.Print the value of a!/b!.
Input Size : A,B <= 10000 and A-B <= 5

Sample Testcase :
=================

INPUT
=====
4 2

OUTPUT
======
12

*/
import java.util.Scanner;
class Ds_9 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
		int b=sa.nextInt();
		int in=1;
		int in2=1;
		for(int i=1;i<=a;i++){
			in=in*i;
		}
		for(int i=1;i<=b;i++){
			in2=in2*i;
		}
		System.out.print(in/in2);
	}
}
