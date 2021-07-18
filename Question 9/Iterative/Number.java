import java.util.*;
public class Number{
static void Answer(int a ,int b,int c){
if(a>b){
 if(c>a){
 System.out.println("Largest number is:"+ c+" and smallest number is:"+ b);
 }
else{
if (b>c){
 System.out.println("Largest number is:"+ a +" and smallest number is:"+ c);
}
else{
 System.out.println("Largest number is:"+ a +" and smallest number is:"+ b);
}
}
}
else if(b>c){
if(c>a){
 System.out.println("Largest number is:"+ b +" and smallest number is:"+ a);
}
else{
 System.out.println("Largest number is:"+ b+" and smallest number is:"+ c);
}
}
else{
 System.out.println("Largest number is:"+ c +" and smallest number is:"+ a);
}
}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter three numbers:");
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
Answer(x,y,z);
}
}

/*Time complexity for this code will be O(1) as there is  nested if else condition for which time complexity is O(m+n) where m=n=1,
so time complexity will be constant.*/

