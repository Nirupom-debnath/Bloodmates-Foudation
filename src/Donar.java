import java.util.Scanner;
import java.util.UUID;
public class Donar extends BloodGroup implements utility{
    String donar_id;
    String donar_name;
    int donar_age;
    String donar_bloodgroup;
    


    @Override
    public void get_details() {
        System.out.println("ID: "+donar_id);
        System.out.println("Name: "+donar_name);
        System.out.println("Age: "+donar_age);
        System.out.println("Department: "+donar_bloodgroup);
       

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        donar_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER Donar DETAILS *** =======================");
        System.out.println();
        System.out.print("DONAR NAME: ");
        donar_name = sc.nextLine();
        System.out.print(("DONAR AGE: "));
        donar_age = sc.nextInt();
        sc.nextLine();
        System.out.print("DONAR BLOODGROUP: ");
         donar_bloodgroup = sc.nextLine();
         


    }
}