import java.util.*;
class binary
{
public static void main(String args[])
{
int i,n,search,low,high,mid;
int a[] = new int[20];
Scanner S = new Scanner(System.in);
System.out.println("Enter total number of elements:");
n= S.nextInt();
System.out.println("Enter elements in sorted order:");
for(i=0;i<n;i++)
a[i] = S.nextInt();
System.out.println("Enter the search value:");
search = S.nextInt();
low = 0;
high = n-1;
mid = (low + high)/2;
while(low<=high)
{
if(a[mid]<search)
{
low = mid+1;
}
else if(a[mid]==search)
{
System.out.println("The search element found at a["+mid+"] that is :"+search);
break;
}
else
{
high = mid-1;
}
mid = (low + high)/2;
}
if(low>high)
{
System.out.println("Number is not found");
}
}
}