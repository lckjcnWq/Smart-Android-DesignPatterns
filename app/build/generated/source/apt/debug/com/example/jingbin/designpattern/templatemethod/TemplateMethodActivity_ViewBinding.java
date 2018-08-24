// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.templatemethod;

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

public class TemplateMethodActivity_ViewBinding implements Unbinder {
  private TemplateMethodActivity target;

  @UiThread
  public TemplateMethodActivity_ViewBinding(TemplateMethodActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TemplateMethodActivity_ViewBinding(TemplateMethodActivity target, View source) {
    this.target = target;

    target.btTemplateMethod = Utils.findRequiredViewAsType(source, R.id.bt_template_method, "field 'btTemplateMethod'", Button.class);
    target.btTemplateMethodText = Utils.findRequiredViewAsType(source, R.id.bt_template_method_text, "field 'btTemplateMethodText'", Button.class);
    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.activityTemplateMethod = Utils.findRequiredViewAsType(source, R.id.activity_template_method, "field 'activityTemplateMethod'", LinearLayout.class);
    target.btTemplateMethodText2 = Utils.findRequiredViewAsType(source, R.id.bt_template_method_text2, "field 'btTemplateMethodText2'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TemplateMethodActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btTemplateMethod = null;
    target.btTemplateMethodText = null;
    target.tvDefine = null;
    target.activityTemplateMethod = null;
    target.btTemplateMethodText2 = null;
  }
}
