package com.example.TestOf3D_AS;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/* Uncomment below if R.string.??? from the string.xml is giving you grief
/* import com.example.TestOf3D_AS.R; */

public class TestOf3D_AS extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Create a TextView and set its text to "PGE Mobile Release 2.2.x" */
        TextView tv = new TextView(this);
        tv.setText(R.string.app_name);
        setContentView(tv);
    }
}
