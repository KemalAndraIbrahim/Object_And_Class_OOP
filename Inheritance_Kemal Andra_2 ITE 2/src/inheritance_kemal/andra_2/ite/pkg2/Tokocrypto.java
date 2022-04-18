package inheritance_kemal.andra_2.ite.pkg2;
public class Tokocrypto extends Excange_Crypto_Indonesia{
public void tampilkan(){
 String kantorpusat;
 String situsweb;

 kantorpusat="Axa Tower Lantai 37,Setia Budi Jakarta Selatan ";
 situsweb="www.tokocrypto.com";

Excange_Crypto_Indonesia t = new Excange_Crypto_Indonesia();

 t.inputData("2017", "Pang Xue Kai", "PT.Aset Digital Berkat");
 t.tampilkandata();

   System.out.println("Alamat Kantor Pusat :    "+kantorpusat);
   System.out.println("Situs Website Resmi :    "+situsweb);
   
}
}

