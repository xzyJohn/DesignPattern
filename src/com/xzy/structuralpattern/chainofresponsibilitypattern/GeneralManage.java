package com.xzy.structuralpattern.chainofresponsibilitypattern;

/**
 * 具体的处理者角色
 * 总经理
 * @author xzy
 * @date 2019/8/16 17:10
 */
public class GeneralManage extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String string = "";
        String man = "xzy";
        int price = 1000;
        //总经理能审核所有金额
        if (fee >= price) {
            if (man.equals(user)) {
                string = "成功：总经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            } else {
                string = "失败：总经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }
        } else {
            //金额超过500，继续传递给级别更高的人
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return string;
    }
}
