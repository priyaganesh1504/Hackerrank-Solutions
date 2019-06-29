import java.util.*;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int s = in.nextInt(); //starting point of Sam's house location
        int t = in.nextInt(); //ending point of Sam's house location
        int a = in.nextInt();// location of the Apple tree
        int b = in.nextInt();// location of the orange tree
        int m = in.nextInt();//distances at which each apple falls from the tree
        int n = in.nextInt();//distances at which each orange falls from the tree
        int apples = 0;//the number of apples that fall on Sam's house
        int oranges = 0;//the number of apples that fall on Sam's house
        for(int i=0;i<m;i++){
            int landing=in.nextInt()+a;
            if(landing>=s&&landing<=t){
                apples++;
            }
        }
         for(int i=0;i<n;i++){
            int landing=in.nextInt()+b;
            if(landing>=s&&landing<=t){
                oranges++;
            }
         }
         System.out.println(apples);
         System.out.println(oranges);
    }
}

    
