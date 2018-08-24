package com.example.jingbin.designpattern.bridge;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.jingbin.designpattern.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class BridgeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_sedanCar_with_rainyTire, R.id.btn_sedanCar_with_sandyTire, R.id.btn_racingCar_with_rainyTire, R.id.btn_racingCar_with_sandyTire})
    public void onViewClicked(View view) {
        Car car = null;
        switch (view.getId()) {
            case R.id.btn_sedanCar_with_rainyTire:
                car = new SedanCar(new RainyTire());
                break;
            case R.id.btn_sedanCar_with_sandyTire:
                car = new SedanCar(new SandyTire());
                break;
            case R.id.btn_racingCar_with_rainyTire:
                car = new RacingCar(new RainyTire());
                break;
            case R.id.btn_racingCar_with_sandyTire:
                car = new RacingCar(new SandyTire());
                break;
        }
        car.run();
    }
}
