package com.company;

import com.company.a.Adapter;
import com.company.a.BaseAdapter;
import com.company.a.SimpleAdapter;
import com.company.g.BaseMarkerBalloon;
import com.company.g.MarkerBalloon;
import com.company.g.SimpleMarkerBalloon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Adapter> list = new ArrayList<>();
        Adapter<? super BaseMarkerBalloon> adapter = new SimpleAdapter();
        Adapter<? super BaseMarkerBalloon> adapter2 = new NewAdapter();

        list.add(adapter);
        list.add(new BaseAdapter());
        list.add(getAdapter());

        for (Adapter adapter1 : list) {
            System.out.println(adapter1.inflate(new BaseMarkerBalloon()));
            System.out.println(adapter1.inflate(new SimpleMarkerBalloon()));
            System.out.println(adapter1.inflate(new NewBalloon()));
        }

    }

    private static Adapter<? super BaseMarkerBalloon> getAdapter() {
        return new NewAdapter();
    }


    static class NewAdapter extends BaseAdapter<MarkerBalloon> {

        @Override
        public <E extends MarkerBalloon> String inflate(E markerBalloon) {
            return "NAE " + markerBalloon.getName();
        }

        public String inflate(BaseMarkerBalloon markerBalloon) {
            return "NA " + super.inflate(markerBalloon);
        }
    }
    static class NewBalloon extends BaseMarkerBalloon {

        @Override
        public String getName() {
            return "new";
        }
    }
}

