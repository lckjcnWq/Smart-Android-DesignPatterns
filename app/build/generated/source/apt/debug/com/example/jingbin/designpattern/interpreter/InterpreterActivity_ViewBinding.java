// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.interpreter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.jingbin.designpattern.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class InterpreterActivity_ViewBinding implements Unbinder {
  private InterpreterActivity target;

  private View view2131165283;

  @UiThread
  public InterpreterActivity_ViewBinding(InterpreterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public InterpreterActivity_ViewBinding(final InterpreterActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_interoreter, "method 'onViewClicked'");
    view2131165283 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131165283.setOnClickListener(null);
    view2131165283 = null;
  }
}
