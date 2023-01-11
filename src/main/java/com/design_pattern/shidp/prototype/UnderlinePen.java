package com.design_pattern.shidp.prototype;

/*
 * ConcretePrototype(구체적인 원형)역할
 * 인스턴스를 복사하여 새 인스턴스를 만다는 메소드를 구현
 */
public class UnderlinePen implements Product{
    private char ulchar;
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println(s);
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}
