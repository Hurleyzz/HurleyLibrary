package com.hurley.library.ui.weight.recyclerview;

import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by hurley, Date on 2019-04-25.
 */
public abstract class AbstractViewHolder<T> extends BaseViewHolder {

    public AbstractViewHolder(View view) {
        super(view);
    }

    public AbstractViewHolder(ViewGroup parent, @LayoutRes int id) {
        super(LayoutInflater.from(parent.getContext()).inflate(id, parent, false));

    }

    public abstract void bindData(T data);
}
