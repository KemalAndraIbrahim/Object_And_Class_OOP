
    public class Honda extends Mobil_Klasik {
public void tampilkan(){
 double besarcc;
 String bahanbakar;
 String kategori;

 besarcc=1.596;
 bahanbakar="Pertamax";
 kategori="Compact car";

Mobil_Klasik m = new Mobil_Klasik();

 m.inputData("Civic Estilo", "Hitam", "Klasik");
 m.tampilkandata();

   System.out.println("cc mesin :"+besarcc);
   System.out.println("jenis bahan bakar :"+bahanbakar);
   System.out.println("jenis kategori :"+kategori);
   
}
}

 

