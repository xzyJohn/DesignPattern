package com.xzy.behavioralpattern.compositepattern;

/**
 * 组合部件类
 * @author xzy
 * @date 2019/8/15 16:43
 */
public class Leaf extends Component {
    /**
     * 叶子节点不具备添加的能力
     * @param component 对象实例
     */
    @Override
    public void add(Component component) {
        System.out.println("");
    }

    /**
     * 叶子节点不具备删除的能力
     * @param component 对象实例
     */
    @Override
    public void remove(Component component) {
        System.out.println("");
    }

    /**
     * 叶子节点没有子节点，所以显示自己
     */
    @Override
    public void eachChild() {
        System.out.println(name+"执行了");
    }
}
