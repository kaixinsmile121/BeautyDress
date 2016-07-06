package com.example.beautydress.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.beautydress.R;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg_guide;
    private LinearLayout ll_cotainer;
    private RadioButton rb_home;
    private RadioButton rb_9kuai9;
    private RadioButton rb_cart;
    private RadioButton rb_mine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();


    }
    /**
     * 初始化控件
     */
    private void  initWidgets(){
        rg_guide=(RadioGroup)findViewById(R.id.rg_guide_id);
        ll_cotainer=(LinearLayout) findViewById(R.id.ll_container_id);
        rb_home=(RadioButton)findViewById(R.id.rb_home_id);
        rb_9kuai9=(RadioButton)findViewById(R.id.rb_9kuai9_id);
        rb_cart=(RadioButton)findViewById(R.id.rb_cart_id);
        rb_mine=(RadioButton)findViewById(R.id.rb_space_id);
    }

    /**
     * 关于radiogroup的操作
     */
    private void aboutRadioGroupGuide() {
        rg_guide.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb_home_id:

                        break;

                }
            }
        });
    }
}
