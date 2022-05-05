package com.mzvzm.entity;

import javax.persistence.Embeddable;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/5/3 15:21
 */
@Embeddable
public class GPS implements Coordinates{
    private double latitude;
    private double longitude;
    private GPS() {}

    public GPS(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }


    @Override
    public double x() {
        return latitude;
    }

    @Override
    public double y() {
        return longitude;
    }
}
