import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}


public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO BLOOD MATES FOUNDATION *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD BLOODGROUP \t\t\t 2].ADD DONAR \t\t\t 3].ADD PATIENT");
        System.out.println();
         System.out.println("4].GET BLOODGROUP \t\t\t 5].GET DONAR \t\t\t 6].GET PATIENT");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodGroup BloodGroup[] = new BloodGroup[5];
        Donar  Donar[] = new Donar[5];
        patient patient[] = new patient[5];
        int patient_counter = 0;
        int BloodGroup_counter = 0;
        int Donar_counter = 0;
        int choice = 100;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        BloodGroup[BloodGroup_counter] = new BloodGroup();
                        BloodGroup[BloodGroup_counter].set_details();
                        BloodGroup_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW BloodGroup ");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        Donar[Donar_counter] = new Donar();
                        Donar[Donar_counter].set_details();
                        Donar_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW Donar");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        patient[patient_counter] = new patient();
                        patient[patient_counter].set_details();
                        patient_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW Patient");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < BloodGroup_counter; i++) {
                            BloodGroup[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < Donar_counter; i++) {
                            Donar[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < patient_counter; i++) {
                            patient[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }


    }
}