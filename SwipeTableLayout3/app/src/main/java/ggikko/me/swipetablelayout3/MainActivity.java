package ggikko.me.swipetablelayout3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

import butterknife.Bind;
import ggikko.me.swipetablelayout3.custom.CustomHorizontalScroll;
import ggikko.me.swipetablelayout3.custom.CustomScroll;

public class MainActivity extends AppCompatActivity {

    CustomScroll scroll1;
    CustomScroll scroll2;
    CustomHorizontalScroll scroll_header;
    CustomHorizontalScroll scroll_content;

    private int scrollValue;
    private int horizontalScrollValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scroll1 = (CustomScroll) findViewById(R.id.scroll1);
        scroll2 = (CustomScroll) findViewById(R.id.scroll2);
        scroll_header = (CustomHorizontalScroll) findViewById(R.id.scroll_header);
        scroll_content = (CustomHorizontalScroll) findViewById(R.id.scroll_content);
    }

    public void setScrollValue(int scrollValue) {
        this.scrollValue = scrollValue;
        scroll1.scrollTo(0,scrollValue);
        scroll2.scrollTo(0,scrollValue);
    }

    public void setHorizontalScrollValue(int horizontalScrollValue) {
        this.horizontalScrollValue = horizontalScrollValue;
        scroll_header.scrollTo(horizontalScrollValue,0);
        scroll_content.scrollTo(horizontalScrollValue,0);
    }
}
