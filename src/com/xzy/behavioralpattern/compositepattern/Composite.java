package com.xzy.behavioralpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类
 * @author xzy
 * @date 2019/8/15 16:49
 */
public class Composite extends Component {
    List<Component> list=new ArrayList<Component>();

    /**
     * 添加节点，添加部件
     * @param component 对象实例
     */
    @Override
    public void add(Component component) {
        list.add(component);
    }

    /**
     * 删除节点，删除实例
     * @param component 对象实例
     */
    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    /**
     * 遍历子节点
     */
    @Override
    public void eachChild() {
        System.out.println(name+"执行了");
        for (Component c:list){
            c.eachChild();
        }
    }
}
