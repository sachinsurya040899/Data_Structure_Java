/*

Given a string S consisting of only '(' and ')', print 'yes' if it is balanced otherwise print 'no'.

Sample Testcase :
=================

INPUT
=====
(())

OUTPUT
======
yes

*/
import java.util.Scanner;
class Ds_10 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		String s=sa.next();
		int forward=0;
		int backward=0;
		String s1="(";
		for(int i=0;i<s.length();i++){
			if(s1.equals(String.valueOf(s.charAt(i)))){
				forward++;
			}
			else{
				backward++;
			}
		}
		if(forward==backward){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}
