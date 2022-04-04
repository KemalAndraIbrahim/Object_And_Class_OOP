/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
class ReadyStock{
    String model;
    String Mesin;
    String Harga;

}
        
public class KatalogKemalGarage {
    public static void main(String[] args) {
     ReadyStock mtr1 = new ReadyStock();
     ReadyStock mtr2 = new ReadyStock();
     ReadyStock mtr3 = new ReadyStock();
    
     mtr1.model = " Caferacer ";
     mtr1.Mesin = " Yamaha Scorpio ";
     mtr1.Harga = " 17.000.000";
     
     mtr2.model = " Japstyle ";
     mtr2.Mesin = " Honda Megapro ";
     mtr2.Harga = " 14.500.000";
     
     mtr3.model = " British Style ";
     mtr3.Mesin = " Honda Gl00 ";
     mtr3.Harga = " 10.500.000";
     
     System.out.println("Model Motor Custom : " + mtr1.model);
     System.out.println(" Basic Mesin Motor : " + mtr1.Mesin);
     System.out.println(" Harga Nett : " + mtr1.Harga);
     
     System.out.println("Model Motor Custom : " + mtr2.model);
     System.out.println(" Basic Mesin Motor : " + mtr2.Mesin);
     System.out.println(" Harga Nett : " + mtr2.Harga);
     
     System.out.println("Model Motor Custom : " + mtr3.model);
     System.out.println(" Basic Mesin Motor : " +mtr3.Mesin);
     System.out.println(" Harga Nett : " + mtr3.Harga);
     
    }
    
}
