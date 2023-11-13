public class FoorLoop{
        public static void main(String[] args) {

    // perintah FOR... adalah untuk mengulang dari batas bawah suatu variabel
    // sampai mencapai batas atas yang sudah ditentukan
    // 1,2,3,4,5 = angka ---> <6 ---> angka <6
    // cetak angka dari 1 sampai 5 ---> 1 <= angka < 6 0<= x < 6
    // angka = 1 (batas bawah)
    // angka < 6
    // for(int angka = 1; angka < 6; angka++) // perintah untuk mengulang dari 1 s/d 5

    for (int angka = 1; angka < 10; angka++) { // angka++ ---> angka = angka + 1
        System.out.println(angka);
        // Menampilkan semua angka genap dan ganjil dari 10 s/d
        String status;
        for (int Angka = 10; angka < 90; angka++) {
            if (angka % 2 == 0) { // % adalah  pembagian sisa contohnya 10 mod 2 = 5 sisa 0
                status = "angka genap";
            } else {
                status = "angka ganjil";
            }
            System.out.println(angka + " adalah " + status);{
            }
        }

