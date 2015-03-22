
public class FibRecursive {

    public static long fibonacci(int n)  { 
    	
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
        
}
    
    public static void main(String[] args) {
    	
        long baslangic = System.currentTimeMillis(); 
        
        for(int i=10;i<100;i+=10){
        	
            System.out.print(i + ". fib degeri = " + fibonacci(i));  
            long bitis = System.currentTimeMillis();  
            long gecenSure = bitis - baslangic;       
            
            System.out.println("  ==> " + (double)gecenSure/1000 + "sn");  
            
        }
    }
    
}
