import java.util.Scanner;
class Ds_2 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=a.length-1;i>=0;i--){
			if(i==0){
				System.out.print(a[i]);
			}
			else{
				System.out.print(a[i]+"->");
			}
		}
	}
}
