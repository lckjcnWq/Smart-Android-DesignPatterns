package com.example.jingbin.designpattern.interpreter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.example.jingbin.designpattern.R;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InterpreterActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intertor);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_interoreter)
    public void onViewClicked() {

    }
}
