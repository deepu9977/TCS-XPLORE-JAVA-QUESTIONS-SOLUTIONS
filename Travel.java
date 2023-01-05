// simple java program to remove
import java.util.*;

public class Travel
{
    
    static int highPackagePrice(TravelAgencies[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i].get_price()){
                max = arr[i].get_price();
            }
        }
        return max;
    }
    
  static TravelAgencies getIdAndPackage(TravelAgencies[] arr , String str , int id){
for (int i = 0; i < arr.length; i++) {
	if(arr[i].get_flightFacility()){
		if(id==arr[i].get_regNo() && str.equalsIgnoreCase(arr[i].get_packageType())){
			return arr[i];
		}
	}
}

	return null;
  }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TravelAgencies[] arr = new TravelAgencies[4];
		for(int i=0;i<arr.length;i++){
		    int a = sc.nextInt();
		    sc.nextLine();
		    String b = sc.nextLine();
		    String c = sc.nextLine();
		    int d = sc.nextInt();
		    sc.nextLine();
		    boolean e = sc.nextBoolean();
		    arr[i] = new TravelAgencies(a,b,c,d,e);
		}
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
	sc.close();
		System.out.println(highPackagePrice(arr));
		TravelAgencies myAgency =  getIdAndPackage(arr,str,n);
	if(myAgency==null){
		System.out.println("A string value is printed here ");
	}else{
		System.out.println(myAgency.get_agencyName()+": "+myAgency.get_price());
	}
		
	}
}
 class TravelAgencies{
   private  int regNo;
   private  String agencyName;
   private String packageType;
   private  int price;
   private  boolean flightFacility;
     
     TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility){
         this.regNo = regNo;
         this.packageType= packageType;
         this.agencyName = agencyName;
         this.price = price;
         this.flightFacility=flightFacility;
     }
     
    int get_regNo(){
         return regNo;
     }
     void set_regNo(int newNo){
         this.regNo = newNo;
     }
     String get_agencyName(){
         return agencyName;
     }
     void set_agencyName(String newName){
         this.agencyName = newName;
     }
     String get_packageType(){
         return packageType;
     }
     void set_packageType(String newType){
         this.packageType = newType;
     }
      int get_price(){
         return price;
     }
     void set_price(int newPrice){
         this.price = newPrice;
     }
      boolean get_flightFacility(){
         return flightFacility;
     }
     void set_flightFacility(boolean new_flightFacility){
         this.flightFacility = new_flightFacility;
     }
 }