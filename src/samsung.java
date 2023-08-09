public class samsung extends Phone{
    private int password;

    public int getPassword() {
        return password;
    }

    public samsung(String name, int camera, int password) {
        super(name, camera);
        this.password = password;
    }

    @Override
    public void print() {
        System.out.println("Phone name --> " + getName() +
                "\nPhone camera --> " + getCamera() +
                "\nPhone model --> " + getPassword());
    }
}
