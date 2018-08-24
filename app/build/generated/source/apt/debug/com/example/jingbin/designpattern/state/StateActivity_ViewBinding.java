// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.state;

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

public class StateActivity_ViewBinding implements Unbinder {
  private StateActivity target;

  @UiThread
  public StateActivity_ViewBinding(StateActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StateActivity_ViewBinding(StateActivity target, View source) {
    this.target = target;

    target.btFacade = Utils.findRequiredViewAsType(source, R.id.bt_facade, "field 'btFacade'", Button.class);
    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.activityState = Utils.findRequiredViewAsType(source, R.id.activity_state, "field 'activityState'", LinearLayout.class);
    target.btFacadeOld = Utils.findRequiredViewAsType(source, R.id.bt_facade_old, "field 'btFacadeOld'", Button.class);
    target.btFacadeBetter = Utils.findRequiredViewAsType(source, R.id.bt_facade_better, "field 'btFacadeBetter'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StateActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btFacade = null;
    target.tvDefine = null;
    target.activityState = null;
    target.btFacadeOld = null;
    target.btFacadeBetter = null;
  }
}
