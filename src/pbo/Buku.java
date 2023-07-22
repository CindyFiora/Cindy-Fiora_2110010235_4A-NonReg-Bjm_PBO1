package pbo;

//class
public class Buku {
    //atribut dan encapsulation
   private String judul;
   private String kode;

   //constructor
    public Buku(String judul, String kode) {
        this.judul = judul;
        this.kode = kode;
    }

    //mutator (setter)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    //accessor (getter)
    public String getJudul() {
        return judul;
    }

    public String getKode() {
        return kode;
    }
   
   public String displayInfo(){
       return "Judul: "+getJudul()+"\nKode: "+getKode();
   }
   
   //polymorphism (overloading)
   public String displayInfo(String pengarang){
       return displayInfo() + "\nPengarang: "+pengarang;
   }
}
