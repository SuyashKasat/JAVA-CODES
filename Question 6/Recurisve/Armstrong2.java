import java.util.*;
import java.lang.Math;
public class Armstrong2{
static int Arm(int n, int x){
int ans=0;
if(x==0){
return 0;
}
else{
int r=x%10;
int sum=(int)Math.pow(r,n);
ans=sum + Arm(n,x/10);
}
return ans;
}
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("enter a number to check if its armstrong or not:");
int x=s.nextInt();
int num=x;
int n=String.valueOf(x).length();
int result=Arm(n,x);
System.out.println(result);
if(result==num){
System.out.println("Number is armstrong number");
}
else{
System.out.println("Number is not armstrong number");
}
}
}

/*Worst case time complexity: O(log(n))
Average case time complexity: O(log(n))
Best case time complexity: O(log(n))*/
