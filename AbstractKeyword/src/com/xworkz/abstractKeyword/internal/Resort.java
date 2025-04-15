package com.xworkz.abstractKeyword.internal;

import com.xworkz.abstractKeyword.external.Lodge;

public class Resort extends Lodge {
    public Resort(String name) {
        super(name);
    }

    public Resort(String name, String location) {
        super(name, location);
    }

    public Resort(String name, String location, int roomCapacity, int rentPerDay) {
        super(name, location, roomCapacity, rentPerDay);
    }
}
