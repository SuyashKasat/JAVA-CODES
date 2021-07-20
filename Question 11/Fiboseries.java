import java.util.*;
public class Fiboseries{
static int Recursion(int n){
if(n==0){
return 0;
}

if (n==1 || n==2){
return 1; 
}

return Recursion(n-2)+ Recursion(n-1);
}
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a no:");
int x=s.nextInt();
System.out.print("Fibonacii Series up to no. of terms is:");
for(int i=0; i<x;i++){
int z= Recursion(i);
System.out.print(z+" ");
}
}
}
*/for n > 1:
T(n) = T(n-1) + T(n-2) + 4 (1 comparison, 2 subtractions, 1 addition)
Let’s say c = 4 and try to first establish a lower bound by approximating that T(n-1) ~ T(n-2) , though T(n-1) ≥ T(n-2), hence lower bound
T(n) = T(n-1) + T(n-2) + c
     = 2T(n-2) + c    //from the approximation T(n-1) ~ T(n-2)
     = 2*(2T(n-4) + c) + c
     = 4T(n-4) + 3c
     = 8T(n-6) + 7c
     = 2^k * T(n - 2k) + (2^k - 1)*c
Let's find the value of k for which: n - 2k = 0
k = n/2
T(n) = 2^(n/2) * T(0) + (2^(n/2) - 1)*c
     = 2^(n/2) * (1 + c) - c
i.e. T(n) ~ 2^(n/2)
now for the upper bound, we can approximate T(n-2) ~ T(n-1) as T(n-2) ≤ T(n-1)
T(n) = T(n-1) + T(n-2) + c
     = 2T(n-1) + c    //from the approximation T(n-1) ~ T(n-2)
     = 2*(2T(n-2) + c) + c
     = 4T(n-2) + 3c
     = 8T(n-3) + 7c
     = 2^k * T(n - k) + (2^k - 1)*c
Let's find the value of k for which: n - k = 0
k = n
T(n) = 2^n * T(0) + (2^n - 1)*c
     = 2^n * (1 + c) - c
i.e. T(n) ~ 2^n
Hence the time taken by recursive Fibonacci is O(2^n) or exponential*/
//Time complexity for recusrive Fibonacci is O(2^n)