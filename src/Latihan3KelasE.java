public class Latihan3KelasE {
        public static void main(String[] args) {
    /**
     * Tipe Data Primitive
     * contoh : int, double, float, byte, char, bolean
     * conditional statement
     * contoh : jika sakit, maka minum obat
     * if(sakit=benar) then minumobat = benar
     */
    boolean Sakit = true; // deklarasi variable 'sakit', variabel tersebut diberi nilai 'true'
    boolean minum_obat = true; // deklarasi varabel 'minum_obat'
    if (Sakit = true) {
        minum_obat = true;
    }
    System.out.println("Minum Obat = " + minum_obat);
    /**
     * Conditional IF...ELSE
     * contoh : jika nilai lebih dari 60, maka lulus, jika tidak maka tidak lukus
     * if(nilai>60 then 'lulus' else 'tidak lulus'
     */
    int nilai = 50;
    String status = "";
    if (nilai > 60) {
        status = "Lulus";
    } else {
        status = "Tidak Lulus";
    }
    System.out.println("Status Kelulusan = " + status);
    {
}