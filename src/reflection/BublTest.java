package reflection;

public class BublTest {
    public static void main(String[] args) {
        /*
         * Uncomment only one of the following statements at a time.
         * Observe the ouput to see the difference in the way the Bulb class
         * is loades an initialized.
         */
        // BublTest.createObject();
        // BublTest.forName();
        // BublTest.forNameVersion2();
        BublTest.forName();
    }

    public static void classLiteral() {
        // Will load the class, but won't initialize in Jva 5 later.
        // Prior version of Java will initialize the class too.
        Class<Bulb> c = Bulb.class;
    }

    public static void forNameVersion2() {
        try {
            String className = "reflection.Bulb";
            boolean initialize = false;

            // Get the classloader for the current class
            ClassLoader cLoader = BublTest.class.getClassLoader();

            // will load, but not initialize the class, becouse we have set
            // the initialize variable false
            Class c = Class.forName(className, initialize, cLoader);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void forName() {
        try {
            String className = "reflection.Bulb";
            // Will load and initialize the class
            Class c = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createObject() {
        // Will load and initialize the Bulb class
        new Bulb();
    }
}
