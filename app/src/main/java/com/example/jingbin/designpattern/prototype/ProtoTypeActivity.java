package com.example.jingbin.designpattern.prototype;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.TagContants;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProtoTypeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_prototype)
    public void onViewClicked() {
        ConcretePrototype src = new ConcretePrototype();
        src.setString("src");
        src.getStringList().add("src 1");
        src.getStringList().add("src 2");
        ConcretePrototype des = src.clone();
        des.setString("des");
        des.getStringList().add("des 1");
        des.getStringList().add("des 2");
        Log.e(TagContants.TAG, "src.string = " + src.getString() + "   des.string = " + des.getString());
        StringBuilder builder = new StringBuilder();
        for (String temp : src.getStringList()) {
            builder.append(temp).append("  ");
        }
        Log.e(TagContants.TAG, "src.stringList = " + builder.toString());
        builder = new StringBuilder();
        for (String temp : des.getStringList()) {
            builder.append(temp).append("  ");
        }
        Log.e(TagContants.TAG, "des.stringList = " + builder.toString());
    }
}
