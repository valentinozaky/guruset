public class Guru {
    int nip;

    public int getNip() {
        return this.nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    String nama;
    String mapel;
    String status;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    


    //Constructor
    public Guru() {
        nip = 0;
        nama = "kosong";
        mapel = "kosong";
        status = "kosong";

        //constuctor Paramater
    }

    public Guru(int i, String n, String m, String s) {
        nip = i;
        nama = n;
        mapel = m;
        status = s;
     }

     //Getter
     //Setter
     //Method
     public void print () {
        System.out.println("NIP: " + nip);
        System.out.println("NAMA: " + nama);
        System.out.println("MAPEL: " + mapel);
        System.out.println("STATUS: " + status);
     }
    }

