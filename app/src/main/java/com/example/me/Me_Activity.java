package com.example.me;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.beautydress.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Me_Activity extends AppCompatActivity {
private ListView me_lv_01,me_lv_02;
    private List<Map<String,Object>> data01 = new ArrayList<Map<String,Object>>();
    private List<Map<String,Object>> data02 = new ArrayList<Map<String,Object>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me_main_layout);

        init();
    }

    private void init() {
        me_lv_01 = (ListView) findViewById(R.id.me_lv_01);
        me_lv_02 = (ListView) findViewById(R.id.me_lv_02);
        aboutListView_01();
        aboutListView_02();

    }



    private void aboutListView_01() {
        int[] image = new int[]{R.mipmap.yuike_settings_indicator_un,R.mipmap.yuike_settings_indicator_un,R.mipmap.yuike_settings_indicator_un,R.mipmap.yuike_settings_indicator_un,R.mipmap.yuike_settings_indicator_un,R.mipmap.yuike_settings_indicator_un,R.mipmap.yuike_settings_indicator_un};
        int[] imgsrc = new int[]{R.mipmap.kimagel_addr_list,R.mipmap.kimagel_coupon,R.mipmap.kimagel_ykcoin,R.mipmap.kimagel_signcenter,
                R.mipmap.kimagel_wallet,R.mipmap.kimagel_x_brand,R.mipmap.kimagel_x_product};
        String itemName[] =getResources().getStringArray(R.array.itemName);

        for (int i = 0;i< imgsrc.length;i++){
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("img",imgsrc[i]);
            map.put("text",itemName[i]);
            map.put("image",image[i]);

            data01.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(Me_Activity.this,data01,R.layout.me_item_layout,
                new String[]{"img","text","image"},new int[]{R.id.me_lv_01_iv_01,R.id.me_lv_01_tv,R.id.me_lv_01_iv_02});
        me_lv_01.setAdapter(adapter);
    }
    private void aboutListView_02() {
        int[] image02 = new int[]{R.mipmap.yuike_settings_indicator_un,R.mipmap.yuike_settings_indicator_un,R.mipmap.yuike_settings_indicator_un};
        int[] imgsrc02 = new int[]{R.mipmap.kimagel_user_invate,R.mipmap.kimagel_weixin_service,R.mipmap.kimagel_dafen};
        String itemName02[] =getResources().getStringArray(R.array.itemName_02);

        for (int i = 0;i< imgsrc02.length;i++){
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("img",imgsrc02[i]);
            map.put("text",itemName02[i]);
            map.put("image",image02[i]);

            data02.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(Me_Activity.this,data02,R.layout.me_item_layout,
                new String[]{"img","text","image"},new int[]{R.id.me_lv_01_iv_01,R.id.me_lv_01_tv,R.id.me_lv_01_iv_02});
        me_lv_02.setAdapter(adapter);
    }
}
