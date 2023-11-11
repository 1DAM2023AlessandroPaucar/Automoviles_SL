public class Main {
    public static void main(String[] args) {
        //Vehiculo
            Vehicle vehicle1 = new Vehicle();
            vehicle1.setLicensePlate("ABCDEF");
            vehicle1.setBrand("Seat");
            vehicle1.setModel("León FR XS");
            vehicle1.setColor("Rojo Estandar");
            vehicle1.setFuelType("Diesel");
            vehicle1.setMotorType("Leon 2.0 DSG FR XS");
            vehicle1.setHorsepower(150);
    // Customer
        Customer customer1 = new Customer();
            customer1.setId("700000F");
            customer1.setName("Raul Alejandro");
            customer1.setSurname("Ocasio Ruiz");
            customer1.setHomeAdress("Barcelona, Barcelona");

    //Sale
        Sale sale1 = new Sale();
        sale1.setCode("001");
        sale1.setCustomer(customer1);

    // Print
        System.out.println("El cliente es " + sale1.getCustomer().getName());
        System.out.println("El coche que ha comprado es " + vehicle1.getBrand() + " " + vehicle1.getModel());
        System.out.println("El color de dicho coche es " + vehicle1.getColor() + " y su potencia es " + vehicle1.getHorsepower() + "CV");
        System.out.println("El código de esta compra es " + sale1.getCode());

    }
}