public abstract class Phone implements  Printable{
    private String name;
    private int camera;

    public String getName() {
        return name;
    }

    public int getCamera() {
        return camera;
    }

    public Phone(String name, int camera) {
        this.name = name;
        camera = camera;
    }
}
