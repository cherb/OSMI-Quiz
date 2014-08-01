package com.example.Herb.C.Ullmann.F.osmi_quiz;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Fabian Ullmann & Christian Herb on 30.07.14.
 */


public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

//Login Button
        Button login = (Button) findViewById(R.id.login);
        final Button login2 = (Button) findViewById(R.id.login2);
        final Dialog anmeldeDialog = new Dialog(this, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                anmeldeDialog.setContentView(R.layout.login);
                anmeldeDialog.show();
            }
        });

//Training Button
        Button training1 = (Button) findViewById(R.id.training1);
        training1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent training = new Intent(view.getContext(),TrainingActivity.class);
                startActivityForResult(training, 0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
