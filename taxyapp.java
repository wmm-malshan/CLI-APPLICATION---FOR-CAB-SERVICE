import java.util.Scanner;


class title{
    public void name(){
        System.out.println("------------3.3 tours------------");
    }
}
class packge extends  title{
    @Override
    public void name() {
        System.out.println("------------package list of 3.3 tours----------");
    }

    private String pack1;
    private String pack2;
    private String pack3;
   

    packge(){
        pack1=null;
        pack2=null;
        pack3=null;
    }

packge(String pack1,String pack2,String pack3){
    this.pack1=pack1;
    this.pack2=pack2;
    this.pack3=pack3;
}

//getters



public void displaypackage(){
        name();
    System.out.println("1. "+pack1);
    System.out.println("2. "+pack2);
    System.out.println("3. "+pack3);
}

public void displaypackagedeatils(){
        name();
    System.out.println("------------------------------------------------");
    System.out.println("| Package Name    Wifi    AC      Tv    Charge  |");
    System.out.println("------------------------------------------------");
     System.out.println("| "+pack1+"        Yes     No      NO    Rs.500  |");
     System.out.println("| "+pack2+"            Yes     Yes     NO    Rs.1500 |");
     System.out.println("| "+pack3+"        Yes     Yes     Yes   Rs.2500 |");
     System.out.println("-----------------------------------------------");
}


}



class Disply extends title{
    @Override
    public void name() {
        System.out.println("\n\n----- Welcom to CAB service 3.3tours-----\n");
    }
    public void printvehiclelist(){
        System.out.println("---- Vehicle List of 3.3 tours----");
        System.out.println("\t1. Car");

        System.out.println("\t2. SUV (C-HR)");
        System.out.println("\t3. Van (Dolphin)");
        System.out.println("\t4. lorry (20ft<)");
        System.out.println("\t5. Bus");
    }
    public void printpackgelist(){
        System.out.println("---package list of 3.3 tours---");
        System.out.println("\t1. standard");
        System.out.println("\t2. Gold");
        System.out.println("\t3. Platinam");
        System.out.println("\t4. No need any Package");
    }
    public void printvehicledeatils() {
        System.out.println("vehicle details list of 3.3 tours");//
        System.out.println("------------------------------------");
        System.out.println("| Vehicle Name     Price(per km)   |");
        System.out.println("------------------------------------");
        System.out.println("|   Car              Rs.160        |");

        System.out.println("|   Suv (C-HR)       Rs.200        |");
        System.out.println("|   Van              Rs.200        |");
        System.out.println("|   lorry (20ft<)    Rs.250        |");
        System.out.println("|   Bus              Rs.250        |");
        System.out.println("------------------------------------");
    }
    public void mainmenu(){
        name();
        System.out.println("\t1. View Vehicle list");
        System.out.println("\t2. View Packge list");
        System.out.println("\t3. Book a Vehicle");
        System.out.println("\t4. View previous Bookings");
        
    }

     public void displaytotlal(int vehicalid, int Vehicleprice,int deistance,int discount,int packgeid,int packageprise,int distanceprice){

        String v_name=null,packageName=null;
        

        //get vehicle name by id

        if(vehicalid==1) //car
            v_name="Car";  

         else if(vehicalid==2)   //SUV- (C-HR)
            v_name="SUV- (C-HR)"; 
        else if (vehicalid==3)  //van (dolphin)
            v_name="van (dolphin)";  
        else if(vehicalid==4)   // van (KDH)
            v_name="lorry(20<)";
        else if(vehicalid==5)   // bus
            v_name="Bus";

        //get package name by id
        if(packgeid==1){
            packageName="standard";
          
        }
        else if(packgeid==2){
            packageName="Gold";
          
        }
        else if(packgeid==3){
            packageName="Platinam";
        }
        else if(packgeid==4){
            packageName="No Package";
        }

        name();
        System.out.println("\n----------Booking Summary-----------");
        System.out.println("|  Vehicle Name\t\t: "+v_name +"\t   |");
        System.out.println("|  Vehicle Charge (1km) : Rs."+Vehicleprice+"   |");
        System.out.println("|  Package Name\t\t: "+packageName+" |");
        System.out.println("|  Package Price\t: Rs."+packageprise+"   |");
        System.out.println("|  Distance \t\t: "+deistance+"km    |");
        System.out.println("|  Discount\t\t: "+discount+"% \t   |");
        System.out.println("|  Total charge\t\t: Rs."+distanceprice+" |");
        System.out.println("------------------------------------");       
        
    }
}

class calculate{

    private int distanceprice;
    private int vehicalcharg;
    private int discount=0;
     private int packageprise;
    

    //grters

    public int getdistanceprice(){
        return distanceprice;
    }
     public int getvehicalcharg(){
        return vehicalcharg;
    }
    public int getdiscount(){
        return discount;
    }
    public int getpackageprise(){
    return packageprise;
}

    public void calculatedistanceprice(int distance, int vehicalid){

        //finde vehical charge by selectc vehicle
        if(vehicalid==1) //car
            vehicalcharg=160;  

         else if(vehicalid==2)   //SUV- (C-HR)
            vehicalcharg=200;
        else if (vehicalid==3)  //van (dolphin)
            vehicalcharg=200;  
        else if(vehicalid==4)   // lorry (20ft<)
            vehicalcharg=250;
        else if(vehicalid==5)   // bus
            vehicalcharg=250;


        //calculate deistance price
        if(distance<50){
            distanceprice=(vehicalcharg*distance);
            distanceprice+=packageprise;}

        if(distance>=50 && distance<=100){
            discount=5;       
            distanceprice=vehicalcharg*distance;
            int offer=distanceprice*discount/100;    //discount for 50-100 km 
            distanceprice-=offer;
            distanceprice+=packageprise;
        }
        else if(distance>100){
            discount=7;
            distanceprice=vehicalcharg*distance;
            int offer=distanceprice*discount/100;   //discount for 100+ km 
            distanceprice-=offer;
            distanceprice+=packageprise;
        }
    }
    public void cpid(int pid){
     if(pid==1) //car
            packageprise=500;  
        else if(pid==2)   //wagon-R
            packageprise=1500;  
         else if(pid==3)   //SUV- (C-HR)
            packageprise=2500; 
            else if(pid==4)
            packageprise=0;

    //System.out.println(packageprise);

}
}

class taxyapp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Disply  obj1=new Disply();
        calculate obj3=new calculate();
        packge obj2=new packge("standard", "Gold", "Platinam");

        int Select_vehicle=0;
        int Select_package=0;
        int deistance=0;
        int d_p=0; //store total deistance price
        int v_p=0; ///store user Select vehicle price
        int p_p=0; // store user Selected packge price
        int d_c=0;  //store Discount presentage
        boolean book_comform =false;
        
        char age;

        do {          
        

        //System.out.println("\n\n----- Welcom to CAB service 3.3tours-----\n");
        obj1.mainmenu();
        System.out.print("\nSelect your chose : ");
        int chose= sc.nextInt();
        if(chose==1){
            obj1.printvehicledeatils();
        }
        else if(chose==2){
            obj2.displaypackagedeatils();
        }
        else if(chose==3){
            //System.out.println("------------ Vehicle List ------------");
            obj1.printvehiclelist();
            System.out.print("Select you want vehicle : ");  
            Select_vehicle=sc.nextInt();
           //
            // System.out.println("------------ Package List ------------");
            obj1.printpackgelist();
            System.out.print("\nSelect your Package : "); 
            Select_package=sc.nextInt();
            System.out.print("Enter your Distance (Km) : ");
            deistance=sc.nextInt();
            obj3.cpid(Select_package);
            obj3.calculatedistanceprice(deistance, Select_vehicle);
            d_p=obj3.getdistanceprice();
            p_p=obj3.getpackageprise();
            v_p=obj3.getvehicalcharg();
            d_c=obj3.getdiscount();
            obj1.displaytotlal(Select_vehicle, v_p, deistance,d_c, Select_package, p_p, d_p);
            book_comform=true;
            System.out.println("do you confirm your order..? \n 1-yes \n 2-no");
            System.out.println("enter your choice :");
            int x= sc.nextInt();
            if(x==1){
             System.out.println("...safe travel...!!!");
            }else
             System.out.println("thank you..! come again...");



            
        }
        else if(chose==4){

            if(book_comform){
                obj1.displaytotlal(Select_vehicle, v_p, deistance,d_c, Select_package, p_p, d_p);
            }
            else{
                System.out.println("you Dont have book any vehicle");
            }

        }

        System.out.print("Do you Want use agin: ");
        age=sc.next().charAt(0);

        } while (age=='y'||age=='Y');
        System.out.println("---thanks for using 3.3 cab service---");




    }

}

