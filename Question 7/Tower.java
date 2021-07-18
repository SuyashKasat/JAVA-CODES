import java.util.*;
import java.io.*;
import java.math.*;
public class Tower{
static void towerofHanoi(int n , char from_rod, char to_rod,  char aux_rod){
if (n>0){
towerofHanoi(n-1, from_rod, aux_rod, to_rod);
System.out.println("Move disk " +n+ " from rod " + from_rod + "  to rod " + to_rod );
towerofHanoi(n-1, aux_rod, to_rod, from_rod);
}
}
public static void main(String [] args){
Scanner s=new Scanner (System.in);
int x=s.nextInt();
towerofHanoi(x,'A','B','C');
}
}

/*Time Complexity : 
Let the time required for n disks is T(n) . 
There are 2 recursive call for n-1 disks and one constant time operation to move a disk 
from ‘from’ peg to ‘to’ peg . Let it be k1.
Therefore, 
T(n) = 2 T(n-1) + k1 
T(0) = k2 , a constant. 
T(1) = 2 k2 + k1
T(2) = 4 k2 + 2k1 + k1
T(2) = 8 k2 + 4k1 + 2k1 + k1
Coefficient of k1 =2n 
Coefficient of k2 =2n
-1 
Time complexity is O(2^n) or O(a^n) where a is a constant greater than 1. 
So it has exponential time complexity. For single increase in problem size the time 
required is double the previous one. This is computationally very expensive. Most of the 
recursive programs takes exponential time that is why it is very hard to write them

Time complexity for recursive tower of hanoi is O(2^n)*/