package pbo;

//inheritance
public class BukuDetail extends Buku {
//overriding
    public BukuDetail(String judul, String kode) {
        super(judul, kode);
    }
    
    public int getTahunTerbit(){
        return Integer.parseInt(getKode().substring(0, 2)) + 2000;
    }
    
    public String getPenerbit(){
        String kodePen = getKode().substring(2, 4);
        //seleksi if
        if(kodePen.equals("12")){
            return "PT Gramedia Pustaka Utama";
        } else {
            return "Penerbit lain";
        }
    }
    
    public String getJenisBuku(){
        String kodeJenisBuku = getKode().substring(4, 6);
        //seleksi switch
        switch(kodeJenisBuku){
            case "34":
                return "Fiksi";
            case "35":
            return "Non Fiksi";
            default:
                return "Jenis Buku lain";  
        }
    }
    
    public int getHalamanBuku(){
        return Integer.parseInt(getKode().substring(6));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Terbit: "+getTahunTerbit()+
                "\nPenerbit: "+getPenerbit()+
                "\nJenis Buku: "+getJenisBuku()+
                "\nHalaman Buku: "+getHalamanBuku();
    }
}
