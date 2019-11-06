
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan tegangan.
 *  
 */

package pbo1.pkg10118033.latihan44;

public class PBO110118033Latihan44 {
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai baterai2 = new Baterai(3,12);
        System.out.println("Kuat Arus : "+baterai2.getKuatArus()+" Ampere");
        System.out.println("Hambatan  : "+baterai2.getHambatan()+" Ohm");
        System.out.println("Hasil Tegangan : "+baterai2.hitungTegangan()+" Volt");
        System.out.println("(Developed By : Ikrar AB)");
    }
}