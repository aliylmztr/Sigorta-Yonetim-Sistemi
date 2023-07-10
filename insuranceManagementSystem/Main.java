package insuranceManagementSystem;

public class Main {
    public static void main(String[] args) throws InvalidAuthenticationException {

        AccountManager accountManager = new AccountManager();

        User user1 = new User("Ali", "YILMAZ", "aliyilmaz@gmail.com", "123456", "Yazılım Geliştiricisi", 27);

        user1.getInsurances().add(new CarInsurance(100000));
        user1.getInsurances().add(new HealthInsurance(75000));
        user1.getInsurances().add(new ResidenceInsurance(250000));
        user1.getInsurances().add(new TravelInsurance(50000));


        AddressManager addressManager = new AddressManager(user1);
        addressManager.addAddress((new HomeAddress("Türkiye","İstanbul","Kartal", "A","B")));
        addressManager.addAddress((new BusinessAddress("Türkiye","Kocaeli","Gebze", "C","D")));

        Account account1 = new Individual(user1);

        accountManager.getDataList().add(account1);

        accountManager.login("aliyilmaz@gmail.com", "123456");

    }
}
class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException(String message) {
        super(message);
    }
}
