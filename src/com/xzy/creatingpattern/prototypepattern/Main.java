package com.xzy.creatingpattern.prototypepattern;

import com.xzy.creatingpattern.builderpattern.ConcreteBuilder;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/14 17:45
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype cloneConcretePrototype= (ConcretePrototype) concretePrototype.clone();
            cloneConcretePrototype.show();
        }
    }
}
