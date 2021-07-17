import java.util.*;
public class Binomial{

static int binomialCoeff(int n,int k){
if(k>n){
return 0;
}
if(k==0||k==n){
return 1;
}
return binomialCoeff(n-1,k-1)+ binomialCoeff(n-1,k);

}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter values to find binomial coefficient:");
int n=s.nextInt();
int k=s.nextInt();
int x=binomialCoeff(n,k);
System.out.println("Binomial coefficient for C"+"("+n+","+k+"):"+x);
}
}

// time complexity for this binomail will be O(n*k).
