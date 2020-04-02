package creational.prototype;

public abstract class Gadget implements Cloneable {

    private String cpu;
    private int ram;
    private int memory;
    private float screen;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

}
