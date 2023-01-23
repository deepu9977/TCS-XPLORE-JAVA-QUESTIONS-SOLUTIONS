import java.util.Scanner;

 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    TicketFeat[] arr = new TicketFeat[4];
    for (int i = 0; i < arr.length; i++) {
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        int distance = sc.nextInt();
        sc.nextLine();
        arr[i] = new TicketFeat(name, age, distance);
    }
    }

    static int getTax(int age , int fare){
        if(age>=60 && age<=12){
            return 0;
        }
     return (int) 0.12*fare;
    }

    static int calculateTickerFare(TicketFeat[] arr , int fare){
       int  tax =0;
      for (int i = 0; i < arr.length; i++) {
        int ticker_price = arr[i].distance*fare;
        tax = getTax(ticker_price,ticker_price);
      }
        return tax;
    }
 }
 
 
 class TicketFeat {
   String name;
   int age;
   int distance;
   
   TicketFeat(String newName , int newAge , int newDistance){
    this.name = newName;
    this.age = newAge;
    this.distance = newDistance;
   }

   int get_age(){
    return age;
   }

   int get_distance(){
     return distance;
}
String get_Name(){
    return name;
}

}
