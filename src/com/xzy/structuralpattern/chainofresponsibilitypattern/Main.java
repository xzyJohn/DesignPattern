package com.xzy.structuralpattern.chainofresponsibilitypattern;

/**
 * 测试类
 *
 * @author xzy
 * @date 2019/8/16 17:13
 */
public class Main {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new GeneralManage();
        Handler handler2 = new DeptManage();
        Handler handler3 = new ProjectManager();
        handler3.setSuccessor(handler2);
        handler2.setSuccessor(handler1);

        //开始测试
        String test1 = handler3.handleFeeRequest("xzy", 300);
        System.out.println("test1" + test1);
        String test2=handler3.handleFeeRequest("xxx",300);
        System.out.println("test2"+test2);
        System.out.println("----------------------------------------");

        String test3 = handler3.handleFeeRequest("xzy", 700);
        System.out.println("test3" + test3);
        String test4=handler3.handleFeeRequest("xxx",700);
        System.out.println("test4"+test4);
        System.out.println("----------------------------------------");

        String test5 = handler3.handleFeeRequest("xzy", 1500);
        System.out.println("test5" + test5);
        String test6=handler3.handleFeeRequest("xxx",1500);
        System.out.println("test6"+test6);
        System.out.println("----------------------------------------");
    }
}
