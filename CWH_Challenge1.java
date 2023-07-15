import java.util.Scanner;

public class CWH_Challenge1 {
    public static void main(String[] args) {
        System.out.println("RESULT");
        Scanner m = new Scanner(System.in);
        System.out.print("Enter the Marks of MATHS: ");
        int maths = m.nextInt();
        System.out.print("Enter the Marks of CHEMISTRY: ");
        int chemistry = m.nextInt();
        System.out.print("Enter the Marks of PHYSICS: ");
        int physics = m.nextInt();
        System.out.print("Enter the Marks of ENGLISH: ");
        int english = m.nextInt();
        System.out.println("Enter the Marks of COMPUTER: ");
        int computer = m.nextInt();
        int sum = maths+chemistry+physics+english+computer;
        System.out.println("Total Marks: "+sum);
        float p = (sum*100/500);
        System.out.println("Percentage: "+p);
    }
}
