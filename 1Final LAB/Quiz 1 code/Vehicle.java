class Vehicle extends Machine {
    private static int vehicleCount = 0;

    public Vehicle(String type) {
        super(type);
        vehicleCount++;
		System.out.println(type + " vehicle:"+vehicleCount);
    }

    public void operate() {
        System.out.println("Vehicle Running.");
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }
}
