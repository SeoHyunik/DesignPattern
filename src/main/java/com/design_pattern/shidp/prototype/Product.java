package com.design_pattern.shidp.prototype;

/*
* Prototype(원형)역할
* 인스턴스를 복사하여 새 인스턴스를 만들기 위한 메소드를 결정
*/
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}
