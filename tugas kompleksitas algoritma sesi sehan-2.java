/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.kompleksitas.algoritma.sesi_2_alyarf_20230040327;

/**
 *
 * @author User
 */
public class TugasKompleksitasAlgoritmaSesi_2_alyarf_20230040327 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bilangan = 20;
        int hasil = 0;

        for (int i = 0;i <2; i++) {
            hasil += bilangan;
        }
        
        System.out.println("Hasil dari " + bilangan + "pangkat dua adalah:" + hasil);
    }
    
}

// Analisa kompleksitas algoritma dari pemrograman ini
// -Waktu (Time Comlexity): Komplesitas waktu adalah 0(1), karena operasi perkalian dilakukan sekali
// -Ruang (Space Complexity): Komplesitas ruang adalah 0(1), karena hanya memerlukan ruang untuk variabel number dari hasil

//Simulasi perhitungan data : pada setiap iterasi program menambahkan nilai number kedalam variabel bilangan