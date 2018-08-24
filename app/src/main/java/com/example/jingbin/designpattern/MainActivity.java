package com.example.jingbin.designpattern;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jingbin.designpattern.adapter.AdapterActivity;
import com.example.jingbin.designpattern.bridge.BridgeActivity;
import com.example.jingbin.designpattern.builder.BuilderActivity;
import com.example.jingbin.designpattern.chainofres.ChniaofResActivity;
import com.example.jingbin.designpattern.command.CommandActivity;
import com.example.jingbin.designpattern.composite.CompositeActivity;
import com.example.jingbin.designpattern.decorator.DecoratorActivity;
import com.example.jingbin.designpattern.facade.FacadeActivity;
import com.example.jingbin.designpattern.factory.FactoryActivity;
import com.example.jingbin.designpattern.flyweight.FlyWightActivity;
import com.example.jingbin.designpattern.interator.InteratorActivity;
import com.example.jingbin.designpattern.interpreter.InterpreterActivity;
import com.example.jingbin.designpattern.mediator.MediatorActivity;
import com.example.jingbin.designpattern.memento.MementoActivity;
import com.example.jingbin.designpattern.observer.ObserverActivity;
import com.example.jingbin.designpattern.prototype.ProtoTypeActivity;
import com.example.jingbin.designpattern.proxy.ProxyActivity;
import com.example.jingbin.designpattern.singleton.SingletonActivity;
import com.example.jingbin.designpattern.state.StateActivity;
import com.example.jingbin.designpattern.strategy.StrategyActivity;
import com.example.jingbin.designpattern.templatemethod.TemplateMethodActivity;
import com.example.jingbin.designpattern.visitor.VisitorActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wuquan on 2018/8/17.
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_builder, R.id.bt_factory, R.id.bt_singleton, R.id.bt_prototype, R.id.bt_adapter, R.id.bt_bridge, R.id.bt_composite, R.id.bt_decorator, R.id.bt_facade, R.id.bt_flyweight, R.id.bt_proxy, R.id.bt_chainofRespon, R.id.bt_command, R.id.bt_interpreter, R.id.bt_iterator, R.id.bt_mediator, R.id.bt_memento, R.id.bt_observer, R.id.bt_state, R.id.bt_strategy, R.id.bt_template_method, R.id.bt_visitor})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            //构建模式
            case R.id.bt_builder:
                startActivity(new Intent(this, BuilderActivity.class));
                break;
            case R.id.bt_factory:
                startActivity(new Intent(this, FactoryActivity.class));
                break;
            case R.id.bt_singleton:
                startActivity(new Intent(this, SingletonActivity.class));
                break;
            case R.id.bt_prototype:
                startActivity(new Intent(this, ProtoTypeActivity.class));
                break;

            //结构模式
            case R.id.bt_adapter:
                startActivity(new Intent(this, AdapterActivity.class));
                break;
            case R.id.bt_bridge:
                startActivity(new Intent(this, BridgeActivity.class));
                break;
            case R.id.bt_composite:
                startActivity(new Intent(this, CompositeActivity.class));
                break;
            case R.id.bt_decorator:
                startActivity(new Intent(this, DecoratorActivity.class));
                break;
            case R.id.bt_facade:
                startActivity(new Intent(this, FacadeActivity.class));
                break;
            case R.id.bt_flyweight:
                startActivity(new Intent(this, FlyWightActivity.class));
                break;
            case R.id.bt_proxy:
                startActivity(new Intent(this, ProxyActivity.class));
                break;

            //行为模式
            case R.id.bt_chainofRespon:
                startActivity(new Intent(this, ChniaofResActivity.class));
                break;
            case R.id.bt_command:
                startActivity(new Intent(this, CommandActivity.class));
                break;
            case R.id.bt_interpreter:
                startActivity(new Intent(this, InterpreterActivity.class));
                break;
            case R.id.bt_iterator:
                startActivity(new Intent(this, InteratorActivity.class));
                break;
            case R.id.bt_mediator:
                startActivity(new Intent(this, MediatorActivity.class));
                break;
            case R.id.bt_memento:
                startActivity(new Intent(this, MementoActivity.class));
                break;
            case R.id.bt_observer:
                startActivity(new Intent(this, ObserverActivity.class));
                break;
            case R.id.bt_state:
                startActivity(new Intent(this, StateActivity.class));
                break;
            case R.id.bt_strategy:
                startActivity(new Intent(this, StrategyActivity.class));
                break;
            case R.id.bt_template_method:
                startActivity(new Intent(this, TemplateMethodActivity.class));
                break;
            case R.id.bt_visitor:
                startActivity(new Intent(this, VisitorActivity.class));
                break;
            default:
                break;
        }
    }
}
