

public class FibLoop {

    
    public static void main(String[] args) {
        long sayi1 = 1;
        long sayi2 = 1;
        long sayi3;
        int sayac=3;
        
        long baslangic = System.currentTimeMillis();  //baþlama zamaný
        while(sayac<100){
        	
            sayi3 = sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sayi3;
            
            System.out.print(sayac + ". fib degeri = " + sayi3);  
            
            long bitis = System.currentTimeMillis();  // Fib. sayýsýnýn bulunduðu andaki zaman. Milisaniye cinsinden
            long gecenSure = bitis - baslangic;       // Bulunana kadar geçen süre
            
            System.out.println("  ==> " + (double)gecenSure/1000 + "sn");  // Milisaniye/1000 = saniye
            sayac+=1;
        }
    }
    
}