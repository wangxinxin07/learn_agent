package com.wxx.learn;

/**
 * @描述:
 * @文件名: AgentTest.java
 * @创建人: wangxinxin
 * @创建时间: 2020/10/27
 * @修改人: wangxinxin
 * @修改备注: <br/>
 * <p>
 */
public class AgentTest {

    public static void main(String[] args) {
        System.out.println("main start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
