public class Mahasiswa extends Elemen{
    private Integer Sks;

    public Mahasiswa(String nama, int Sks){
        super(nama);
        this.Sks=Sks;
    }
    public Integer getJamSibuk(){
        return Sks*3;
    }


}
