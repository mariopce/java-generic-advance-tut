package com.company.a;

import com.company.g.BaseMarkerBalloon;
import com.company.g.MarkerBalloon;

public class SimpleAdapter extends BaseAdapter<BaseMarkerBalloon> {


    @Override
    public String inflate(BaseMarkerBalloon markerBalloon) {
        return "SA " + markerBalloon.getName();
    }
}
