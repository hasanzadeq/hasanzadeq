package app.warmup;

public class StringApp {

    public static void print(String origin, Filterable f) {
        String formatted = f.format(origin);
        System.out.println(formatted);
    }

    public static void main(String[] args) {
        Filterable str = new RemoveAllVowels();
        print("hello",  str);
    }
}
