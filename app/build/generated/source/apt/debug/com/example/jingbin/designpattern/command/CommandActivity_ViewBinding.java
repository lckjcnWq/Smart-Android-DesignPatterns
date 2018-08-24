// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.command;

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

public class CommandActivity_ViewBinding implements Unbinder {
  private CommandActivity target;

  @UiThread
  public CommandActivity_ViewBinding(CommandActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CommandActivity_ViewBinding(CommandActivity target, View source) {
    this.target = target;

    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.activityCommand = Utils.findRequiredViewAsType(source, R.id.activity_command, "field 'activityCommand'", LinearLayout.class);
    target.btCommand = Utils.findRequiredViewAsType(source, R.id.bt_command, "field 'btCommand'", Button.class);
    target.btZero = Utils.findRequiredViewAsType(source, R.id.bt_zero, "field 'btZero'", Button.class);
    target.btThree = Utils.findRequiredViewAsType(source, R.id.bt_three, "field 'btThree'", Button.class);
    target.btSix = Utils.findRequiredViewAsType(source, R.id.bt_six, "field 'btSix'", Button.class);
    target.btOne = Utils.findRequiredViewAsType(source, R.id.bt_one, "field 'btOne'", Button.class);
    target.btFour = Utils.findRequiredViewAsType(source, R.id.bt_four, "field 'btFour'", Button.class);
    target.btSeven = Utils.findRequiredViewAsType(source, R.id.bt_seven, "field 'btSeven'", Button.class);
    target.btTwo = Utils.findRequiredViewAsType(source, R.id.bt_two, "field 'btTwo'", Button.class);
    target.btFive = Utils.findRequiredViewAsType(source, R.id.bt_five, "field 'btFive'", Button.class);
    target.btNo = Utils.findRequiredViewAsType(source, R.id.bt_no, "field 'btNo'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CommandActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDefine = null;
    target.activityCommand = null;
    target.btCommand = null;
    target.btZero = null;
    target.btThree = null;
    target.btSix = null;
    target.btOne = null;
    target.btFour = null;
    target.btSeven = null;
    target.btTwo = null;
    target.btFive = null;
    target.btNo = null;
  }
}
