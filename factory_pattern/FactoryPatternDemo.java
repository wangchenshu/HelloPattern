package factory_pattern;

public class FactoryPatternDemo {
    public static void main(String[] arga) {
        // 創建工廠
        PersonFactory personFactory = new PersonFactory();
        // 取得會員
        Person member = personFactory.getPerson(PersonEnum.Member);
        // 會員說話
        member.talk();

        System.out.println("========");

        // 取得司機
        Person driver = personFactory.getPerson(PersonEnum.Driver);
        // 司機說話
        driver.talk();
    }
}
