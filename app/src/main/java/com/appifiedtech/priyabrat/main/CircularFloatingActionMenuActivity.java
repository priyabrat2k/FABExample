package com.appifiedtech.priyabrat.main;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


public class CircularFloatingActionMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG1 = "btn1";
    private static final String TAG2 = "btn2";
    private static final String TAG3 = "btn3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Creating Floating Buttons
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.ic_fav);
        FloatingActionButton floatingActionButton = new FloatingActionButton
                .Builder(this)
                .setBackgroundDrawable(R.drawable.float_buttons_selector)
                .setContentView(imageView)
                .build();
        // Creating no of menus
        // Item-1
        ImageView imageViewItem1 = new ImageView(this);
        imageViewItem1.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);
        SubActionButton actionButtonItem1 = new SubActionButton
                .Builder(this)
                .setContentView(imageViewItem1)
                .setBackgroundDrawable(ContextCompat.getDrawable(CircularFloatingActionMenuActivity.this,R.drawable.float_sub_buttons_selector))
                .build();
        //Item-2
        ImageView imageViewItem2 = new ImageView(this);
        imageViewItem2.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);
        SubActionButton actionButtonItem2 = new SubActionButton
                .Builder(this)
                .setContentView(imageViewItem2)
                .setBackgroundDrawable(ContextCompat.getDrawable(CircularFloatingActionMenuActivity.this, R.drawable.float_sub_buttons_selector))
                .build();
        // Item-3
        ImageView imageViewItem3 = new ImageView(this);
        imageViewItem3.setImageResource(R.drawable.abc_btn_rating_star_off_mtrl_alpha);
        SubActionButton actionButtonItem3 = new SubActionButton
                .Builder(this)
                .setContentView(imageViewItem3)
                .setBackgroundDrawable(ContextCompat.getDrawable(CircularFloatingActionMenuActivity.this, R.drawable.float_sub_buttons_selector))
                .build();

        actionButtonItem1.setTag(TAG1);
        actionButtonItem2.setTag(TAG2);
        actionButtonItem3.setTag(TAG3);
        actionButtonItem1.setOnClickListener(this);
        actionButtonItem2.setOnClickListener(this);
        actionButtonItem3.setOnClickListener(this);

        // Putting Menu itsms as a menu
        FloatingActionMenu actionMenu = new FloatingActionMenu
                .Builder(this)
                .addSubActionView(actionButtonItem1)
                .addSubActionView(actionButtonItem2)
                .addSubActionView(actionButtonItem3)
                .attachTo(floatingActionButton)
                .build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        if(v.getTag().equals(TAG1)){
            Toast.makeText(getApplicationContext(),"Clicked "+TAG1,Toast.LENGTH_LONG).show();
        }
        if(v.getTag().equals(TAG2)){
            Toast.makeText(getApplicationContext(),"Clicked "+TAG2,Toast.LENGTH_LONG).show();
        }
        if(v.getTag().equals(TAG3)){
            Toast.makeText(getApplicationContext(),"Clicked "+TAG3,Toast.LENGTH_LONG).show();
        }
    }
}
