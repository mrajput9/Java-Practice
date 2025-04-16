public class Recursion{

    
    public static void decreaseNumber(int n){
        
        if ( n==1){
            System.out.println(n);
            return; 
        }
        
        decreaseNumber(n-1);
        System.out.println(n);
        
    }
    public static void increaseNumber(int n){
        
        if ( n==1){
            System.out.println(n);
            return; 
        }
        
        increaseNumber(n-1);
        System.out.println(n);
        
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return n*factorial(n-1);

    }

    public static int sumOfNatural(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return n+sumOfNatural(n-1);

    }
    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;

        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int lOccurence(int arr[], int key, int i){
        int n = arr.length;

        if(i == arr.length){
            return -1;
        }

        if (arr[n-i-1] == key){
            return n-i-1;
        }
        return lOccurence(arr, key, i+1);

    }
    public static int pown(int x, int n){
        if(n == 1){
            return x;
        }
        int ns = x * pown(x,n-1);
        return ns;

    }
    public static int isPowerOfThree(int n){
        if(n == 1){
            return 1;
        }
        if(n!=1){
            return isPowerOfThree(n/3);
        }
        return -1;
    
    
    }
     public static void main(String[] args) {
        int n = 2;

        // int arr[] = {1,2,3,4,3,5};
        // decreaseNumber(n);
        // increaseNumber(n);
        // factorial(n);
        // System.out.println(factorial(n));
        // sumOfNatural(n);
        // System.out.println(sumOfNatural(n));
        // System.out.println(fibonacci(n));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(lOccurence(arr, 3, 0));
        // System.out.println(pown(n,x));
        System.out.println(isPowerOfThree(n));
    }
}

   



