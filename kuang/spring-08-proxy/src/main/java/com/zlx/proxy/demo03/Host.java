package com.zlx.proxy.demo03;

import com.zlx.proxy.demo01.Rent;

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房子啦~");
    }

    @Override
    public void watch() {
        System.out.println("房东看房子啦");
    }
}
