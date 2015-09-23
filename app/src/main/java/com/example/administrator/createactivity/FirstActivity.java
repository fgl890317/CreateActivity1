package com.example.administrator.createactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/8/26.
 */
public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.first_layout);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return  true;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(FirstActivity.this,"clicked button",Toast.LENGTH_SHORT).show();
       // Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
//        Intent intent =new Intent("com.example.administrator.createactivity.intent.action.SecondActivity");
//        intent.addCategory("com.example.administrator.createactivity.MY_CATEGORY");
      //  Intent intent=new Intent(Intent.ACTION_DIAL);
       // intent.setData(Uri.parse("tel:10086"));
        String data="ni hao冯广磊";
        Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
        intent.putExtra("extra_data",data);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case  R.id.add_item:
                Toast.makeText(this,"You Add",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.remove_item:
                Toast.makeText(this,"You remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
