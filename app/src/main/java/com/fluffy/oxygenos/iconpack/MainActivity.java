package com.fluffy.oxygenos.iconpack;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Fluffy OxygenOS Icon Pack Installed!\n\nApply via OnePlus Launcher: Settings > Wallpapers and style > Icons, or select in Nova/Lawnchair.");
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18f);
        tv.setPadding(40, 40, 40, 40);
        setContentView(tv);
    }
}
