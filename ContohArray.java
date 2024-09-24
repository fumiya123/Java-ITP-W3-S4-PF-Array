public class ContohArray {
    public static void main(String[] args) {
        // deklarasi dan inisialisasi array
        int[] numbers = {10, 20, 30, 40, 50};
        
        
        System.out.println("Isi array angka:");
        // for digunakan untuk mengeluarkan isi array berdasarkan index
        for (int i = 0; i < numbers.length; i++) {
            // print nilai Array nya
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
