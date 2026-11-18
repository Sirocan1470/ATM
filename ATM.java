
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        float bakiye = 10000;
        boolean elektrik = true;
        int islem = 0;
        String secim;
        
        while (elektrik) {
            
            System.out.println("Bir islem seciniz:");
            System.out.println("1. Bakiye goruntuleme");
            System.out.println("2. Para yatirma");
            System.out.println("3. Para cekme");
            System.out.println("4. Cikis");
            secim = sc.next();
            
            switch (secim) {
                case "1":
                    System.out.println("Mevcut bakiyeniz: "+bakiye+" TL");
                    islem++;
                    break;
                case "2":    
                    System.out.println("Yatirmak istediginiz miktari seciniz:");
                    float yatir = sc.nextFloat();
                    if (yatir < 0) {
                        System.out.println("Lutfen tekrar deneyiniz!");
                    break;
                    } else {if (yatir > 10000) {
                            System.out.println("ATM'den 10.000 TL uzerinde para yuklenememektedir!");
                        break;
                        } else {
                        islem++;
                        bakiye += yatir;
                        System.out.println("Yeni bakiyeniz: "+bakiye+" TL");
                        }
                    }
                    break;
                case "3":    
                    System.out.println("Cekmek istediginiz miktari seciniz:");
                    float cek = sc.nextInt();
                    if (cek < 0) {
                        System.out.println("Lutfen tekrar deneyiniz!");
                    break;
                    } else {if (cek > bakiye) {
                            System.out.println("Girilen miktar bakiyeden buyuk!");
                        } else {
                        islem++;
                        bakiye -= cek;
                        System.out.println("Yeni bakiyeniz: "+bakiye+" TL");
                        }
                    }
                    break;
                case "4":    
                    System.out.println("Program sonlaniyor... Islem ozeti:");
                    System.out.println("Bakiye: "+bakiye+" TL");
                    System.out.println("Yapılan islem sayisi: "+islem);
                    break;
                    
                    
                    
                    
                default:
                    System.out.println("Hatali tuslama yaptiniz. Lutfen tekrar deneyin.");
            }
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
