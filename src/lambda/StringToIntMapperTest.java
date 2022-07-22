package lambda;

public class StringToIntMapperTest {
    public static void main(String[] args) {
        StringToIntMapper mapper = (String str) -> str.length();
        String name = "Israel";
        int mappedValue = mapper.map(name);
        System.out.println("name=" + name + ", mapped value=" + mappedValue);
    }
}
