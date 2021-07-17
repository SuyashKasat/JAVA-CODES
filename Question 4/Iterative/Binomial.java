import java.util.*;
public class Binomial{
 static int Fact(int n){
 int x=1;
int i=1;
do{
x=x*i;
i++;
}while(i<=n);
return x;
}

public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter first no :");
int x= s.nextInt();
System.out.print("Enter Second no :");
int y=s.nextInt();
System.out.println("Binomial coefficient for C"+"("+x+","+y+")");
if(y>x){
int z=0;
System.out.println(z);
}
else if(y==x || y==0){
int z=1;
System.out.println(z);
}
else{
int z=Fact(x);
int w=Fact(x-y);
int b=Fact(y);
int a=z/(w*b);
System.out.println(a);
}
}
}

// time complexity for iterative factorial is O(n) and for if else is O(1) so total time complexity for the program will be O(n+1) i.e O(n).