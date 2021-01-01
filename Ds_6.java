/*

Given a string S of length N, find if it forms a Palindrome after deleting 1 character.
Input Size : 1 <= N <= 100000

Sample Testcases :
==================
INPUT
=====
abxba

OUTPUT
======
YES

Input:
======
abcacbb

Expected Output:
================
NO

Input:
======
abcacbb

Expected Output:
================
NO

*/
import java.util.Scanner;
class Ds_6 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String s=sa.next();
		String res="";
		String str[]=s.split("");
		String res1=str[0];
		String res2="";
		for(int i=0;i<str.length;i++){
			if(res1.equals(str[i])){
				str[i]="0";
			}
		}
		str[0]="0";
		res1=str[0];
		for(int i=0;i<str.length;i++){
			if(!res1.equals(str[i])){
				res=res+str[i];
			}
		}
		String str1[]=res.split("");
		for(int i=str1.length-1;i>=0;i--){
			res2=res2+str1[i];
		}
		if(res.equals(res2)){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
	}
}