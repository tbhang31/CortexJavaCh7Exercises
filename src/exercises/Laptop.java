package exercises;

public class Laptop extends Computer{
    /*
    For a child class add at least 1 additional property and 1 additional method.
     */
    private int batteryLife;

    public Laptop(int ram, String processor, int hardDrive, String gpu,int batteryLife) {
        super(ram, processor, hardDrive, gpu);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String iAmLaptop() {
        return "I am a laptop";
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + this.getId() +
                ", ram=" + this.getRam() +
                ", processor='" + this.getProcessor() + '\'' +
                ", hardDrive=" + this.getHardDrive() +
                ", gpu='" + this.getGpu() + '\'' +
                ", batteryLife='" + batteryLife + '\'' +
                '}';
    }
}
