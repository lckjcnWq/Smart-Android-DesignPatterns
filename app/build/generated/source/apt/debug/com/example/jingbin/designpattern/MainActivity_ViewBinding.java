// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165232;

  private View view2131165245;

  private View view2131165265;

  private View view2131165261;

  private View view2131165229;

  private View view2131165231;

  private View view2131165236;

  private View view2131165237;

  private View view2131165242;

  private View view2131165248;

  private View view2131165262;

  private View view2131165233;

  private View view2131165235;

  private View view2131165251;

  private View view2131165252;

  private View view2131165254;

  private View view2131165255;

  private View view2131165258;

  private View view2131165267;

  private View view2131165269;

  private View view2131165272;

  private View view2131165277;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.bt_builder, "method 'onViewClicked'");
    view2131165232 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_factory, "method 'onViewClicked'");
    view2131165245 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_singleton, "method 'onViewClicked'");
    view2131165265 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_prototype, "method 'onViewClicked'");
    view2131165261 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_adapter, "method 'onViewClicked'");
    view2131165229 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_bridge, "method 'onViewClicked'");
    view2131165231 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_composite, "method 'onViewClicked'");
    view2131165236 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_decorator, "method 'onViewClicked'");
    view2131165237 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_facade, "method 'onViewClicked'");
    view2131165242 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_flyweight, "method 'onViewClicked'");
    view2131165248 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_proxy, "method 'onViewClicked'");
    view2131165262 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_chainofRespon, "method 'onViewClicked'");
    view2131165233 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_command, "method 'onViewClicked'");
    view2131165235 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_interpreter, "method 'onViewClicked'");
    view2131165251 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_iterator, "method 'onViewClicked'");
    view2131165252 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_mediator, "method 'onViewClicked'");
    view2131165254 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_memento, "method 'onViewClicked'");
    view2131165255 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_observer, "method 'onViewClicked'");
    view2131165258 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_state, "method 'onViewClicked'");
    view2131165267 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_strategy, "method 'onViewClicked'");
    view2131165269 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_template_method, "method 'onViewClicked'");
    view2131165272 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_visitor, "method 'onViewClicked'");
    view2131165277 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131165232.setOnClickListener(null);
    view2131165232 = null;
    view2131165245.setOnClickListener(null);
    view2131165245 = null;
    view2131165265.setOnClickListener(null);
    view2131165265 = null;
    view2131165261.setOnClickListener(null);
    view2131165261 = null;
    view2131165229.setOnClickListener(null);
    view2131165229 = null;
    view2131165231.setOnClickListener(null);
    view2131165231 = null;
    view2131165236.setOnClickListener(null);
    view2131165236 = null;
    view2131165237.setOnClickListener(null);
    view2131165237 = null;
    view2131165242.setOnClickListener(null);
    view2131165242 = null;
    view2131165248.setOnClickListener(null);
    view2131165248 = null;
    view2131165262.setOnClickListener(null);
    view2131165262 = null;
    view2131165233.setOnClickListener(null);
    view2131165233 = null;
    view2131165235.setOnClickListener(null);
    view2131165235 = null;
    view2131165251.setOnClickListener(null);
    view2131165251 = null;
    view2131165252.setOnClickListener(null);
    view2131165252 = null;
    view2131165254.setOnClickListener(null);
    view2131165254 = null;
    view2131165255.setOnClickListener(null);
    view2131165255 = null;
    view2131165258.setOnClickListener(null);
    view2131165258 = null;
    view2131165267.setOnClickListener(null);
    view2131165267 = null;
    view2131165269.setOnClickListener(null);
    view2131165269 = null;
    view2131165272.setOnClickListener(null);
    view2131165272 = null;
    view2131165277.setOnClickListener(null);
    view2131165277 = null;
  }
}
