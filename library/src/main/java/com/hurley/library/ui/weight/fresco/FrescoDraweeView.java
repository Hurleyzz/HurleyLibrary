package com.hurley.library.ui.weight.fresco;

/**
 * Created by hurley, Date on 2019-04-25.
 */

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * 使用Fresco完成图片的下载和渲染
 */
public class FrescoDraweeView extends SimpleDraweeView {
    public FrescoDraweeView(Context context, GenericDraweeHierarchy hierarchy) {
        super(context, hierarchy);
    }

    public FrescoDraweeView(Context context) {
        super(context);
    }

    public FrescoDraweeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FrescoDraweeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public FrescoDraweeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    protected void setImageUrl(String uri) {
        super.setImageURI(Uri.parse(uri));
    }
}