package com.equinetworks.interfaces;

public class InterfacesRunner {

    public static void main(String[] args) {

//        Deliverable[] deliverable = new Deliverable[3];
        Deliverable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Deliverable phone = new CellPhone("Samsung", "S10", 1, 950);
        Deliverable frige = new Frige("Indesit", "E2350F", 1, 450);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(frige);
    }

    private static void printDeliveryPrice(Deliverable del){
        System.out.println("Deliverable price "+del.calcDeliveryPrice());
    }
}
