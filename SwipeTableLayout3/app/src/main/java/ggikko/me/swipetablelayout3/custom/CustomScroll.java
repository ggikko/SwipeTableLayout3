package ggikko.me.swipetablelayout3.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

import ggikko.me.swipetablelayout3.MainActivity;

/**
 * Created by admin on 16. 4. 27..
 */
public class CustomScroll extends ScrollView {

    Context mContext;

    public CustomScroll(Context context) {
        super(context);
        this.mContext =context;
    }

    public CustomScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext =context;

    }

    public CustomScroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext =context;

    }


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        View view = (View) getChildAt(getChildCount()-1);
        int diff = (view.getBottom()-(getHeight()+getScrollY()));

        int scrollY = getScrollY();
        final float scale = getContext().getResources().getDisplayMetrics().density;

        int height = (int)((int)(scrollY - 0.5f)/scale);

        Log.e("ggikko", "height : " + scrollY);

        ((MainActivity)mContext).setScrollValue(scrollY);

        super.onScrollChanged(l, t, oldl, oldt);
    }

}
