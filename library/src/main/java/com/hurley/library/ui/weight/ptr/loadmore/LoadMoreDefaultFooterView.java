package com.hurley.library.ui.weight.ptr.loadmore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.hurley.library.R;

/**
 * Created by hurley, Date on 2019-04-25.
 */
public class LoadMoreDefaultFooterView extends RelativeLayout implements LoadMoreUIHandler {

    private ProgressBar mProgressBar;

    public LoadMoreDefaultFooterView(Context context) {
        this(context, null);
    }

    public LoadMoreDefaultFooterView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadMoreDefaultFooterView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setupViews();
    }

    private void setupViews() {
        LayoutInflater.from(getContext()).inflate(R.layout.cube_views_load_more_default_footer, this);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
    }

    @Override
    public void onLoading(LoadMoreContainer container) {
        setVisibility(VISIBLE);
        mProgressBar.setVisibility(VISIBLE);
    }

    @Override
    public void onLoadFinish(LoadMoreContainer container, boolean empty, boolean hasMore) {
        if (hasMore) {
            setVisibility(INVISIBLE);
        } else {
            if (empty) {
                setVisibility(GONE);
//                mTextView.setText(R.string.cube_views_load_more_loaded_empty);
            } else {
                setVisibility(VISIBLE);
                mProgressBar.setVisibility(INVISIBLE);
//                mTextView.setText(R.string.cube_views_load_more_loaded_no_more);
            }
        }
    }

    @Override
    public void onWaitToLoadMore(LoadMoreContainer container) {
        setVisibility(VISIBLE);
        mProgressBar.setVisibility(VISIBLE);
    }

    @Override
    public void onLoadError(LoadMoreContainer container, int errorCode, String errorMessage) {
    }
}
