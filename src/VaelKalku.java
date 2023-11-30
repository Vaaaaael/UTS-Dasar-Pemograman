import java.util.Scanner;
class VaelKalku{
    private double berat;
    private double tinggi;
    public VaelKalku(){
    }
    public void ukurBB(double berat){
        this.berat = berat;
    }
    public void ukurTB(double tinggi){
        this.tinggi = tinggi;
    }
    public double kalkuHasil(){
        return berat / (tinggi * tinggi);
    }
    public void hasilPengukuran(double hasil){
        if (hasil <18.5) {
        System.out.println("Ukuran Berat Badan Yang Kurang");
        }
        else if (hasil >=18.5 && hasil <25){
        System.out.println("Ukuran Berat Badan Yang Normal");
        }
        else if (hasil >=25 && hasil <30){
        System.out.println("Ukuran Berat Badan Yang Berlebih");
        }
        else {
        System.out.println("Obesitas");
        }
    }
    public static void main(String[] args){
        VaelKalku kalkulasikan = new VaelKalku();
        System.out.println("-Indeks Massa Badan by Vael-");
        Scanner input = new Scanner(System.in);
        System.out.print("Tinggi Badan Anda Dalam (Meter) : ");
        double tinggi = input.nextDouble();
        kalkulasikan.ukurTB(tinggi);
        System.out.print("Berat Badan Anda Dalam (Kilogram) : ");
        double berat = input.nextDouble();
        kalkulasikan.ukurBB(berat);
        double hasil = kalkulasikan.kalkuHasil();
        System.out.println("Hasil Perhitungan : " + hasil);
        System.out.println("Anda Dianalisis Sebagai Orang Yang Memiliki :");
        kalkulasikan.hasilPengukuran(hasil);
        input.close();
    }
}