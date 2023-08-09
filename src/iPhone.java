public class iPhone extends Phone{
    private int memory;

    public iPhone(String name, int camera, int memory) {
        super(name, camera);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void print() {
        System.out.println("Phone name --> " + getName() +
                "\nPhone camera --> " + getCamera() +
                "\nPhone model --> " + getMemory());
    }
}
