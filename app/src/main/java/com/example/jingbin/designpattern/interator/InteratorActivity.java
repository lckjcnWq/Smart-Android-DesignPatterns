package com.example.jingbin.designpattern.interator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.TagContants;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class InteratorActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intertor);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_interoreter)
    public void onViewClicked() {
        Aggregation<String> a = new ConcreteAggregation<>();
        a.add("a");
        a.add("b");
        a.add("c");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            Log.e(TagContants.TAG,"iterator="+iterator.next());
        }
    }
}
