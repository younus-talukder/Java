package animal;
public class Duplicate {  
public static void main(String[] args) {  
         
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
        System.out.println("Duplicate elements in given array: ");   
        for(int i = 0; i < 9; i++) {  
            for(int j = i + 1; j < 9; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  