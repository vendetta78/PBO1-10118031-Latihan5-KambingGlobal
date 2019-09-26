package pbo1.pkg10118031.latihan5.kambingglobal;

/**
 *
 * @author Vendetta
 * NAMA              : Rizki Aria Putra
 * KELAS             : PBO1
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk varibel instance
 */
public class PBO110118031Latihan5KambingGlobal {

    int jumlahKambing = 88;
//Method unutk menampilkan jumlah kambing

    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: "+ jumlahKambing);
    }

    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah di tambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {

        PBO110118031Latihan5KambingGlobal kambingSusu = new PBO110118031Latihan5KambingGlobal();

        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();

        //Menambah satu kambing
        kambingSusu.tambahKambing();

        //Menjumlahkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();

    }

}
