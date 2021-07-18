import java.util.*;
public class MaxMin{
static int[] findMinMax(int A[],int start,int end){
int max;
int min;
if(start==end){
max=min=A[start];}

else if(start+1==end){
if(A[start]<A[end]){
max=A[end];
min=A[start];
}
else{
max=A[start];
min=A[end];
}
}

else{
int mid=start+(end-start)/2;
int left[]=findMinMax(A,start,mid);
int right[]=findMinMax(A,mid+1,end);
if(left[0]>right[0]){
max=left[0];}
else{max=right[0];}

if(left[1]<right[1]){
min=left[1];
}
else{min=right[1];}

}

int ans[]={max,min};
return ans;
}

public static void main(String []args){
Scanner s=new Scanner(System.in);

int[] arr=new int[3];
System.out.println("Enter the elements");
for(int i=0;i<3;i++){
arr[i]=s.nextInt();
}

int A[]=new int[2];
A=findMinMax(arr,0,3-1);

System.out.println("max:" + A[0]);

System.out.println("min:" + A[1]);
}
}

//The time complexity of the above solution is O(n), where n is the size of the input.
/* Total number of comparisons: let the number of comparisons be T(n). T(n) can be written as follows: 
Algorithmic Paradigm: Divide and Conquer 

             
  T(n) = T(floor(n/2)) + T(ceil(n/2)) + 2  
  T(2) = 1
  T(1) = 0
If n is a power of 2, then we can write T(n) as: T(n) = 2T(n/2) + 2
After solving the above recursion, we get 

  T(n)  = 3n/2 -2
Thus, the approach does 3n/2 -2 comparisons if n is a power of 2. And it does more than 3n/2 -2 comparisons if n is not a power of 2.*/