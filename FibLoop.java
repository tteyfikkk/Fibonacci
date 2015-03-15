

public class FibLoop {

    
    public static void main(String[] args) {
        long sayi1 = 1;
        long sayi2 = 1;
        long sayi3;
        int sayac=3;
        
        long baslangic = System.currentTimeMillis();  //ba�lama zaman�
        while(sayac<100){
        	
            sayi3 = sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sayi3;
            
            System.out.print(sayac + ". fib degeri = " + sayi3);  
            
            long bitis = System.currentTimeMillis();  // Fib. say�s�n�n bulundu�u andaki zaman. Milisaniye cinsinden
            long gecenSure = bitis - baslangic;       // Bulunana kadar ge�en s�re
            
            System.out.println("  ==> " + (double)gecenSure/1000 + "sn");  // Milisaniye/1000 = saniye
            sayac+=1;
        }
    }
    
}