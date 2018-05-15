package com.butterknife;

import android.support.annotation.UiThread;

/**
 * Created by Administrator on 2018/5/15 0015.
 */

public interface Unbinder {
    @UiThread
    void unbind();

    Unbinder EMPTY = new Unbinder() {
        @Override
        public void unbind() {
        }
    };
}
