package exercises;

public class Smartphone extends Computer{
    /*
    For a child class add at least 1 additional property and 1 additional method.
     */

    private double size;

    public Smartphone(int ram, String processor, int hardDrive, String gpu, double size) {
        super(ram, processor, hardDrive, gpu);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String phoneRinging() {
        return "RING RING, PICK UP THE PHONE";
    }

    @Override
    public String toString() {
        return  "Smartphone{" +
                "id=" + this.getId() +
                ", ram=" + this.getRam() +
                ", processor='" + this.getProcessor() + '\'' +
                ", hardDrive=" + this.getHardDrive() +
                ", gpu='" + this.getGpu() + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
