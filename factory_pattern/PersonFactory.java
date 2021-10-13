package factory_pattern;

enum PersonEnum {
    Member, Driver
}

public class PersonFactory {
    /**
     * 取得人
     */
    public Person getPerson(PersonEnum personEnum) {
        if (personEnum == PersonEnum.Member) { // 會員
            return new Member();
        } else if (personEnum == PersonEnum.Driver) { // 司機
            return new Driver();
        }
        return null;
    }

}
