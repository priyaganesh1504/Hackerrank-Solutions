import java.util.*;
import java.util.Scanner.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        queries:
        for(int i = 0; i < q; i++){
            String s = in.next();
            char[] find = "hackerrank".toCharArray(); 
            int findIndex = 0;
            
            for(char c : s.toCharArray())
            {
                if(find[findIndex] == c)
                    findIndex++;
                
                if(findIndex == find.length){ //We ran out of characters to find
                    System.out.println("YES");
                    continue queries;
                }
                    
            }
            System.out.println("NO"); //We didn't find all characters
        }
    }
}