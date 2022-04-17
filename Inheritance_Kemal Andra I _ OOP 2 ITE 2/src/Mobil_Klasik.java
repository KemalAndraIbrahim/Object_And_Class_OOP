public class Mobil_Klasik {

 private String merek;
 private String warna;
 private String jenis;

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
 public void tampilkandata(){
        System.out.println("merek mobil :"+getMerek());
        System.out.println("warna mobil :"+getWarna());
        System.out.println("jenis mobil :"+getJenis());
        
 }
 public void inputData(String m,String w,String j){
     setMerek(m);
     setWarna(w);
     setJenis(j);
     
     
 }
}