package com.hurley.library.ui.weight.fresco;

/**
 * Created by hurley, Date on 2019-04-25.
 */

import com.facebook.common.util.ByteConstants;


public class ConfigConstants {
    private static final int MAX_HEAP_SIZE = (int) Runtime.getRuntime().maxMemory();

    public static final int MAX_DISK_CACHE_SIZE = 100 * ByteConstants.MB;
    public static final int MAX_MEMORY_CACHE_SIZE = MAX_HEAP_SIZE / 4;
}