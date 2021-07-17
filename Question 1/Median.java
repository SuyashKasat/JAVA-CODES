import java.util.*;
import java.lang.Math;
public class Median {
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a no's no.");
int N=s.nextInt();
int []Med=new int[N];
System.out.println("Enter numbers in ascending order");

for(int i=0;i<N;i++){
System.out.print("Enter the number"+ (i+1)+" :");
Med[i]=s.nextInt();
}
System.out.println("Median of the no.s is:");
if(N%2!=0){
double i=Math.ceil(N/2);
int y= (int) i;
 int z=Med[y];
System.out.println(z);
}
else{
int i=N/2;
double z= (Med[i]+ Med[i-1])/2;
System.out.println(z);
}
}
}


//Time complexity for finding median is O(1) if array elements are given else it will be O(n) as for entering elements for loop will run n times.