/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Dang Duc
 */
public class Brand {
    private String brandID;
    private String brandName;
    private String soundBrand;
    private double price;
    
   public Brand(){
       
   }
   public Brand(String brandID, String brandName,String soundBrand, double price){
       this.brandID = brandID;
       this.brandName = brandName;
       this.soundBrand = soundBrand;
       this.price = price;
   }
    public String getBrandID(){
       return brandID;
   }

   public String getBrandName (){
       return brandName;
   }
   public void setUpdateBrand(String brandName, String soundBrand, double price){
        this.brandName = brandName;
       this.soundBrand = soundBrand;
       this.price = price;
   }

   
  
 @Override
   public String toString(){
       return this.brandID + ", " + this.brandName + ", " + this.soundBrand + ": " + this.price ;
   }
}
