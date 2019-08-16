package com.xzy.behavioralpattern.compositepattern;

/**
 * 测试类
 * @author xzy
 * @date 2019/8/15 16:56
 */
public class Main {
    public static void main(String[] args){
        //构造根节点
        Composite rootComposite=new Composite();
        rootComposite.name="根节点";
        //构造左节点
        Composite leftComposite=new Composite();
        leftComposite.name="左节点";
        //构造右节点，并添加两个叶子节点
        Composite rightComposite=new Composite();
        rightComposite.name="右节点";
        Leaf leaf1 = new Leaf();
        leaf1.name = "右-子节点1";
        Leaf leaf2 = new Leaf();
        leaf2.name = "右-子节点2";
        rightComposite.add(leaf1);
        rightComposite.add(leaf2);

        //将左右节点加入根节点
        rootComposite.add(rightComposite);
        rootComposite.add(leftComposite);

        rootComposite.eachChild();
    }
}
