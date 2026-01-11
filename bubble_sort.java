import java.util.*;
class bubble_sort
{
public static void main(String args[])
{
int i,n,j,temp;
int a[] = new int[20];
Scanner S = new Scanner(System.in);
System.out.println("Enter total number of elements:");
n= S.nextInt();
System.out.println("Enter elements:");
for(i=0;i<n;i++)
a[i] = S.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j] =a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("the sorted order is:");
for(i=0;i<n;i++)
System.out.print("\t"+a[i]);
}
}
