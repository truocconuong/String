public class Test {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hello");
        str.append("World");
        System.out.println(str);
        System.out.println(str.delete(2,5));
    }
}
