package com.design_pattern.shidp.prototype;

/*
* ConcretePrototype(구체적인 원형)역할
* 인스턴스를 복사하여 새 인스턴스를 만다는 메소드를 구현
*/
public class MessageBox implements Product {
    private char decoChar;
    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar + " " + s + " " + decoChar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
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
