package com.company.phone;

public class IPhone extends Phone {
    protected void createPhone() {
        specifications.add(new IPhoneCamera());
        specifications.add(new IPhoneDisplay());
        specifications.add(new IPhoneProcessor());
    }
}
