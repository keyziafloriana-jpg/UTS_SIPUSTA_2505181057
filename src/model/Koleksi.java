package model;

public abstract class Koleksi {
    protected String kodeKoleksi;
    protected String judul;
    protected int tahunTerbit;

    public Koleksi(String kodeKoleksi, String judul, int tahunTerbit) {
        this.kodeKoleksi = kodeKoleksi;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String getKodeKoleksi() {
        return kodeKoleksi;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method abstrak untuk aturan kelayakan pinjam (Soal 1)
    public abstract boolean isLayakPinjam();

    // Method deskripsi yang diperluas dengan super (Soal 1)
    public String deskripsi() {
        return "Kode: " + kodeKoleksi + " | Judul: \"" + judul + "\" (" + tahunTerbit + ")";
    }
}