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
public class customer {
      private  int customerId;
            private String customer_name,address,Telephone_Number ;
      
      
      
      
     public customer(int customerId ,String customer_name,String address,String Telephone_Number){
      
     this.customerId=customerId;
     this.customer_name=customer_name;
     this.address=address;
     this.Telephone_Number=Telephone_Number;
     
     }
     
     
     
    public int getcustomerId(){
    return  customerId;
    }
    public String getcustomer_name(){
    return customer_name;
    } 
    public String getaddress(){
    return address;
    } 
    public String getTelephone_Number(){
    return Telephone_Number;
    } 
}
