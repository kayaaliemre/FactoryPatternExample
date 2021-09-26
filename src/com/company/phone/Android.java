package com.company.phone;

public class Android extends Phone {

    protected void createPhone() {
        specifications.add(new AndroidCamera());
        specifications.add(new AndroidDisplay());
        specifications.add(new AndroidProcessor());
    }
}
