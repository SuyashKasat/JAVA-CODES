import java.util.*;
public class Problem{
int choice =0;
public int GCD(int n, int m){
if (n%m==0){
return m;}
n=n%m;
choice ++;
return GCD(m,n);
}
public static void main(String [] args){
Scanner s=new Scanner(System.in);
Problem obj=new Problem();
System.out.println("Enter values of n and m respectively:");
int y=s.nextInt();
int z=s.nextInt();
int x=obj.GCD(y,z);
System.out.print("Recursion calls are:" + obj.choice + "\n");
System.out.println("Answer of the problem is:" + x);
}
}

/*The key to understand this is to observe that "when a is divided by b, remainder is always less than or equal to a/2". Why ? Because if remainder is more than a/2, and since divisor is always greater than remainder, then divisor is also more than a/2, and so sum of divisor and remainder becomes more than a, which can't be possible.

Now when we find gcd(a,b), (suppose a>b, if not, swap a and b), in the first step, a is dividend and b is divisor, we find some remainder r1. Then in second step, r1 becomes divisor and b becomes dividend. Now again we divide b by r1 and get some remainder r2, but due to above property, r2≤b/2.

So in two steps, remainder is at most b/2. We terminate the process once we reach remainder of 0. In the worst case, every 2-step reduces remainder to b/2, and thus we need log2b such 2-steps, or total 2log2b steps.

So gcd(a,b) requires at most 2log2b recursive calls where b is min(a,b).

It is worth noting that number of recursive calls depends only on smaller number (not larger number).*/