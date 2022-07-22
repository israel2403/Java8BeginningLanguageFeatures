package generics;

public class WrapperUtilTest {
    public static void main(String[] args) {
        Wrapper<Object> objectWrapper = new Wrapper<Object>(new Object());
        WrapperUtil.printFileDetails(objectWrapper); // OK

        Wrapper<String> stringWrapper = new Wrapper<String>("Hello");
        // WrapperUtil.printFileDetails(stringWrapper);
    }
}
