package computer;

public class Computer {

    private double processTact;
    private double memory;
    private int hardDrive;

    public Computer() {
    }

    public Computer(double processTact, double memory, int hardDrive) {
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public double getProcessTact() {
        return processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void info() {
        System.out.println("CPU tact: " + getProcessTact());
        System.out.println("RAM: " + getMemory());
        System.out.println("HDD size: " + getHardDrive());
    }
}
