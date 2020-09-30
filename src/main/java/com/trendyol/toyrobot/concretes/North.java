package com.trendyol.toyrobot.concretes;

import com.trendyol.toyrobot.interfaces.Compass;

public class North implements Compass {
    private static Compass rightCompass = new East();
    private static Compass leftCompass = new West();
    @Override
    public Location move(Location location) {

        location.setY(location.getY()+1);
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
