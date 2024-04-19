interface Sayble{
    public String say();
}
public class lambdaExpressionExample3{
    public static void main(String[] args) {
        Sayble s=()_>{
            return ("i have nothing to say.)"
        };
        System.out.println(s.say());
    }
}