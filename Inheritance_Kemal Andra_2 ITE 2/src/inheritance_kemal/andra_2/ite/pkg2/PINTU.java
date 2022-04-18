package inheritance_kemal.andra_2.ite.pkg2;
public class PINTU extends Excange_Crypto_Indonesia{
public void tampilkan(){
 String kantorpusat;
 String situsweb;

 kantorpusat=" The City Tower Lantai 27 , Jakarta Pusat ";
 situsweb="www.pintu.co.id";

Excange_Crypto_Indonesia p = new Excange_Crypto_Indonesia();

 p.inputData("2019", "Jeth Soetoyo", "PT.Pintu Kemana Saja");
 p.tampilkandata();

   System.out.println("Alamat Kantor Pusat :    "+kantorpusat);
   System.out.println("Situs Website Resmi :    "+situsweb);
   
}
}