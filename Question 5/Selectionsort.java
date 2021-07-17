import java.util.Scanner;
class Selectionsort{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("enter a no for array size:");
int n=s.nextInt();
int[]sort=new int[n];
System.out.println("Enters no.s in array:");
for(int i=0 ; i<n;i++){
sort[i]=s.nextInt();
}
for (int i=0;i<n-1;i++){
 int min= i;
for( int j=i+1;j<n;j++){
if(sort[j]<sort[min]){
   min=j;
}
}
if(min!= i){
int temp;
 temp=sort[i];
 sort[i]=sort[min];
 sort[min]=temp;
  }
}
System.out.print("Sorted array:");
for(int i=0;i<n;i++){
System.out.print(" "+sort[i]);
}
} 
}


//time complexity will be O(n2) as there are two nested loops.

//Time complexity for Selection Sort in worst case  is O(n^2) and in best case is O(n^2)