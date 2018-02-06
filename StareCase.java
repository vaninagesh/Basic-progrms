/* 
Print the staircase pattern
i.e...,For example 
if input is 3
than output look like:
  #
 ##
### 
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        
        for(int i=0;i<n;i++) {
            for(int j=1;j<=n;j++) {
                if(j<n-i)
                    System.out.printf(" ");
                else
                    System.out.printf("#");
            }
        System.out.printf("\n");    
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
