
public class Toyota extends Mobil_Klasik {

    public void tampilkan(){
     
        double besarcc=1.300;
     String bahanbakar="Pertalite";
     String kategori="Subcompact car";

     Mobil_Klasik m = new Mobil_Klasik();

     m.inputData("Toyota Starlet", "Putih", "Klasik");
     m.tampilkandata();

      System.out.println("CC mesin :"+besarcc);
      System.out.println("jenis bahan bakar :"+bahanbakar);
      System.out.println("jenis kategori :"+kategori);

    }
    
}    
