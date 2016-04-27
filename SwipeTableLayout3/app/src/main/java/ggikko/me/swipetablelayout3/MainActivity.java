package ggikko.me.swipetablelayout3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import butterknife.Bind;
import ggikko.me.swipetablelayout3.custom.CustomScroll;

public class MainActivity extends AppCompatActivity {

    CustomScroll scroll1;
    CustomScroll scroll2;

    private int scrollValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scroll1 = (CustomScroll) findViewById(R.id.scroll1);
        scroll2 = (CustomScroll) findViewById(R.id.scroll2);
    }

    public void setScrollValue(int scrollValue) {
        this.scrollValue = scrollValue;
        scroll1.scrollTo(0,scrollValue);
        scroll2.scrollTo(0,scrollValue);
    }
}
