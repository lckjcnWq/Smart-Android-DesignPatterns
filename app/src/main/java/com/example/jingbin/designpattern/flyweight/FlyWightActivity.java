package com.example.jingbin.designpattern.flyweight;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.TagContants;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FlyWightActivity extends Activity {
    private ShapeFactory factory = new ShapeFactory();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweigth);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_flyweight)
    public void onViewClicked() {
        Shape shape1 = factory.getShape("红色");
        shape1.draw();
        Shape shape2 = factory.getShape("灰色");
        shape2.draw();
        Shape shape3 = factory.getShape("绿色");
        shape3.draw();
        Shape shape4 = factory.getShape("红色");
        shape4.draw();
        Shape shape5 = factory.getShape("灰色");
        shape5.draw();
        Shape shape6 = factory.getShape("灰色");
        shape6.draw();
        Log.e(TagContants.TAG, "一共绘制了"+factory.getSize()+"中颜色的圆形");
    }
}
