package ua.com.medtehcher.mysecondapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import static ua.com.medtehcher.mysecondapplication.R.layout.activity_new;

/**
 * Created by Дмитрий on 21.01.2015.
 */
public class NewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new);
    }
    public void goBack(View v)
    {

        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
