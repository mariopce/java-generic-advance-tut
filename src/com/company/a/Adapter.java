package com.company.a;

import com.company.g.BaseMarkerBalloon;
import com.company.g.MarkerBalloon;

public interface Adapter<T extends MarkerBalloon> {
    <E extends T> String inflate(E markerBalloon);
}
