package PatternPrinting;

public class AllPatterns {

    public static void hollow_Rectangle(int totalRows,int totalCols){
        for(int i=1;i<=totalRows;i++){
            for(int j=1;j<=totalCols;j++){
                if(i ==1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("*");
                }else{
                        System.out.print(" ");
                    }

            } System.out.println();
        }
    }


    public static void inverted_pyramid(int n){
       //outer
        for(int i=1;i<=n;i++){
         //spaces
         for(int j=1;j<=n-i;j++){
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
             System.out.print("*");
         }
            System.out.println();
        }
    }

    public static void Floyd_Triangle(int num){
        int counter=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if( (i+j) %2 ==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            } System.out.println();
        }
    }

    public static void butterfly(int n){
        // 1st half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[] ){
        //hollow_Rectangle(7,5);
        //inverted_pyramid(10);
         // Floyd_Triangle(5);
         //zero_one_triangle(5);
        //butterfly(15);
           solid_rhombus(5);
    }

}