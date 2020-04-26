import java.util.*;
public class TopBottomDP{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dp[]=new int[100];
		Arrays.fill(dp,0);
		System.out.println(fib(n,dp));
	}
	//using Recursion
	public static int fib(int n,int dp[]){
		//Base Case
		if(n==0 || n==1){
			return n;
		}
		//Overlapping
		if(dp[n]!=0)
			return dp[n];
		//Recursive Case
		int ans;
		ans=fib(n-1,dp)+fib(n-2,dp);
		return dp[n]=ans;
	}
}
