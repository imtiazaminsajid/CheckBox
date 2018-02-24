package com.example.imtiazaminsajid.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void country(View view) {
        switch (view.getId()){
            case R.id.bangladesh:
                if (((CheckBox)view).isChecked()){
                    String checkbox = ((CheckBox)view).getText().toString();

                    Toast.makeText(this,checkbox, Toast.LENGTH_SHORT).show();

                    break;


            }

            case R.id.noakhali:
                if (((CheckBox)view).isChecked()){
                    String checkbox = ((CheckBox)view).getText().toString();

                    Toast.makeText(this,checkbox, Toast.LENGTH_SHORT).show();

                    break;


            }

            case R.id.india:
                if (((CheckBox)view).isChecked()){
                    String checkbox = ((CheckBox)view).getText().toString();

                    Toast.makeText(this,checkbox, Toast.LENGTH_SHORT).show();

                    break;


            }
            case R.id.pakistan:
                if (((CheckBox)view).isChecked()){
                    String checkbox = ((CheckBox)view).getText().toString();

                    Toast.makeText(this,checkbox, Toast.LENGTH_SHORT).show();

                    break;


            }
        }
    }
}
