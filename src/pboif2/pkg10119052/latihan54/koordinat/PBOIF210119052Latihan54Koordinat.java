package pboif2.pkg10119052.latihan54.koordinat;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * tipe data Integer
 * 
 */
public class PBOIF210119052Latihan54Koordinat {

    public static void main(String[] args) {
        WarnaKoordinat hasil = new WarnaKoordinat("nama", 10, 4);
        hasil.setNamawarna("jingga");
        System.out.println("Warna Koordinat : "+hasil.getNamawarna());
        hasil.setX(10);
        hasil.setY(4);
        System.out.println("Koordinat Sumbu x : "+hasil.getX()+","+"y :"+hasil.getY());
    }
    
}
