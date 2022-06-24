// Syntaxt of Array in Java
// array_type[] array_name = {item1, item2, item3, .... }

// Question:
// Given a random set of numbers, Print them in sorted order.
public class sort_asc{

    public void printArray(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void sortAsc(int arr[]) {
        int temp = 0;
        for (int i = 0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp   = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        sort_asc obj = new sort_asc();
        obj.printArray(arr);
    }

    public static void main(String[] args) {
        int[] num = {69, 2, 34, 9, 50, 0};

        sort_asc obj = new sort_asc();
        
        // Displaying elements of original array
        obj.printArray(num);    
        System.out.println("-----------------------");
        obj.sortAsc(num);
    }

}
