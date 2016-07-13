package aly.com.alyreader.utils;

/**
 * Created by sunger on 2015/12/15.
 */

import android.content.Context;
import android.content.res.TypedArray;

import aly.com.alyreader.R;


public class Utils {

    public static int getToolbarHeight(Context context) {
        final TypedArray styledAttributes = context.getTheme().obtainStyledAttributes(
                new int[]{R.attr.actionBarSize});
        int toolbarHeight = (int) styledAttributes.getDimension(0, 0);
        styledAttributes.recycle();

        return toolbarHeight;
    }
}