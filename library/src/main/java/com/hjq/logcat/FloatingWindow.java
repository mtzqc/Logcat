package com.hjq.logcat;

import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;

import com.hjq.xtoast.OnClickListener;
import com.hjq.xtoast.XToast;
import com.hjq.xtoast.draggable.SpringDraggable;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/Logcat
 *    time   : 2020/01/24
 *    desc   : 悬浮窗口
 */
final class FloatingWindow extends XToast implements OnClickListener {

    FloatingWindow(Activity activity) {
        super(activity);
        setView(R.layout.logcat_window_floating);
        setAnimStyle(android.R.style.Animation_Toast);
        setDraggable(new SpringDraggable());
        setGravity(Gravity.END | Gravity.CENTER_VERTICAL);
        setOnClickListener(android.R.id.icon, this);
    }

    @Override
    public void onClick(XToast toast, View view) {
        startActivity(new Intent(getContext(), LogcatActivity.class));
    }
}