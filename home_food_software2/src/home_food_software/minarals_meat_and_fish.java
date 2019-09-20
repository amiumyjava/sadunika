/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_food_software;

/**
 *
 * @author isuru udana
 */
public class minarals_meat_and_fish {
      private int  meat_and_fishId ;
     private float calcium, chloride, chromium, copper, fluoride,Iodine,
            iron,magnesium,molybdenum, phosphorus,potassium,selenium, znc,sodium  ;
  
    
    public  minarals_meat_and_fish(int  meat_and_fishId ,float calcium,float chloride,float chromium,float copper,float fluoride,float Iodine,
           float iron,float magnesium,float molybdenum,float phosphorus,float potassium,float selenium,float znc,float sodium ){
  
              this.meat_and_fishId =meat_and_fishId ;
              this.calcium=calcium;
              this.chloride=chloride;
              this.chromium=chromium;
              this. copper= copper;
              this.fluoride=fluoride;
              this.Iodine=Iodine;
              this. iron= iron;
              this.magnesium=magnesium;
              this.molybdenum=molybdenum;
              this.phosphorus=phosphorus;
              this.potassium=potassium;
              this.selenium=selenium;
              this.znc=znc;
              this.sodium=sodium;        
     }
    
    public int getmeat_and_fishId(){return meat_and_fishId ;}
    
    public float getcalcium(){return calcium ;}
    
    public float getchloride(){return chloride ;}

    public float getchromium(){ return chromium ;}
   
    public float getcopper(){return copper  ;}
    
    public float getfluoride(){return  fluoride;}
    
    public float getIodine(){return Iodine ;}
    
    public float getiron(){ return iron ;}
   
    public float getmagnesium(){return magnesium ;}
    
    public float getmolybdenum(){return molybdenum ;}
    
    public float getphosphorus(){return phosphorus ;}
    
    public float getpotassium(){ return potassium ;}
   
    public float getselenium(){return selenium ;}
    
    public float getznc(){ return znc ;}
   
   public float getsodium(){ return sodium ;}
}
