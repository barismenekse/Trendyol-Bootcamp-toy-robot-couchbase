package com.trendyol.toyrobot.concretes;

import com.trendyol.toyrobot.interfaces.Compass;

public class East implements Compass {
    private static Compass rightCompass = new South();
    private static Compass leftCompass = new North();

    @Override
    public Location move(Location location) {

        location.setX(location.getX()+1);
        return location;
    }

    @Override
    public Compass getRight() {
        return rightCompass;
    }

    @Override
    public Compass getLeft() {
        return leftCompass;
    }
}
