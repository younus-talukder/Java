import java.util.Scanner;

public class ARaf {
    public static void main(String[] args) {


        int[] array = {1, 2, 3};
        int size = array.length;
        System.out.println("Array size: "+size);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int a = input.nextInt();
        System.out.println("Enter float value : ");
        float b = input.nextFloat();
        System.out.println("Enter double value : ");
        double c = input.nextDouble();
        System.out.println("Enter any character : ");
        char d = input.next().charAt(0);
        System.out.printf("The character is: %c \n",d);
        System.out.println("Enter the array size : ");
         int N = input.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr= new int[N];
        int i;
        for(i = 0;i<N ;i++){
            arr [i] = input.nextInt();
        }
        System.out.print("Enter array elements " );
        for(i = 0;i<N ;i++){
            System.out.print(arr[i] );
        }



    }
}
