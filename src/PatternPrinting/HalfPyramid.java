package PatternPrinting;

import com.sun.security.jgss.GSSUtil;

public class HalfPyramid {
    public static void main(String[] args) {
        int n= 10;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
