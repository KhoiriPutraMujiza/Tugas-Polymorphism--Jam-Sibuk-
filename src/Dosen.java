public class Dosen extends Elemen {
    private Integer jumlahHariKerja;

    public Dosen(String nama, Integer jumlahHariKerja){
        super(nama);
        this.jumlahHariKerja=jumlahHariKerja;
    }

    public Integer getJamSibuk(){
        return jumlahHariKerja*8;
    }
}
