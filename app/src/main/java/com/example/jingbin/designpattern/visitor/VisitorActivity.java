package com.example.jingbin.designpattern.visitor;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.TagContants;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VisitorActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_visitor)
    public void onViewClicked() {
        Medicine a = new MedicineA("板蓝根", 11.0);
        Medicine b = new MedicineB("感康", 14.3);

        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);

        Visitor charger = new Charger();
        charger.setName("张三");

        Visitor workerOfPharmacy = new WorkerOfPharmacy();
        workerOfPharmacy.setName("李四");

        presciption.accept(charger);
        Log.e(TagContants.TAG,"-------------------------------------");
        presciption.accept(workerOfPharmacy);
    }
}
