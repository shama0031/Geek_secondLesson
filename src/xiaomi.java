public class xiaomi extends Phone{
    private String model;

    public xiaomi(String name, int camera, String model) {
        super(name, camera);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println("Phone name --> " + getName() +
                "\nPhone camera --> " + getCamera() +
                "\nPhone model --> " + getModel());
    }
}
