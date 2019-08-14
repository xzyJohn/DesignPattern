package com.xzy.creatingpattern.singletonpattern.lazysingleton;

/**
 * 饿汉单例模式，在第一次调用的时候实例化自己
 * 静态内部类实现
 *
 * @author xzy
 * @date 2019/8/14 15:02
 */
public class Singleton {

    private Singleton() {
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    /*
     * private static Singleton singleton = null;
     * 此方法线程不安全，在并发环境下可能会创建多个实例
     * @return 实例
     * public static Singleton getInstance(){
     *         if(singleton==null){
     *             singleton=new Singleton();
     *         }
     *         return singleton;
     *     }
     *
     *
     * 1.在方法上加同步（synchronized）
     * @return 实例
     * public static synchronized Singleton getInstance(){
     *         if(singleton==null){
     *             return new Singleton();
     *         }
     *         return singleton;
     *     }
     *
     *
     * 2.双重检查锁定
     * @return 实例
     *  public static Singleton getInstance() {
     *         if (singleton == null) {
     *             synchronized (Singleton.class) {
     *                 if (singleton == null) {
     *                     singleton = new Singleton();
     *                 }
     *             }
     *         }
     *         return singleton;
     *     }
     */


}
