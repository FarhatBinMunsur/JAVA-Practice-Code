public class Test {
    public static void main(String[] args) {
		
        Machine crane = new Machine("Crane");
        Machine sedan = new Car("Sedan",false);
        Machine tesla = new Car("Tesla",true);
        
        System.out.println("Machines: " + Machine.getMachineCount());
        System.out.println("Vehicles: " + Vehicle.getVehicleCount());
        System.out.println("Cars: " + Car.getCarCount());
    
		crane.operate();
        sedan.operate();
        tesla.operate();
	}
}
