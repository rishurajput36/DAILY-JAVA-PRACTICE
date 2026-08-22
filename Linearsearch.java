// Linear search...It works on both sorted & unsorted arrays.
import java.util.Scanner;
public class Linearsearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={10,20,30,40,50,60,70};
        System.out.print("Enter the no to search:");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index:"+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found.");
        }
        sc.close();
    }
}