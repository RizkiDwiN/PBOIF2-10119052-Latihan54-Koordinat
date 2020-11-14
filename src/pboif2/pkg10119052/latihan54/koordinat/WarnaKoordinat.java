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
public class WarnaKoordinat extends Koordinat{
    public  String namawarna;

    public WarnaKoordinat(String namawarna, int x, int y) {
        super(x, y);
        this.namawarna = namawarna;
    }

    public String getNamawarna() {
        return namawarna;
    }

    public void setNamawarna(String namawarna) {
        this.namawarna = namawarna;
    }
}
