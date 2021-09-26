package com.company.phone;

public class PhoneFactory {

    public static Phone getPhone(PhoneType phoneType) {
        switch (phoneType) {
            case ANDROID:
                return new Android();
            case IPHONE:
                return new IPhone();
            default:
                return null;
        }
    }
}
