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
public class nutrition_meat_and_fish {
     private  int meat_and_fishId;
      private float protien,carbohydrate,fat ;
 
    public nutrition_meat_and_fish(int meat_and_fishId,float protien,float carbohydrate,float fat ){
    
    this.meat_and_fishId=meat_and_fishId;
    this.protien=protien;
    this.carbohydrate=carbohydrate;
    this.fat=fat;
    }
    
    
    public int getmeat_and_fishId(){
    return meat_and_fishId ;
    } 
    public float getprotien (){
    return protien ;
    } 
    public float getcarbohydrate (){
    return carbohydrate ;
    } 
    public float getfat (){
    return fat ;
    } 
}
