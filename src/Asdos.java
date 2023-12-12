public class Asdos extends Mahasiswa{
    private Integer jamNgasdos;

    public Asdos(String nama, Integer Sks, Integer jamNgasdos){
        super(nama, Sks);
        this.jamNgasdos=jamNgasdos;
    }
    public Integer getJamSibuk(){
        return super.getJamSibuk() + jamNgasdos;
    }


}
