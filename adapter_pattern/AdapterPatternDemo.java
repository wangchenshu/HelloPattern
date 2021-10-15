package adapter_pattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.TurnOn(new PowerAdapter(new Power220v()));
    }
}
