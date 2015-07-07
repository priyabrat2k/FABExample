package com.appifiedtech.priyabrat.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;


public class FloatingActionButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG1 = "btn1";
    private static final String TAG2 = "btn2";
    private static final String TAG3 = "btn3";

    FloatingActionsMenu floatingActionsMenu = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);

        FloatingActionButton button1 = (FloatingActionButton) findViewById(R.id.action_a);
        FloatingActionButton button2 = (FloatingActionButton) findViewById(R.id.action_b);
        FloatingActionButton button3 = new FloatingActionButton(this);
        button3.setImageResource(R.mipmap.ic_launcher);
        button3.setTitle("Action C");

        button1.setTag(TAG1);
        button2.setTag(TAG2);
        button3.setTag(TAG3);

        floatingActionsMenu = (FloatingActionsMenu) findViewById(R.id.multiple_actions);
        floatingActionsMenu.addButton(button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_floating_action_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        String clicktag = v.getTag().toString();
        if(clicktag.equals(TAG1)){
            Toast.makeText(getApplicationContext(), "clicked "+clicktag, Toast.LENGTH_LONG).show();
            floatingActionsMenu.collapse();
        }
        if(clicktag.equals(TAG2)){
            Toast.makeText(getApplicationContext(), "clicked "+clicktag, Toast.LENGTH_LONG).show();
            floatingActionsMenu.collapse();
        }
        if(clicktag.equals(TAG3)){
            Toast.makeText(getApplicationContext(), "clicked "+clicktag, Toast.LENGTH_LONG).show();
            floatingActionsMenu.collapse();
        }
    }
}
