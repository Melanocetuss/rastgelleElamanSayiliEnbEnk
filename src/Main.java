import java.util.*;
public class Main{
    public static int[] diziOlustur(){
        Random random = new Random();

        int eleman = random.nextInt(50)+50;
        int [] dizi = new int[eleman];

        for (int i = 0; i < eleman; i++) {
            dizi[i] = random.nextInt(200)+500;
            System.out.println("---| "+(i+1) + ") " + dizi[i] + " |---");
        }
        return dizi;
    }

    public static void enBuyukEnkucukSayiBul(int[] dizi){
        int max = -1000000000;
        int min = 1000000000;

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>max)
                max = dizi[i];
            else if(dizi[i]<min)
                min = dizi[i];
        }
        System.out.println("***| "+"Dizideki en buyuk sayi: "+max+" |***");
        System.out.println("***| "+"Dizideki en kucuk sayi: "+min+" |***");
    }

    public static void GirilenSayiVarMi(int[] dizi){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int sayi = sc.nextInt();

        int sayac = 1;
        boolean kontrol = false;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==sayi){
                kontrol = true;
                sayac++;
            }
        }
        if(kontrol==true){
            System.out.println(sayi+" sayisi dizide "+ sayac +" defa tekrar ediyor");
        }
        else {
            System.out.println("sayi dizide icermiyor");
        }
    }

    public static void main(String[] args) {
        int[] dizi = diziOlustur();
        enBuyukEnkucukSayiBul(dizi);
        GirilenSayiVarMi(dizi);
    }
}
