package com.company.phone;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {

    protected List<Specification> specifications = new ArrayList<Specification>();

    public Phone() {
        createPhone();
    }

    protected abstract void createPhone();

    public String print(){
        final StringBuffer sb = new StringBuffer("Phone{");
        int i = 0;
        for(Specification specification : specifications) {
            sb.append(specification.description());
            if(i < specifications.size() -1){
                sb.append(",");
            }
            i++;
        }
        sb.append('}');
        return sb.toString();
    }

}

