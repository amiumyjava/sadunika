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
public class vitamins_desert {
      private  int DessertId;
    private float Vitamin_A, Thiamin, Ribloflevin, niacin, pantothenic, biotin, piridoxine, vitamin_B12, folic_acid, Vitamin_C, Vitamin_D,vitamin_E,vitamin_k ;
  
    public  vitamins_desert(int DessertId,float Vitamin_A,float Thiamin, float Ribloflevin,float  niacin, 
            float pantothenic, float biotin,float  piridoxine, float vitamin_B12, float folic_acid,float  Vitamin_C,float Vitamin_D,float vitamin_E,float vitamin_k ){
    
    this.DessertId=DessertId ;
    this.Vitamin_A=Vitamin_A;
    this.Thiamin=Thiamin ;
    this.Ribloflevin=Ribloflevin;
    this. niacin= niacin;
    this.pantothenic=pantothenic;
    this. biotin= biotin;
    this.piridoxine=piridoxine;
    this.vitamin_B12=vitamin_B12;
    this.folic_acid=folic_acid;
    this.Vitamin_C=Vitamin_C;
    this.Vitamin_D=Vitamin_D;
    this.vitamin_E=vitamin_E;
    this.vitamin_k=vitamin_k;
 
    }
    
    
    public int getDessertId(){
    return DessertId ;
    } 
    public float getVitamin_A(){
    return Vitamin_A ;
    }
     public float getThiamin (){
    return Thiamin  ;
    }
    public float getRibloflevin (){
    return Ribloflevin ;
    } 
    public float getniacin (){
    return niacin ;
    } 
     public float getpantothenic(){
    return  pantothenic;
    } 
     public float getbiotin (){
    return  biotin;
    } 
     public float getpiridoxine(){
    return piridoxine ;
    } 
     public float getvitamin_B12(){
    return vitamin_B12 ;
    } 
     public float getfolic_acid (){
    return folic_acid ;
    } 
     public float getVitamin_C(){
    return  Vitamin_C;
    } 
     public float getVitamin_D (){
    return Vitamin_D ;
    } 
     public float getvitamin_E(){
    return vitamin_E ;
    } 
     public float getvitamin_k (){
    return vitamin_k ;}
}
