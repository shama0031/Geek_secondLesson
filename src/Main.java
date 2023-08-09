public class Main {
    public static void main(String[] args) {
        Printable[] object = new Printable[3];
        object[0] = createObject("Iphone");
        object[1] = createObject("Samsung");
        object[2] = createObject("Xiaomi");

        for (Printable obj : object) {
            obj.print();
            System.out.println();
        }
    }
    public static Printable createObject(String className){
        switch (className){
            case "Iphone":
                return new iPhone("12 pro", 30, 256);
            case "Samsung":
                return new samsung("Samsung ", 40, 123);
            case "Xiaomi":
                return new xiaomi("Xiaomi ", 123, "super model");
            default:
                throw new IllegalArgumentException("Sorry, but we dont know this -> " + className);
        }


    }
}
