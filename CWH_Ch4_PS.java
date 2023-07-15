import java.util.Scanner;

public class CWH_Ch4_PS {
    public static void main(String[] args) {

        //Question 1
        //int a = 10;
        //if (a==11){
        //    System.out.println("I am 11");
        //}
        //else {
        //    System.out.println("I am not 11");
        //}


        //Question 2
        //  float maths, chemistry, physics,total,p;
        // Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter Marks of Maths: ");
        maths = sc.nextFloat();
        System.out.println("Enter Marks of Chemistry: ");
        chemistry = sc.nextFloat();
        System.out.println("Enter Marks of Physics: ");
        physics = sc.nextFloat();

        total = maths + chemistry + physics;
        p = (total*100)/300;

        System.out.println(p);
        if(p>=40) {
            System.out.println("You have Passed!");
        }
        else if (p>=33 && p<40) {
            System.out.println("You have just passed!");
        }
        else {
            System.out.println("Better Luck next time!");
        }*/


        //Question 3
/*        System.out.println("Enter your income in lakhs: ");
        float tax = 0;
        float income=sc.nextFloat();
        if (income<=2.5) {
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5.0f){
            tax = tax + 0.05f*(income - 2.5f);
        }
        else if (income>5f && income<10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f*(income - 2.5f);
        }
        else if (income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Total tax paid by employee is: "+ tax);
        }*/


        //Question 4

       /* int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day Number: ");
        day = sc.nextInt();

        switch(day) {
            case 1:
            {
                System.out.println("Monday!");
                break;
            }
            case 2:
            {
                System.out.println("Tuesday!");
                break;
            }
            case 3:
            {
                System.out.println("Wednesday!");
                break;
            }
            case 4:
            {
                System.out.println("Thursday!");
                break;
            }
            case 5:
            {
                System.out.println("Friday!");
                break;
            }
            case 6:
            {
                System.out.println("Saturday!");
                break;
            }
            case 7:
            {
                System.out.println("Sunday!");
                break;
            }
            default: {
                System.out.println("Wrong Input");
            }
        }*/


        //Question 5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        if(year%4==0) {
            System.out.println("Entered year is a leap year");
        }
        else {
            System.out.println("Entered year is not a leap year");
        }*/


    //Question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the website: ");
        String website = sc.next();
        if(website.endsWith(".org")) {
            System.out.println("It is an Organisational Website");
        }
        if(website.endsWith(".in")) {
            System.out.println("It is an Indian Website");
        }
        if(website.endsWith(".com")) {
            System.out.println("It is a commercial website");
        }
    }
}
