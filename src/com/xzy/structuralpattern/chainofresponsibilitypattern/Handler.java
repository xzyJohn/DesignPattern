package com.xzy.structuralpattern.chainofresponsibilitypattern;

/**
 * 抽象的处理角色类
 * @author xzy
 * @date 2019/8/16 16:55
 */
public abstract class Handler {
    /**
     * 持有下一个处理请求的参数
     */
    protected Handler successor=null;

    /**
     * 取值方法
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 设置下一个处理请求的对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐的费用
     * @param user 申请人
     * @param fee 申请的钱
     * @return 结果通知
     */
    public abstract String handleFeeRequest(String user,double fee);
}
