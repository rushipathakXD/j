import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        /*if(age>56){
            System.out.println("You are Experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }*/

        switch (age) {
            case 18:

                System.out.println("You are going to become an adult.");
                break;

            case 23:

                System.out.println("You are going to join a job");
                break;

            case 60:
                    System.out.println("You are going to retire.");
                    break;

            default:
                System.out.println("Enjoy your life");
        }
    }
}
