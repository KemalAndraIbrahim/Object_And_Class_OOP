package inheritance_kemal.andra_2.ite.pkg2;
public class Indodax extends Excange_Crypto_Indonesia{
public void tampilkan(){
 String kantorpusat;
 String situsweb;

 kantorpusat=" Millenium Centennial Center Lantai 2, Setia Budi Jakarta Selatan ";
 situsweb="www.indodax.com";

Excange_Crypto_Indonesia i = new Excange_Crypto_Indonesia();

 i.inputData("2014", "Oscar Darmawan", "PT.Indodax Nasional Indonesia");
 i.tampilkandata();

   System.out.println("Alamat Kantor Pusat :    "+kantorpusat);
   System.out.println("Situs Website Resmi :    "+situsweb);
   
}
}
