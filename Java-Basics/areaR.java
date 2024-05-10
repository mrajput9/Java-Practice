import java.util.*;
public class areaR {
    public static void main(String[] args){
        Float a;
        Float b;
        System.out.println("Enter lenth of Rectangle:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        System.out.println("Enter breadth of Rectangel:");
        b = sc.nextFloat();
        Float Area = a*b;
        System.out.println("Area equals to:" +Area+"m\u00B2");
    }   
}
