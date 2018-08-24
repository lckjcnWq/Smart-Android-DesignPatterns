package com.example.jingbin.designpattern.chainofres;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.jingbin.designpattern.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChniaofResActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_res);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_chainOfRes)
    public void onViewClicked() {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.successor = concreteHandler2;
        concreteHandler2.successor = concreteHandler1;
        concreteHandler1.handleRequest("ConcreteHandler2");
    }
}
