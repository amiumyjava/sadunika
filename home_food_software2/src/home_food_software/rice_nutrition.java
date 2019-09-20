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
public class rice_nutrition {
   private  int RiceId;
   private float protien,carbohydrate,fat ;
 
    public rice_nutrition(int RiceId,float protien,float carbohydrate,float fat ){
    
    this.RiceId=RiceId ;
    this.protien=protien;
    this.carbohydrate=carbohydrate;
    this.fat=fat;
    }
    
    
    public int getRiceId (){
    return RiceId ;
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
