package Arrays;

import com.sun.security.jgss.GSSUtil;

public class LinearSearch {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String menu[],String key1){
        for(int i=0;i<menu.length;i++){
            if(menu[i] == key1) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int numbers[] = {2, 5, 8, 10, 15, 18, 20, 22};
        String menu[] = {"Dosa", "Samosa", "Idli", "Kachori"};
        String item = "Idli";
        int key = 10;

         int index =linearSearch(numbers, key);
         if(index == -1){
             System.out.println("Key not found");
         }else{
             System.out.println("Key is at index: "+index);
         }


        int ind = linearSearch(menu, item);
        if (ind == -1) {
            System.out.println("Key not found ");
        } else {
            System.out.println("Key is at index :" + ind);
        }
    }
}
