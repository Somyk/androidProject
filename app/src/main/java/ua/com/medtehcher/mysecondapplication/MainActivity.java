package ua.com.medtehcher.mysecondapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView textView;
    private boolean text=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    textView=(TextView) findViewById(R.id.textView);
    }


public void SayPrivet(View view){
if (text==true) {textView.setText("Привет Мир!"); text=!text;}
    else {textView.setText("Hello World!"); text=!text;}
}
public void goToNewActivity(View v)
{Intent intent =new Intent(this, NewActivity.class);
startActivity(intent);
}
}