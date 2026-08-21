// Find maximum and minimum in an array...
public class maximumminimum {
    public static void main(String[] args) {
        int[] arr={12,45,7,89,23,56,0,98,435};

        int max=arr[0];
        int min=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];

            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Maximum:" +max);
        System.out.println("Minimum:" +min);
    }
}
