import java.util.Scanner;
class Factorial {
public static void main(String [] args) {
int x=1;
int y;
int i=1;
Scanner s= new Scanner(System.in);
System.out.print("Enter a no for factorial:");
y=s.nextInt();
System.out.print("Factorial is:"+" ");
do{
x=x*i;
i++;
}while(i<=y);
System.out.println(x);
}}

// as in this code do while loop will run n times so time complexity will be O(n).