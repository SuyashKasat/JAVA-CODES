i import java.util.*;
public class Fibonacci{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of terms:");
int x=s.nextInt();
System.out.println("Fibonacci series is:");
int t1=0,  t2=1, nextTerm;
for(int i=0;i<x;i++){
System.out.print( t1 +",");
nextTerm=t1+t2;
t1=t2;
t2=nextTerm;
}
}
}

// TIME complexity for this is O(n) as for loop is there which will run for n times.