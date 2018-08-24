// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.adapter;

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

public class AdapterActivity_ViewBinding implements Unbinder {
  private AdapterActivity target;

  @UiThread
  public AdapterActivity_ViewBinding(AdapterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AdapterActivity_ViewBinding(AdapterActivity target, View source) {
    this.target = target;

    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.activityAdapter = Utils.findRequiredViewAsType(source, R.id.activity_adapter, "field 'activityAdapter'", LinearLayout.class);
    target.byAdapter = Utils.findRequiredViewAsType(source, R.id.by_adapter, "field 'byAdapter'", Button.class);
    target.btAdapterText = Utils.findRequiredViewAsType(source, R.id.bt_adapter_text, "field 'btAdapterText'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDefine = null;
    target.activityAdapter = null;
    target.byAdapter = null;
    target.btAdapterText = null;
  }
}
