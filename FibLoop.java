

public class FibLoop {

    
    public static void main(String[] args) {
        long sayi1 = 1;
        long sayi2 = 1;
        long sayi3;
        int sayac=3;
        
        long baslangic = System.currentTimeMillis();  
        while(sayac<100){
        	
            sayi3 = sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sayi3;
            
            System.out.print(sayac + ". fib degeri = " + sayi3);  
            
            long bitis = System.currentTimeMillis();  
            long gecenSure = bitis - baslangic;       
            
            System.out.println("  ==> " + (double)gecenSure/1000 + "sn");  
            sayac+=1;
        }
    }
    
}
