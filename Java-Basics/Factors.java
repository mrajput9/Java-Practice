// You are using Java
import java.util.*;
public class Factors{
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        for(int i = 1; i<input+1; i++){
            if(input%i == 0){
                System.out.println(" " +i);
            }
        }
    sc.close();
    }
    
    
}

