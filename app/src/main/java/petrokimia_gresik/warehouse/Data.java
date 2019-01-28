package petrokimia_gresik.warehouse;

public class Data {
    private int idgud;
    private String deskripsi;
    private double maxantrian;
    private double antrian;
    private double tibadigudang;

    public Data(int idgud, String deskripsi, double maxantrian, double antrian, double tibadigudang) {
        this.idgud = idgud;
        this.deskripsi = deskripsi;
        this.maxantrian = maxantrian;
        this.antrian = antrian;
        this.tibadigudang = tibadigudang;
    }

    public int getIdgud() {
        return idgud;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public double getMaxantrian() {
        return maxantrian;
    }

    public double getAntrian() {
        return antrian;
    }

    public double getTibadigudang() {
        return tibadigudang;
    }
}
