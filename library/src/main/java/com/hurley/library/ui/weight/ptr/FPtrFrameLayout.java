package com.hurley.library.ui.weight.ptr;

import android.content.Context;
import android.util.AttributeSet;

import com.hurley.library.ui.weight.ptr.lib.PtrFrameLayout;

/**
 * Created by hurley, Date on 2019-04-25.
 */
public class FPtrFrameLayout extends PtrFrameLayout {

    private FPtrHeader mFPtrHeader;

    public FPtrFrameLayout(Context context) {
        super(context);
        initView();
    }

    public FPtrFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public FPtrFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView();
    }

    private void initView() {
        mFPtrHeader = new FPtrHeader(getContext());
        setHeaderView(mFPtrHeader);
        addPtrUIHandler(mFPtrHeader);
    }


}
