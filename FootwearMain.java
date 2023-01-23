import java.net.SocketTimeoutException;
import java.util.*;

import javax.tools.ForwardingFileObject;

public class FootwearMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear[] arr = new Footwear[4];
        for (int i = 0; i < arr.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            arr[i] = new Footwear(id, name, type, price);
        }

        String type = sc.nextLine();
        sc.close();

        // int sameTypeAns = sameType(arr, type);
        // System.out.println("Same types shoes are "+ sameTypeAns);
        Footwear secondMax = secHighFwByName(arr, type);

        System.out.println("Secind max shoies is " + secondMax.price);
    }
    /*
     * static int sameType(Footwear[] arr, String type){
     * int ans =0;
     * for(int i=0;i<arr.length;i++){
     * if(arr[i].get_type().equals(type)){
     * ans++;
     * }
     * }
     * return ans;
     * }
     * 
     */

    static Footwear secHighFwByName(Footwear[] arr, String brandType) {
        int[] priceArray = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].type.equalsIgnoreCase(brandType)) {
                priceArray = Arrays.copyOf(priceArray, priceArray.length + 1);
                priceArray[priceArray.length - 1] = arr[i].price;
            }
        }
        Arrays.sort(priceArray);

        if (priceArray.length > 0) {
            int x = priceArray[priceArray.length - 2];
            System.out.println("Mein hu dosra mehga joota" + x);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].price == x) {
                    return arr[i];
                }
            }
        }
        return null;
    }

    /*
     * static int secondHighPrice(Footwear[] arr ){
     * int max = arr[0].get_price();
     * int secMax = arr[0].get_price();
     * for (int i = 1; i < arr.length; i++) {
     * if(arr[i].get_price()>max){
     * secMax = max;
     * max=arr[i].get_price();
     * }
     * }
     * return secMax;
     * }
     */

}

class Footwear {
     int price;
     String name;
     int id;
     String type;

    Footwear(int Id, String Name, String Type, int Price) {
        this.id = Id;
        this.name = Name;
        this.type = Type;
        this.price = Price;
    }

    int get_id() {
        return id;
    }

    String get_name() {
        return name;
    }

    String get_type() {
        return type;
    }

    int get_price() {
        return price;
    }
}