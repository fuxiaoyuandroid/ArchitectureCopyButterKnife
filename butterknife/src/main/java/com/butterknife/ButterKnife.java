package com.butterknife;

import android.app.Activity;

import java.lang.reflect.Constructor;

/**
 * Created by Administrator on 2018/5/15 0015.
 */

public class ButterKnife {

    public static Unbinder bind(Activity activity){
        // xxxActivity_ViewBinding viewBinding = new xxxActivity_ViewBinding(this);
        try {
            Class<? extends Unbinder> bindClassName = (Class<? extends Unbinder>)
                    Class.forName(activity.getClass().getName() + "_ViewBinding");
            // 构造函数
            Constructor<? extends Unbinder> bindConstructor = bindClassName.getDeclaredConstructor(activity.getClass());
            bindConstructor.setAccessible(true);
            Unbinder unbinder = bindConstructor.newInstance(activity);
            // 返回 Unbinder
            return unbinder;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unbinder.EMPTY;
    }

}
