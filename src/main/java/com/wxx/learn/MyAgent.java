package com.wxx.learn;

import java.lang.instrument.Instrumentation;

/**
 * @描述:
 * @文件名: MyAgent.java
 * @创建人: wangxinxin
 * @创建时间: 2020/10/27
 * @修改人: wangxinxin
 * @修改备注: <br/>
 * <p>
 */
public class MyAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("this is an agent.");
    }
}
