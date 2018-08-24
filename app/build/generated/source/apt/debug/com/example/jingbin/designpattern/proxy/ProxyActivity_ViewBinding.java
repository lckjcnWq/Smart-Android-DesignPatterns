// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.proxy;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.jingbin.designpattern.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProxyActivity_ViewBinding implements Unbinder {
  private ProxyActivity target;

  private View view2131165341;

  private View view2131165342;

  @UiThread
  public ProxyActivity_ViewBinding(ProxyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProxyActivity_ViewBinding(final ProxyActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.proxy_a, "method 'onViewClicked'");
    view2131165341 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.proxy_b, "method 'onViewClicked'");
    view2131165342 = view;
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


    view2131165341.setOnClickListener(null);
    view2131165341 = null;
    view2131165342.setOnClickListener(null);
    view2131165342 = null;
  }
}
