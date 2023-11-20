import java.sql.SQLOutput;
import java.util.Scanner;
public class BloodGroup implements utility{
    String BloodGroup_name;
   
    int total_Donarneeded;
     int total_patient_in_waiting = 0;
    

    @Override
    public void get_details() {
        System.out.println("BloodGroup Name: "+BloodGroup_name);
        
        System.out.println("Total donar: "+total_Donarneeded);
        

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER  BloodGroup DETAILS *** =======================");
        System.out.println();
        System.out.print("BloodGroup NAME: ");
        BloodGroup_name = sc.nextLine();
       
        System.out.print("TOTAL NO OF DONARS NEEDED: ");
        total_Donarneeded = sc.nextInt();
        
        

    }
}