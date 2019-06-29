import java.io.*;
import java.util.*;
import java.util.Scanner.*;
public class Flowers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>flowerPriceList=new ArrayList<Integer>();
        int flowers=sc.nextInt();
        int friends=sc.nextInt();

        for(int i=0;i<flowers;i++){
            flowerPriceList.add(sc.nextInt());
        }
        Collections.sort(flowerPriceList,Collections.reverseOrder());
        int flowerBrought=0;
        int friendNum=0;
        int total=0;

        for(int price:flowerPriceList){
            total+=(flowerBrought+1)*price;
            friendNum++;
        if(friendNum==friends){
            friendNum=0;
            flowerBrought++;
        }
    }
    System.out.println(total);
    }
}


