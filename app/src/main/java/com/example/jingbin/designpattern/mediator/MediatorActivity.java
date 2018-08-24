package com.example.jingbin.designpattern.mediator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.jingbin.designpattern.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MediatorActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_mediator)
    public void onViewClicked() {
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();

        Mediator mediator = new ConcreteMediator(colleagueA, colleagueB);
        colleagueA.setMediator(mediator);
        colleagueB.setMediator(mediator);

        ((ConcreteColleagueA)colleagueA).notifyColleagueB();
        ((ConcreteColleagueB)colleagueB).notifyColleagueA();
    }
}
