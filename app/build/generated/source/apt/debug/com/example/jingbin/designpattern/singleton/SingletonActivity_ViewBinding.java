// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.singleton;

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

public class SingletonActivity_ViewBinding implements Unbinder {
  private SingletonActivity target;

  @UiThread
  public SingletonActivity_ViewBinding(SingletonActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SingletonActivity_ViewBinding(SingletonActivity target, View source) {
    this.target = target;

    target.btEhan = Utils.findRequiredViewAsType(source, R.id.bt_ehan, "field 'btEhan'", Button.class);
    target.btLanhan = Utils.findRequiredViewAsType(source, R.id.bt_lanhan, "field 'btLanhan'", Button.class);
    target.btInclass = Utils.findRequiredViewAsType(source, R.id.bt_inclass, "field 'btInclass'", Button.class);
    target.btEnum = Utils.findRequiredViewAsType(source, R.id.bt_enum, "field 'btEnum'", Button.class);
    target.activitySingleton = Utils.findRequiredViewAsType(source, R.id.activity_singleton, "field 'activitySingleton'", LinearLayout.class);
    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SingletonActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btEhan = null;
    target.btLanhan = null;
    target.btInclass = null;
    target.btEnum = null;
    target.activitySingleton = null;
    target.tvDefine = null;
  }
}
