import java.io.*;
import java.util.*;
import java.util.Scanner.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cookiesnum=sc.nextInt();
        int sweetness=sc.nextInt();
        PriorityQueue<Integer>q=new PriorityQueue<Integer>();
        for(int i=0;i<cookiesnum;i++){
            int arrange=sc.nextInt();
            q.add(arrange);
        }
        int count=0;
        while(q.size()>1&&q.peek()<=sweetness){
            int fnum=q.poll();
            int snum=q.poll();
            q.add(fnum+2*snum);
            count++;
        }
        if(q.peek()<sweetness){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }
    }
}

   