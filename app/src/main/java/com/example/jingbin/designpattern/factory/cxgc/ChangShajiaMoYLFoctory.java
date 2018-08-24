package com.example.jingbin.designpattern.factory.cxgc;

/**
 *
 * 长沙的肉夹馍原料工厂,是长沙的特色原料,还有其他分店的特色原料
 */

public class ChangShajiaMoYLFoctory implements RoujiaMoYLFactory {

    @Override
    public Meet creatMeet() {
        return new ChangShaFreshMeet();
    }

    @Override
    public YuanLiao creatYuanLiao() {
        return new ChangShaTeSeYuanLiao();
    }
}
