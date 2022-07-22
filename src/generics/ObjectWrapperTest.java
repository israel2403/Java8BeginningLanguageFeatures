package generics;

public class ObjectWrapperTest {
    public static void main(String[] args) {
        ObjectWrapper stringWrapper = new ObjectWrapper("Hello");
        stringWrapper.set("another string");
        String myString = (String) stringWrapper.get();
        System.out.println(myString);

        ObjectWrapper stringWrapper2 = new ObjectWrapper("Hello");
        stringWrapper2.set(new Integer(101));
        String myString2 = (String) stringWrapper2.get();
        System.out.println(myString2);
    }
}
