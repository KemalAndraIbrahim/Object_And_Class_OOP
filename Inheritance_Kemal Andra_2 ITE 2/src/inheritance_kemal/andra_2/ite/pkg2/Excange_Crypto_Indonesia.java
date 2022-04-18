package inheritance_kemal.andra_2.ite.pkg2;
public class Excange_Crypto_Indonesia {

 private String didirikan;
 private String pendiri;
 private String induk;

    public String getInduk() {
        return induk;
    }

    public void setInduk(String induk) {
        this.induk = induk;
    }

    public String getDidirikan() {
        return didirikan;
    }

    public void setDidirikan(String didirikan) {
        this.didirikan = didirikan;
    }

    public String getPendiri() {
        return pendiri;
    }

    public void setPendiri(String pendiri) {
        this.pendiri = pendiri;
    }
 
 public void tampilkandata(){
        System.out.println("Tahun Didirikan  :       "+getDidirikan());
        System.out.println("Pendiri          :       "+getPendiri());
        System.out.println("Induk Perusahaan :        "+getInduk());
        
 }
 public void inputData(String d,String p,String i){
     setDidirikan(d);
     setPendiri(p);
     setInduk(i);
     
     
 }
}
   

