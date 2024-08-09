public class Aufgabe1 {
    public static void main(String[] args) throws Exception {
        String var1 = "ei";
        String var2 = "eine";
        Boolean found = false;

        var1 = var1.toLowerCase();
        var2 = var2.toLowerCase();

        if (var2.contains(var1)) {
            var2 = var2.replaceFirst(var1, "");
            found = true;
        }

        if (var2.contains(var1))
            found = false;

        System.out.println(found);
    }
}
