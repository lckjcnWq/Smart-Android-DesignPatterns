// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.observer;

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

public class ObserverActivity_ViewBinding implements Unbinder {
  private ObserverActivity target;

  @UiThread
  public ObserverActivity_ViewBinding(ObserverActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ObserverActivity_ViewBinding(ObserverActivity target, View source) {
    this.target = target;

    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.btObserver = Utils.findRequiredViewAsType(source, R.id.bt_observer, "field 'btObserver'", Button.class);
    target.btMyself = Utils.findRequiredViewAsType(source, R.id.bt_myself, "field 'btMyself'", Button.class);
    target.btSystem = Utils.findRequiredViewAsType(source, R.id.bt_system, "field 'btSystem'", Button.class);
    target.activityObserver = Utils.findRequiredViewAsType(source, R.id.activity_observer, "field 'activityObserver'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ObserverActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDefine = null;
    target.btObserver = null;
    target.btMyself = null;
    target.btSystem = null;
    target.activityObserver = null;
  }
}
