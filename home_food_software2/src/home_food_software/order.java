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
public class order {
      private  int customerId,Quntity;
            private String vegetableId1,vegetableId2,vegetableId3,vegetableId4, meat_and_fishId ,riceId,dessertId ;
      private String  date ,  time;
     
     public order(int customerId ,String vegetableId1,String vegetableId2,String vegetableId3,String vegetableId4,
                 String meat_and_fishId ,String riceId  ,String dessertId ,String date,String time,int Quntity){
      
     this.customerId=customerId;
     this.vegetableId1=vegetableId1;
     this.vegetableId2=vegetableId2;
     this.vegetableId3=vegetableId3;
     this.vegetableId4=vegetableId4;
     this.meat_and_fishId=meat_and_fishId;
     this.riceId=riceId;
     this.dessertId=dessertId;
     this.date=date;
     this.time=time;
     this.Quntity=Quntity;
     
     }
     
     
     
    public int getcustomerId(){
    return  customerId;
    }
    public String getvegetableId1(){
    return vegetableId1;
    } 
    public String getvegetableId2(){
    return vegetableId2;
    } 
    public String getvegetableId3(){
    return vegetableId3;
    } 
    public String getvegetableId4(){
    return vegetableId4;
    }
    public String getmeat_and_fishId(){
    return meat_and_fishId;
    }
     public String getriceId(){
    return riceId;
    }
    public String getdessertId(){
    return dessertId;
    }
    public String getdate(){
    return date;
    }
    public String gettime(){
    return time;
    }
    public int getQuntity(){
    return Quntity;
    }
}
