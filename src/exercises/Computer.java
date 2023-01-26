package exercises;

import java.util.Objects;

public class Computer {
    /*
    For a parent class add 3 properties, 2 methods, and a constructor.
     */
    private int id;
    private static int nextId=1;
    private int ram;
    private String processor;
    private int hardDrive;
    private String gpu;

    public Computer() {
        this.id = nextId;
        nextId++;
    }

    public Computer(int ram, String processor, int hardDrive, String gpu) {
        this();
        this.ram = ram;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.gpu = gpu;
    }

    public int getId() {
        return id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", hardDrive=" + hardDrive +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return id == computer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
