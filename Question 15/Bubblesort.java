import java.util.Scanner;
class Bubblesort{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("enter a no for array size:");
int n=s.nextInt();
int[]sort=new int[n];
System.out.println("Enters no.s in array:");
for(int i=0 ; i<n;i++){
sort[i]=s.nextInt();
}

for(int y=1; y<n;y++){
int temp;
int flag=0;
for(int i=0;i<n-y;i++){
 
 if(sort[i]>sort[i+1]){
 temp=sort[i];
 sort[i]=sort[i+1];
 sort[i+1]=temp;
  flag=1;    }
}
if(flag==0){
break;
}

}
System.out.print("Sorted array:");
for(int i=0;i<n;i++){
System.out.print(" "+sort[i]);
}
}
}
/*Time Complexity Analysis-
 

Bubble sort uses two loops- inner loop and outer loop.
The inner loop deterministically performs O(n) comparisons.
 

Worst Case-
 

In worst case, the outer loop runs O(n) times.
Hence, the worst case time complexity of bubble sort is O(n x n) = O(n2).
 

Best Case-
 

In best case, the array is already sorted but still to check, bubble sort performs O(n) comparisons.
Hence, the best case time complexity of bubble sort is O(n).
 

Average Case-
 

In average case, bubble sort may require (n/2) passes and O(n) comparisons for each pass.
Hence, the average case time complexity of bubble sort is O(n/2 x n) = Θ(n2).*/

// Time complexity for bubble sort in worst case is O(n^2) and in best case is O(n)