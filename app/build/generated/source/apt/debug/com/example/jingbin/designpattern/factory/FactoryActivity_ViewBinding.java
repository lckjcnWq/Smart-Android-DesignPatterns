// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.factory;

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

public class FactoryActivity_ViewBinding implements Unbinder {
  private FactoryActivity target;

  @UiThread
  public FactoryActivity_ViewBinding(FactoryActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FactoryActivity_ViewBinding(FactoryActivity target, View source) {
    this.target = target;

    target.btSimpleFactory = Utils.findRequiredViewAsType(source, R.id.bt_simple_factory, "field 'btSimpleFactory'", Button.class);
    target.btFactoryMethod = Utils.findRequiredViewAsType(source, R.id.bt_factory_method, "field 'btFactoryMethod'", Button.class);
    target.btStaticFactory = Utils.findRequiredViewAsType(source, R.id.bt_static_factory, "field 'btStaticFactory'", Button.class);
    target.btAbstractFactory = Utils.findRequiredViewAsType(source, R.id.bt_abstract_factory, "field 'btAbstractFactory'", Button.class);
    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.activityRoujiaMoStore = Utils.findRequiredViewAsType(source, R.id.activity_roujia_mo_store, "field 'activityRoujiaMoStore'", LinearLayout.class);
    target.tvDefine2 = Utils.findRequiredViewAsType(source, R.id.tv_define2, "field 'tvDefine2'", TextView.class);
    target.tvDefine3 = Utils.findRequiredViewAsType(source, R.id.tv_define3, "field 'tvDefine3'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FactoryActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btSimpleFactory = null;
    target.btFactoryMethod = null;
    target.btStaticFactory = null;
    target.btAbstractFactory = null;
    target.tvDefine = null;
    target.activityRoujiaMoStore = null;
    target.tvDefine2 = null;
    target.tvDefine3 = null;
  }
}
