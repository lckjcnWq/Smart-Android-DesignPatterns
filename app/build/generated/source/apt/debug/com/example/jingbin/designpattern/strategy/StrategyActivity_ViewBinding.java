// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.strategy;

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

public class StrategyActivity_ViewBinding implements Unbinder {
  private StrategyActivity target;

  @UiThread
  public StrategyActivity_ViewBinding(StrategyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StrategyActivity_ViewBinding(StrategyActivity target, View source) {
    this.target = target;

    target.btStrategy = Utils.findRequiredViewAsType(source, R.id.bt_strategy, "field 'btStrategy'", Button.class);
    target.activityStategy = Utils.findRequiredViewAsType(source, R.id.activity_stategy, "field 'activityStategy'", LinearLayout.class);
    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.btStrategyText = Utils.findRequiredViewAsType(source, R.id.bt_strategy_text, "field 'btStrategyText'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StrategyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btStrategy = null;
    target.activityStategy = null;
    target.tvDefine = null;
    target.btStrategyText = null;
  }
}
