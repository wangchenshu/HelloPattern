package adapter_pattern;

public class Notebook {

    public void TurnOn(Power5v power5v) {
        System.out.println("電腦 等待電源中...");
        // 取得 5v 電源
        power5v.getPower5v();
        System.out.println("輸入 5v 電源...");
        System.out.println("電腦 開機中...");
    }
}
