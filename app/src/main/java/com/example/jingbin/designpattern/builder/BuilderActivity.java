package com.example.jingbin.designpattern.builder;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.TagContants;
import butterknife.ButterKnife;
import butterknife.OnClick;
/*
https://blog.csdn.net/hp910315/article/details/49405311
* */
public class BuilderActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_builder)
    public void onViewClicked() {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director pcDirector = new Director(builder);
        pcDirector.construct("Mirhunana", true, 23, 180, 100);
        Person person = builder.create();
        Log.i(TagContants.TAG,"person.toString="+person.toString());
    }
}
