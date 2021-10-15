package adapter_pattern;

public class PowerAdapter implements Power5v {
    Power220v power220v;

    public PowerAdapter(Power220v power220v) {
        this.power220v = power220v;
    }

    @Override
    public int getPower5v() {
        power220v.getPower220v();
        System.out.println("取得 220v 電源...");
        this.translate();
        System.out.println("輸出 5v 電源...");
        return 5;
    }

    public void translate() {
        System.out.println("轉換電源中...");
    }

}
