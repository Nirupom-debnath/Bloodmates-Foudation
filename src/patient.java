import java.util.Scanner;
import java.util.UUID;
public class patient extends BloodGroup implements utility{
    String patient_id;
    String patient_name;
    int patient_age;
    String patient_problem;


    @Override
    public void get_details() {
        System.out.println("ID: "+ patient_id);
        System.out.println("Name: "+ patient_name);
        System.out.println("Age: "+ patient_age);
        System.out.println("Problem : "+ patient_problem);
       

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
         patient_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER  patient DETAILS *** =======================");
        System.out.println();
        System.out.print(" Patient NAME: ");
         patient_name = sc.nextLine();
        System.out.print((" Patient AGE: "));
         patient_age = sc.nextInt();
        sc.nextLine();
        System.out.print(" patient problem: ");
         patient_problem = sc.nextLine();
       ;


    }
}