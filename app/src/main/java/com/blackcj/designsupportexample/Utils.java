package com.blackcj.designsupportexample;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by wangyl on 18-3-12.
 */

public class Utils {

    public static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static float dpToPx(Context context, float dp) {
        return Math.round(dp * getDisplayMetrics(context).density);
    }
}
