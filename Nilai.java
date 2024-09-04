package Nilai;

public class Nilai {
    String nim;
    String nama;
    float nilaiAbsen;
    float nilaiTugas;
    float nilaiUTS;
    float nilaiUAS;
    float nilaiAkhir;

   
    public void Nilai(String nim, String nama, float nilaiAbsen, float nilaiTugas, float nilaiUTS, float nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    
     // Menghitung nilai akhir berdasarkan bobot
        this.nilaiAkhir = (nilaiAbsen * 0.1f) + (nilaiTugas * 0.2f) + (nilaiUTS * 0.3f) + (nilaiUAS * 0.4f);
    }

   

 
   
    // Method untuk mencetak nilai
    public void CetakNilai() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}