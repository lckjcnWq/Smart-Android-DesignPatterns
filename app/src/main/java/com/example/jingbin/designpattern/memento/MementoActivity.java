package com.example.jingbin.designpattern.memento;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.TagContants;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MementoActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_memento)
    public void onViewClicked() {
        Originator originator = new Originator();
        originator.setState(1);
        Caretaker caretaker = new Caretaker();
        caretaker.storeMemento(originator.createMemoto());
        Log.e(TagContants.TAG,"before");
        originator.print();
        originator.setState(2);
        Log.e(TagContants.TAG,"after");
        originator.print();
        originator.restore(caretaker.restoreMemento());
        Log.e(TagContants.TAG,"restore to the original state");
        originator.print();
    }
}
