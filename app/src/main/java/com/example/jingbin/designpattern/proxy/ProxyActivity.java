package com.example.jingbin.designpattern.proxy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.TagContants;

import java.lang.reflect.Proxy;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProxyActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.proxy_a, R.id.proxy_b})
    public void onViewClicked(View view) {
        Subject subject = new RealSubject();
        ISubjectProxy proxy = null;
        switch (view.getId()) {
            case R.id.proxy_a:
                proxy = new ProxyA(subject);
                break;
            case R.id.proxy_b:
                proxy = new ProxyB(subject);
                break;
        }
        Subject sub = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), proxy);
        try {
            Log.e(TagContants.TAG, sub.operationA());
        }catch (UnsupportedOperationException e){
            Log.e(TagContants.TAG, e.getMessage());
        }
        try {
            Log.e(TagContants.TAG, sub.operationB());
        }catch (UnsupportedOperationException e){
            Log.e(TagContants.TAG, e.getMessage());
        }
    }
}
