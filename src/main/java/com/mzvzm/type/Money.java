package com.mzvzm.type;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/5/3 10:56
 */
public class Money {
    private long cents;

    public Money(long cents) {
        this.cents = cents;
    }

    public long getCents() {
        return cents;
    }

    public void setCents(long cents) {
        this.cents = cents;
    }
}
