package com.hurley.library.ui.weight.ptr;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.hurley.library.R;
import com.hurley.library.ui.weight.ptr.lib.PtrFrameLayout;
import com.hurley.library.ui.weight.ptr.lib.PtrUIHandler;
import com.hurley.library.ui.weight.ptr.lib.indicator.PtrIndicator;

/**
 * Created by hurley, Date on 2019-04-25.
 */
public class FPtrHeader extends FrameLayout implements PtrUIHandler {

    public FPtrHeader(Context context) {
        super(context);
        initView();
    }

    public FPtrHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public FPtrHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FPtrHeader(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView();
    }

    private void initView() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.item_refresh_header, this, false);
        addView(v);
    }

    @Override
    public void onUIReset(PtrFrameLayout frame) {

    }

    @Override
    public void onUIRefreshPrepare(PtrFrameLayout frame) {

    }

    @Override
    public void onUIRefreshBegin(PtrFrameLayout frame) {

    }

    @Override
    public void onUIRefreshComplete(PtrFrameLayout frame) {

    }

    @Override
    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator) {

    }
}
