// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.decorator;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.jingbin.designpattern.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DecoratorActivity_ViewBinding implements Unbinder {
  private DecoratorActivity target;

  @UiThread
  public DecoratorActivity_ViewBinding(DecoratorActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DecoratorActivity_ViewBinding(DecoratorActivity target, View source) {
    this.target = target;

    target.btDecorator = Utils.findRequiredViewAsType(source, R.id.bt_decorator, "field 'btDecorator'", Button.class);
    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.activityDecorator = Utils.findRequiredViewAsType(source, R.id.activity_decorator, "field 'activityDecorator'", LinearLayout.class);
    target.btDemo1 = Utils.findRequiredViewAsType(source, R.id.bt_demo1, "field 'btDemo1'", Button.class);
    target.btDemo2 = Utils.findRequiredViewAsType(source, R.id.bt_demo2, "field 'btDemo2'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DecoratorActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btDecorator = null;
    target.tvDefine = null;
    target.activityDecorator = null;
    target.btDemo1 = null;
    target.btDemo2 = null;
  }
}
