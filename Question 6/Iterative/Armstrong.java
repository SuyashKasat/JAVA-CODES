import java.util.*;
import java.lang.Math;
public class Armstrong{
static void Check(){
Scanner s=new Scanner(System.in);
System.out.print("enter a number to check if its armstrong or not:");
int x=s.nextInt();
int num=x;
int n=String.valueOf(x).length();
double result=0;
for(int y=x;y>0;y=y/10){
int remainder=x%10;
result=result+(Math.pow(remainder,n));
}
if(result==num){
System.out.println("Number is armstrong number");
}
else{
System.out.println("Number is armstrong number");
}
}
public static void main(String[] args){
Check();
}
}


// ANALYSIS:
// Since while loop is decremented by n/10
// therefore, time complexity = O(logn) [log base 10 n]