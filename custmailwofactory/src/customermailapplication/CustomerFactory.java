/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author Din_z
 */
public class CustomerFactory {
    public static Customer createCustomer(String Type){
        Customer customer = null;
        switch(Type){
            case "Regular" :
            customer=new RegularCustomer();
            break;
            case "Mountain" :
            customer=new MountainCustomer();
            break;
            case "Delinquent" :
            customer=new DelinquentCustomer();
            break;
        }
        return  customer;
    }
    
}
