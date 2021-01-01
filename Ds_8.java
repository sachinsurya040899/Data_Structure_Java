/*

Given a string S of length N, find whether the given string is a palindrome using 
stack or linked list and print 'yes' otherwise print 'no'.
Input Size : 1 <= N <= 100000

Sample Testcases :
==================

INPUT
=====
GuviGeek

OUTPUT
======
no

*/
import java.util.Scanner;
class Ds_8 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String s=sa.next();
		String res="";
		for(int i=s.length()-1;i>=0;i--){
			res=res+s.charAt(i);
		}
		if(res.equals(s)){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
