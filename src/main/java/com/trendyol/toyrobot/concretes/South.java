package com.trendyol.toyrobot.concretes;

import com.trendyol.toyrobot.interfaces.Compass;

public class South implements Compass{
    private static Compass rightCompass = new West();
    private static Compass leftCompass = new East();
    @Override
    public Location move(Location location) {
        location.setY(location.getY()-1);
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
