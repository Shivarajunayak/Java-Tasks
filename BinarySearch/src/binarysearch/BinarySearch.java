package binarysearch;

import java.util.Scanner;

/**
 *
 * @author ZAHID ALI
 */
public class BinarySearch 
{

    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);
        
        int []values = {1,3,4,5,6,7,8,9,10,12,13,15,17,18,19};
        System.out.println("The values are : ");
        for(int i=0; i<values.length; i++)
        {
            System.out.print(values[i]+" ");
        }
        
        int key;
        System.out.println("\nEnter the value that you wanted to search???");
        key = sc.nextInt();
        int mid;
        boolean found = false;
        int first = 0;
        int last = values.length-1;
        BinarySearchFunction(values,first,last,key);
          
    }
   
    
    int BinarySearchFunction(int values[],int first,int last,int key)
    {
        boolean found = false;
        int i=0;
        int mid;
        while(i<values.length && found ==false)
        {            
            mid = (first+last)/2;
            
            if(key == values[mid])
            {
                System.out.println("Value found at index : "+mid);
                found = true;
            }
            else if(key> values[mid])
            {
                first = mid+1;
            }
            else if(key<values[mid])
            {
                last = mid-1;
            }
            else
            {
                System.out.println("Value not found!!!");
                break;
            }
            
        }
        
        

    }
}
