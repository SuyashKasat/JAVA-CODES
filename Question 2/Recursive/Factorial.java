import java.util.*;
public class Factorial{
static int myFact(int y){
int z=1;
if(y==0){
return z;}

else(y!=1){
z=y*myFact(y-1);
}
return z;
}
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("enter a no :");
int x=s.nextInt();
int f =myFact(x);
System.out.println("factorial of no is:" + f);
}
}

/*T(n) = T(n — 1) + 3
T(0) = 1

T(n) = T(n-1) + 3
     = T(n-2) + 6
     = T(n-3) + 9
     = T(n-4) + 12
     = ...
     = T(n-k) + 3k
as we know T(0) = 1
we need to find the value of k for which n - k = 0, k = n
T(n) = T(0) + 3n , k = n
     = 1 + 3n
that gives us a time complexity of O(n)*/