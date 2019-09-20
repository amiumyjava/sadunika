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
public class nutrition_vegetables {
      private  int vegitableId;
     private float protien,carbohydrate,fat ;
 
    public nutrition_vegetables(int vegitableId,float protien,float carbohydrate,float fat ){
    
    this.vegitableId=vegitableId;
    this.protien=protien;
    this.carbohydrate=carbohydrate;
    this.fat=fat;
    }
    
    
    public int getvegitableId(){
    return vegitableId ;
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
