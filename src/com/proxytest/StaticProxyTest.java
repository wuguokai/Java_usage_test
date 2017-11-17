package com.proxytest;

/**
 * Created by WUGUOKAI on 2017/11/13.
 */
public class StaticProxyTest {

    //4.测试代码
    public static void main(String[] args){
        Admin admin = new Admin();
        Manager m = new AdminPoly(admin);
        m.doSomething();
    }

 /*   //方式二：继承式静态代理
//与上面的方式仅代理类和测试代码不同
//1.代理类
    public class AdminProxy extends Admin {
        @Override
        public void doSomething() {
            System.out.println("Log:admin操作开始");
            super.doSomething();
            System.out.println("Log:admin操作开始");
        }
    }
    //2.测试代码
    AdminProxy proxy = new AdminProxy();
        proxy.doSomething();*/
}

/**方式一：聚合式静态代理
 */

//1.抽象主题接口
interface Manager {
    void doSomething();
}
//2.真实主题类
class Admin implements Manager {
    public void doSomething() {
        System.out.println("Admin do something.");
    }
}
//3.以聚合方式实现的代理主题
class AdminPoly implements Manager{
    private Admin admin;

    public AdminPoly(Admin admin) {
        super();
        this.admin = admin;
    }

    public void doSomething() {
        System.out.println("Log:admin操作开始");
        admin.doSomething();
        System.out.println("Log:admin操作结束");
    }
}
