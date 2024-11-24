/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Huawei
 */
public class Sistem_Kelulusan {//modifier

    int[] Budi = {80, 70, 90};
    int[] Rudi = {70, 90, 90};
    int[] Dodi = {30, 50, 60};

    public double rata(int[] nilai) {//parameter
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;//fungsi
    }

    public static boolean ceklulus(double rata) {//static
        return rata >= 70;
    }

    public void hasil() {//method
        double ratabudi = rata(Budi);
        double ratarudi = rata(Rudi);
        double ratadodi = rata(Dodi);

        System.out.println("Nama            : Budi");
        System.out.println("Rata-Rata Nilai : " + ratabudi);
        System.out.println("Keterangan      : " + (ceklulus(ratabudi) ? "LULUS" : "TIDAK LULUS"));
        System.out.println("\n");

        System.out.println("Nama            : Rudi");
        System.out.println("Rata-Rata Nilai : " + ratarudi);
        System.out.println("Keterangan      : " + (ceklulus(ratarudi) ? "LULUS" : "TIDAK LULUS"));
        System.out.println("\n");
        
        System.out.println("Nama            : Dodi");
        System.out.println("Rata-Rata Nilai : " + ratadodi);
        System.out.println("Keterangan      : " + (ceklulus(ratadodi) ? "LULUS" : "TIDAK LULUS"));
    }

    public static void main(String[] args) {
        Sistem_Kelulusan sk = new Sistem_Kelulusan();
        sk.hasil();
    }
}
