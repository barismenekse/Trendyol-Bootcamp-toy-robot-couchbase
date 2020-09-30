package com.trendyol.toyrobot.interfaces;

import com.trendyol.toyrobot.concretes.Location;

public interface Compass {
    Location move(Location location);
    Compass getRight();
    Compass getLeft();
}
