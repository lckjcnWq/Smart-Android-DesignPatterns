package com.example.jingbin.designpattern.composite;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.jingbin.designpattern.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class CompositeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_component)
    public void onViewClicked() {
        Component root = new Composite();

        Component leaf1 = new Leaf();
        Component branch = new Composite();
        root.add(leaf1);
        root.add(branch);

        Component leaf2 = new Leaf();
        branch.add(leaf2);

        root.operation();
    }
}
