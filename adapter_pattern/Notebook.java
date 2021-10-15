package adapter_pattern;

public class Notebook {

    public void TurnOn(Power5v power5v) {
        System.out.println("電腦等待電源中...");
        power5v.getPower5v();
        System.out.println("輸入 5v 電源...");
        System.out.println("電腦開機中...");
    }
}
