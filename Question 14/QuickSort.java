import java.util.*;
import java.util.Arrays;
public class Quicksort{

static int Position(int A[],int lb, int ub){
int pivot =A[lb];
int start=lb;
int end =ub;
while(start<end){
while(A[start]>=pivot){
start++;}
while(A[end]<pivot){
end--;}
if(start<end){
int temp=A[start];
A[start]=A[end];
A[end]=temp;
}

int temp=A[lb];
A[lb]=A[end];
A[end]=temp;
return end;
}
}
static void Sort( int A[],int lb,int ub){
if(lb<ub){
int x=Position( A,lb,ub);
Sort( A,lb,x-1);
Sort(A,x+1,ub);
}
}

public static void main(String [] args){
Scanner s=new Scanner (System.in);
System.out.println("enter a no for array size:");
int n=s.nextInt();
int[]A=new int[n];
System.out.println("Enters no.s in array:");
for(int i=0 ; i<n;i++){
A[i]=s.nextInt();
}
Sort(A,0,n-1);
System.out.println("Sorted array is:");
for(int j=0;j<n;j++)
{System.out.print(A[j]+",");
}
}
}

/*Analysis of QuickSort 
Time taken by QuickSort, in general, can be written as following. 

 T(n) = T(k) + T(n-k-1) + \theta(n)
The first two terms are for two recursive calls, the last term is for the partition process. k is the number of elements which are smaller than pivot. 
The time taken by QuickSort depends upon the input array and partition strategy. Following are three cases.

Worst Case: The worst case occurs when the partition process always picks greatest or smallest element as pivot. If we consider above partition strategy where last element is always picked as pivot, the worst case would occur when the array is already sorted in increasing or decreasing order. Following is recurrence for worst case. 

 T(n) = T(0) + T(n-1) + \theta(n)
which is equivalent to  
T(n) = T(n-1) + \theta(n)

Best Case: The best case occurs when the partition process always picks the middle element as pivot. Following is recurrence for best case. 

 T(n) = 2T(n/2) + \theta(n)

Average Case: 
To do average case analysis, we need to consider all possible permutation of array and calculate time taken by every permutation which doesn’t look easy. 
We can get an idea of average case by considering the case when partition puts O(n/9) elements in one set and O(9n/10) elements in other set. Following is recurrence for this case. 

 T(n) = T(n/9) + T(9n/10) + \theta(n)*/

// Time complexity for QuickSort worst case is O(n^2) and bestcase is O(n logn)
