import java.util.Scanner;

public class areaS {
    public static void main(String[] args){
        Float a;
        System.out.println("Enter Side of Square:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        Float Area = a*a;
        System.out.println("Area equals to: " +Area+"m\u00B2");
        sc.close();
    }
    
}
