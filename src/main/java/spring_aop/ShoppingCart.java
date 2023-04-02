package spring_aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){

        //1. Logging
        //2. Authentication & Authorization
        //3. Sanitize the Data
        // all these are cross-cutting concern which need to be separate it out. All 1-3 called "aspect"
        System.out.println("Checkout Method from ShippingCart Called");
    }

    public int quantity(){
        return 2;
    }
}
