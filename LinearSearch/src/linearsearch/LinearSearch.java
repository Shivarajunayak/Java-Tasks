package linearsearch;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ZAHID ALI
 */
public class LinearSearch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
     
        
        int key;
        boolean found = false;
        int i = 0;
        
        int [] values = {4,5,6,7,8,9,19,13,17,21,24};
        System.out.println("The values are :");
        for(i = 0; i<values.length; i++)
        {
            System.out.print(values[i]+" ");
        }
        
        System.out.println("\nEnter the value that you wanted to search? ");
        key  =  sc.nextInt();
        
        int j=0;
        while(j<values.length && found == false)
        {
            if(key == values[j])
            {
                System.out.println("Value found at : "+j);
                found = true;
            }          
           if(j==values.length)
            {
                System.out.println("Value not found ");            
            }
           j++; 
        }
        
        
        
    }
}
