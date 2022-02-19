import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
//add Vehicle data for car rental system
    public void addVehicle(vehicle v1, ArrayList<vehicle> v) {
        System.out.println("------------Insert data for Vechicle-----------");
        for (int i = 0; i <=5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Identification Code ");
            int id = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the Brand");
            String brand = sc1.next();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the Model");
            String model = sc2.next();
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter the number of seats ");
            int seats = sc1.nextInt();
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter the the License Plate ");
            String plate = sc4.next();
            // System.out.println(id + " , " + brand + " " + " " + model + " " + seats + " " + plate);
            //create arraylist of vehicle and inser data
            v1 = new vehicle(id, brand, model, seats, plate);
            v.add(v1);
        }

    }
//add vehicle which are on rented
    public void addRental(rental r1, ArrayList<rental> r, vehicle newv1, ArrayList<vehicle> v) {
        System.out.println("____________________Retal process_____________________________");
        for (int j = 0; j <1; j++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Choice for vehicle to add for rental");
            int id1 = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Customer Name"); //
            String cname = sc1.next();
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter Start Date");
            String start = sc1.next();
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter Last Date");
            String end = sc4.next();
            int choice = id1 - 1;
            r1 = new rental(cname, start, end, v.get(choice).getId(), v.get(choice).getBrandName(), v.get(choice).getModel(), v.get(choice).getSeatNo(), v.get(choice).getPlate());
            r.add(r1);
            //Arraylist of type rental is created and rental details added
            newv1 = v.get(choice);
            v.remove(newv1);
            //vehicle is rental now so remove from available vehicle list
            System.out.println("Data Added successfully for Rental");
        }

    }
    //Cancel vehicle from rental
    public void cancel(ArrayList<rental> r, ArrayList<vehicle> v, vehicle v1) {
        System.out.println("Cancellation of vehicle from rental");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Chooice No to remove");
        int canchoice = sc.nextInt() - 1;

        v1 = new vehicle(r.get(canchoice).getId(), r.get(canchoice).getBrand(), r.get(canchoice).getModel(), r.get(canchoice).getSeats(), r.get(canchoice).getPlate());
        v.add(v1);
        System.out.println("Vehicle Cancelation is done");
       //vehicle is remove from rental
        //vehicle is return and now its available for new rental
        rental cr = r.get(canchoice);
        r.remove(cr);

        System.out.println("Now This car is available for Rental");

    }

    public void avaibility(ArrayList<rental> r) throws ParseException {

        System.out.println("Enter Start date to check avaibility");
        Scanner sc=new Scanner(System.in);
        String aDate1 = sc.next();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter Last date to check avaibility");
        String aDate2 = sc1.next();
        Date date11 = new SimpleDateFormat("dd/MM/yyyy").parse(aDate1);

        Date date22 = new SimpleDateFormat("dd/MM/yyyy").parse(aDate2);

        for (int i = 0; i < r.size(); i++)
        {
            String sDate1 = r.get(i).getStart_date();

            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            String sDate2 = r.get(i).getLast_date();
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
            //checks the avaiblity of vehicle by date compare function
            if ((date11.compareTo(date1) <0) && (date22.compareTo(date1) <0) ||
                    (date11.compareTo(date1) >0) && (date22.compareTo(date2) >0) )

            {
                //vehicle is available
                System.out.println("Vehicle is available from Rental");
                System.out.println(r.get(i).getId() + " " + r.get(i).getBrand()+" "+r.get(i).getBrand()+" "+r.get(i).getSeats()+" "+r.get(i).getPlate());

            }
        }
    }



    public static void main(String[] args) throws FileNotFoundException, ParseException
    {//main method
        Main m = new Main();
        //an identification code, the brand, the model, the number of seats, the license plate.
        vehicle v1 = null, newv1 = null;
        rental r1 = null;
        //arraylist of vehicle type is created
        ArrayList<vehicle> v = new ArrayList<>();
        ArrayList<rental> r = new ArrayList<>();
        String filename = "E:\\New Learning\\JavaLab5\\src\\main\\resources\\rental.csv";
        String filename2 = "E:\\New Learning\\JavaLab5\\src\\main\\resources\\vehicle.csv";
        //Printwriter is used for writing csv file
        PrintWriter pw = new PrintWriter(filename);
        PrintWriter vehicledata = new PrintWriter(filename2);

        System.out.println("--------------------!!!!Welcome to Rental System!!!!!----------------------------------");
        int temp=1;
        while(temp!=0)
        {
            System.out.println("\n1. Enter Vehicle Record\n"+
                    "2. Enter Record for Rental\n"+
                    "3. Check Cars Avaibility for Rent\n"+
                    "4. Show Cars on Rent\n"+
                    "5. Check Avaibility of cars for rent in given period\n" +
                    "6. Add new Vechicle\n"+
                    "7. Cancel the vehicle from rental\n"+
                    "8. Import and Export data\n"+
                    "9. Exit");

            Scanner sc1=new Scanner(System.in);
            System.out.println("Choose option from above");
            int ch=sc1.nextInt();

            switch(ch)
            {
                case 1: m.addVehicle(v1, v);
                break;

                case 2:

                    int count3=0;
                    System.out.println("-------------Cars Available for  Rental----------------------------");
                    System.out.println("Sr.No"+" "+" Car Id "+" "+" Brand Name "+" "+" Model "+" "+" Seats "+" "+" Licence Plate ");
                    for (int i = 0; i < v.size(); i++)
                    {
                        count3++;
                        System.out.println(count3+". "+ v.get(i).getId() + " " + v.get(i).getBrandName() + " " + v.get(i).getModel() + " " + v.get(i).getSeatNo() + " " + v.get(i).getPlate());
                    }

                    m.addRental(r1,r,newv1,v);
                break;

                case 3:
                    int count=0;
                    System.out.println("-------------Cars Available for  Rental----------------------------");
                    System.out.println("Sr.No"+" "+" Car Id "+" "+" Brand Name "+" "+" Model "+" "+" Seats "+" "+" Licence Plate ");
                    for (int i = 0; i < v.size(); i++)
                    {
count++;
                        System.out.println(count+". "+ v.get(i).getId() + " " + v.get(i).getBrandName() + " " + v.get(i).getModel() + " " + v.get(i).getSeatNo() + " " + v.get(i).getPlate());
                    }
                    break;

                case 4:
int count1=0;
                    System.out.println("--------Cars on Rent------");
                    System.out.println("Sr.No"+"  Customer Name"+ " "+"  Start Date "+" End Date "+"Sr.No"+" "+" Car Id "+" "+" Brand Name "+" "+" Model "+" "+" Seats "+" "+" Licence Plate ");
                    for (int k = 0; k < r.size(); k++) {
                        count1++;
                        System.out.println(count1+" . "+r.get(k).customer_name+" " +r.get(k).getStart_date()+" "+r.get(k).getLast_date()+" " +r.get(k).getId()+" "+r.get(k).getBrand()+" "+r.get(k).getModel()+" "+r.get(k).getSeats()+" "+r.get(k).getPlate());
                    }
                    break;

                case 5:

                    m.avaibility(r);
                  //  System.out.println("Cars Available on rent");

                    int count5=0;
                    System.out.println("-------------Cars Available for  Rental----------------------------");
                    System.out.println("Sr.No"+" "+" Car Id "+" "+" Brand Name "+" "+" Model "+" "+" Seats "+" "+" Licence Plate ");
                    for (int i = 0; i < v.size(); i++)
                    {
                        count5++;
                        System.out.println(count5+". "+ v.get(i).getId() + " " + v.get(i).getBrandName() + " " + v.get(i).getModel() + " " + v.get(i).getSeatNo() + " " + v.get(i).getPlate());
                    }


                    break;

                case 6:

                    m.addVehicle(v1, v);
                    System.out.println("System Veicle available from Non-Rental");

                    break;

                case 7:
                    int count4=0;
                    System.out.println("-------------Cars Available for  Rental----------------------------");
                    System.out.println("Sr.No"+" "+" Car Id "+" "+" Brand Name "+" "+" Model "+" "+" Seats "+" "+" Licence Plate ");
                    for (int i = 0; i < v.size(); i++)
                    {
                        count4++;
                        System.out.println(count4+". "+ v.get(i).getId() + " " + v.get(i).getBrandName() + " " + v.get(i).getModel() + " " + v.get(i).getSeatNo() + " " + v.get(i).getPlate());
                    }


                    m.cancel(r,v,v1);
                    break;

                case 8:
                    //Export vehicle data
                    for(int i=0;i<v.size();i++)
                    {
                        vehicledata.printf("%d,%s,%s,%d,%s\n",v.get(i).getId(),v.get(i).getBrandName(),v.get(i).getModel(),v.get(i).getSeatNo(),v.get(i).getPlate());
                    }
                    vehicledata.close();
                    for(int j=0;j<r.size();j++)
                    {
                        pw.printf("%s,%s,%s,%d,%s,%s,%d,%s\n", r.get(j).getCustomer_name(), r.get(j).getStart_date(), r.get(j).getLast_date(),r.get(j).getId(), r.get(j).getBrand(), r.get(j).getModel(), r.get(j).getSeats(), r.get(j).getPlate());

                    }
                   pw.close();
                case 9:
                    temp=0;
                    break;

                default:
                    System.out.println("Please Enter correct choice");
                    break;
            }

        }






















//cancellatiom

//        System.out.println("avaibility");
//        String sDate1="31/12/1998";
//        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//        String eDate1="31/12/1998";
//        Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(eDate1);
//
//        for(int i=0;i<r.size();i++)
//        {
//            System.out.println(r.get(i).getStart_date()+" "+r.get(i).getLast_date());
//
//        }


    }
}