package dmax.dialog;

import android.content.Context;
import android.view.View;

/**
 * Created by Maxim Dybarsky | maxim.dybarskyy@gmail.com
 * on 13.01.15 at 14:17
 */
class AnimatedView extends View {

    private int target;

    public AnimatedView(Context context) {
        super(context);
    }

    // 定义get/set方法，类似定义属性，对于动画，可直接改变view坐标值，无需监听动画
    public float getXFactor() {
        return getX() / target;
    }

    public void setXFactor(float xFactor) {
        setX(target * xFactor);
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getTarget() {
        return target;
    }
}
