import com.company.phone.Phone;
import com.company.phone.PhoneFactory;
import com.company.phone.PhoneType;

public class PhoneFactoryExample {
    public static void main(String[] args) {
        Phone android = PhoneFactory.getPhone(PhoneType.ANDROID);
        Phone iphone = PhoneFactory.getPhone(PhoneType.IPHONE);

        System.out.println(android.print());
        System.out.println(iphone.print());
    }
}
