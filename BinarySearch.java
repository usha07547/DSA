import java.util.*;
public class BinarySerch 
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int l=0;
        int h=4;
        int key=3;
        int mid;
        while(l<=h)
        {
            mid=(l+h)/2;
        if(a[mid]==key)
        {
            System.out.println(mid);
            break;

        }
        else if(a[mid]<key)
        {
            l=mid+1;

        }
        else
        {
            h=mid-1;
        }
    }

    }
    
}
