package com.design_pattern.shidp.prototype;

public class PrototypeProcess {
    public static void main(String[] args) {
        //준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //등록
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //생성, 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        System.out.println();
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        System.out.println();
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");

    }
}