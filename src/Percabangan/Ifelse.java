package Percabangan;

public class Ifelse {
    public static void main(String[] args){
        double totalbelanja = 53000;
        double uangdompet = 25000;

        if (uangdompet<totalbelanja){
            System.out.println("Uang Anda Kurang");
        }else if (uangdompet>totalbelanja){
            double angsul = uangdompet - totalbelanja;
            System.out.println("Belanja Berhasil , Selamat menikmati :" + angsul);
        }else{
            System.out.println("Uang Pass");

        }
    }
}
