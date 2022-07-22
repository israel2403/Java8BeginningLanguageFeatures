package generics;

public class WrapperTest {
    public static void main(String[] args) {
        Wrapper<String> greetingWrapper = new Wrapper<String>("Hello");
        greetingWrapper.set("Hi");
        System.out.println(greetingWrapper.get());

        Wrapper<Integer> integerWrapper = new Wrapper<Integer>(23);
        integerWrapper.set(897);
        System.out.println(integerWrapper.get());
    }
}
