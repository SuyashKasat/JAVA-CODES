import java.util.Scanner;
class Insertionsort{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("enter a no for array size:");
int n=s.nextInt();
int[]sort=new int[n];
System.out.println("Enters no.s in array:");
for(int i=0 ; i<n;i++){
sort[i]=s.nextInt();
}
for(int i=1; i<n; i++){
int temp=sort[i];
 int j=i-1;
while(j>=0 && sort[j]>temp){
sort[j+1]=sort[j];
j--;
}
sort[j+1]=temp;
}
System.out.print("Sorted array:");
for(int i=0;i<n;i++){
System.out.print(" "+sort[i]);
}
}
}

/*If we take a closer look at the insertion sort code, we can notice that every iteration of
while loop reduces one inversion. The while loop executes only if i > j and arr[i] < arr[j].
Therefore total number of while loop iterations (For all values of i) is same as number of
inversions. Therefore overall time complexity of the insertion sort is O(n + f(n)) where
f(n) is inversion count. If the inversion count is O(n), then the time complexity of
insertion sort is O(n). In worst case, there can be n*(n-1)/2 inversions. The worst case
occurs when the array is sorted in reverse order. So the worst case time complexity of insertion sort is O(n2).*/

// Time Complexity for Insertion Sort in worst case is O(n2) and in best case is O(n) 