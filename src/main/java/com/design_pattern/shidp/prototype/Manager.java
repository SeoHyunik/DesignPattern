package com.design_pattern.shidp.prototype;

import java.util.HashMap;
import java.util.Map;

/*
* Cient(이용자)역할
* 인스턴스를 복사하는 메소드를 이용해 새 인스턴스를 생성
*/
public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = showcase.get(protoName);
        return p.createCopy();
    }

}
