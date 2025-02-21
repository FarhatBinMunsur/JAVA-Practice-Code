class Machine {
    private static int machineCount = 0;
    private String type;

    public Machine(String type) {
        this.type = type;
        machineCount++;
        System.out.println(type + " created :"+machineCount);
    }

    public void operate() {
        System.out.println(type + " working.");
    }

    public static int getMachineCount() {
        return machineCount;
    }
}