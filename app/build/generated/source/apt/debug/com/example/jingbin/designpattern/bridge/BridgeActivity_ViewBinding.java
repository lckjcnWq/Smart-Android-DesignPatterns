// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.bridge;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.jingbin.designpattern.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BridgeActivity_ViewBinding implements Unbinder {
  private BridgeActivity target;

  private View view2131165289;

  private View view2131165290;

  private View view2131165287;

  private View view2131165288;

  @UiThread
  public BridgeActivity_ViewBinding(BridgeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BridgeActivity_ViewBinding(final BridgeActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_sedanCar_with_rainyTire, "method 'onViewClicked'");
    view2131165289 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_sedanCar_with_sandyTire, "method 'onViewClicked'");
    view2131165290 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_racingCar_with_rainyTire, "method 'onViewClicked'");
    view2131165287 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_racingCar_with_sandyTire, "method 'onViewClicked'");
    view2131165288 = view;
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


    view2131165289.setOnClickListener(null);
    view2131165289 = null;
    view2131165290.setOnClickListener(null);
    view2131165290 = null;
    view2131165287.setOnClickListener(null);
    view2131165287 = null;
    view2131165288.setOnClickListener(null);
    view2131165288 = null;
  }
}
