import java.util.Scanner;

public class GuruTeaster {
    public static void main(String[] args) {
        //String-->int--->double
        // Scanner input = new Scanner(System.in);
        // System.out.println("Nama : ");
        // String nama = input.nextLine();
        // System.out.println("Mapel :");
        // String mapel = input.nextLine(); 
        // System.out.println("Status :");
        // String status = input.nextLine();
        // System.out.println("NIP :");
        // int nip = input.nextInt();
        // input.close();

        // Guru guru = new Guru(nip, nama, mapel, status);

        // guru.print(); 

        Guru buPasha = new Guru(3451, "Pasha", "RPL", "TETAP");


        buPasha.setNama("buPasha");
        buPasha.setMapel("RPL");
        buPasha.setStatus("TETAP");
        buPasha.setNip(3451);

        buPasha.print();


        // Guru BuPasha = new Guru(3451, "Pasha", "RPL", "TETAP");
        // Guru PakThoriq = new Guru(2843, "Thoriq", "PJOK", "TETAP");
        // Guru BuAul = new Guru(3942, "Aul", "RPL", "TETAP");
        // Guru PakAndre = new Guru(4190, "Andre", "BAHASAINGGRIS", "TETAP");
        // Guru PakFalah = new Guru(8932, "Falah", "BAHASAINDONESIA", "TETAP");

        // BuPasha.print();
        // PakThoriq.print();
        // BuAul.print();
        // PakAndre.print();
        // PakFalah.print();
    }
 }
