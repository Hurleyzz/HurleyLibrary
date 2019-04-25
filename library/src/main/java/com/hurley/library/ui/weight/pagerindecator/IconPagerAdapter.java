package com.hurley.library.ui.weight.pagerindecator;

/**
 * Created by hurley, Date on 2019-04-25.
 */
public interface IconPagerAdapter {
    /**
     * Get icon representing the page at {@code index} in the adapter.
     */
    int getIconResId(int index);

    // From PagerAdapter
    int getCount();
}

