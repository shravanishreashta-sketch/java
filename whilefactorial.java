 public class whilefactorial {
    public static void main(String[] args) {
        int num = 10; 
        long factorial = 1;

        
        while (num > 1) {
            factorial *= num; 
            num--;           
        }

        System.out.println("factorial: " + factorial); 
        
    }
}


    

    

