package com.equinetworks.interfaces;

public class InterfacesRunner {

    public static void main(String[] args) {

//        Deliverable[] deliverable = new Deliverable[3];
        Pricable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Pricable phone = new CellPhone("Samsung", "S10", 1, 950);
        Pricable fridge = new Fridge("Indesit", "E2350F", 1, 450);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Pricable del){
        System.out.println("Deliverable price "+del.calcDeliveryPrice());
        System.out.println("Order price "+del.calcOrderPrice());
    }
}
