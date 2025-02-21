class Car extends Vehicle {
    private static int carCount = 0;
    private boolean isElectric;

    public Car(String type, boolean isElectric) {
        super(type);
        this.isElectric = isElectric;
        carCount++;
		if (isElectric) {
            System.out.println(type + " electric: "+carCount);
        } else {
            System.out.println(type + " gas: "+carCount);
        }
    }

    public void operate(){
        if (isElectric) {
            System.out.println("Electric Moving.");
        } 
		else {
            System.out.println(" Gas Roaring.");
        }
    }

    public static int getCarCount() {
        return carCount;
}
}