package com.example.manas.contactview;

/**
 * Created by Admin on 27-08-2017.
 */
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.android.example.mapviewpoint.R;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class AndroidMapViewActivity extends MapActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapView mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);

        Drawable marker=getResources().getDrawable(android.R.drawable.star_big_on);
        int markerWidth = marker.getIntrinsicWidth();
        int markerHeight = marker.getIntrinsicHeight();
        marker.setBounds(0, markerHeight, markerWidth, 0);


        MyItemizedOverlay myItemizedOverlay = new MyItemizedOverlay(marker);
        mapView.getOverlays().add(myItemizedOverlay);

        GeoPoint myPoint1 = new GeoPoint(0*1000000, 0*1000000);
        myItemizedOverlay.addItem(myPoint1, "myPoint1", "myPoint1");
        GeoPoint myPoint2 = new GeoPoint(50*1000000, 50*1000000);
        myItemizedOverlay.addItem(myPoint2, "myPoint2", "myPoint2");

    }

    @Override
    protected boolean isLocationDisplayed() {
// TODO Auto-generated method stub
        return false;
    }

    @Override
    protected boolean isRouteDisplayed() {
// TODO Auto-generated method stub
        return false;
    }

}
