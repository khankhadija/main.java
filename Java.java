class Main {
    public static void main(String... args) {
        Person khadija = new Person();
        khadija.name = "Khadija";
        khadija.age = 20;
        khadija.atHome = true;
        khadija.initial = 'K';

        System.out.printIn(aboutMe(khadija.name, khadija.age, khadija.atHome, khadija.initial));
    }

    public static String aboutMe(String name, int age, boolean atHome, char initial) {
        String out = name + " is " + Integer.toString(age) + " and has the initial " + Character.toString(initial);

        if (atHome == true) {
            out += " and is at home ";
        } else {
            out += " and is not at home. ";
        }

        return out;
    }
}