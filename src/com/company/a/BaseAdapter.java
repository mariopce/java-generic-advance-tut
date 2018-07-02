package com.company.a;

import com.company.g.BaseMarkerBalloon;
import com.company.g.MarkerBalloon;

public class BaseAdapter<T extends MarkerBalloon> implements Adapter<T> {


    @Override
    public <E extends T> String inflate(E markerBalloon) {
        return "BA " + markerBalloon.getName();
    }
}
