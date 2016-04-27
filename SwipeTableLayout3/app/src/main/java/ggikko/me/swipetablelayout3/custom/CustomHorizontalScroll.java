package ggikko.me.swipetablelayout3.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;

import ggikko.me.swipetablelayout3.MainActivity;

/**
 * Created by admin on 16. 4. 27..
 */
public class CustomHorizontalScroll extends HorizontalScrollView {

    Context mContext;

    public CustomHorizontalScroll(Context context) {
        super(context);
        this.mContext = context;
    }

    public CustomHorizontalScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }

    public CustomHorizontalScroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        View view = (View) getChildAt(getChildCount()-1);
        int diff = (view.getBottom()-(getHeight()+getScrollY()));

        int scrollX = getScrollX();
        final float scale = getContext().getResources().getDisplayMetrics().density;

        ((MainActivity)mContext).setHorizontalScrollValue(scrollX);

        super.onScrollChanged(l, t, oldl, oldt);
    }
}
