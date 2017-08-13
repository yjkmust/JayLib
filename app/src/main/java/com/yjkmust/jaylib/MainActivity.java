package com.yjkmust.jaylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.yjkmust.onepeace.View.WaveView;

public class MainActivity extends AppCompatActivity {

    private WaveView waveView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        waveView = (WaveView) findViewById(R.id.wave_view);
        imageView = (ImageView) findViewById(R.id.image);

        final FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(-2, -2);
        lp.gravity = Gravity.BOTTOM|Gravity.CENTER;
        waveView.setOnWaveAnimationListener(new WaveView.onWaveAnimationListener() {
            @Override
            public void onWaveAnimation(float y) {
                lp.setMargins(0,0,0,(int) y+2);
                imageView.setLayoutParams(lp);
            }
        });

    }
}
