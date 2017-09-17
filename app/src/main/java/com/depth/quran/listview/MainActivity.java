package com.depth.quran.listview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context mcontext;
    BaseAdpterList  baseAdpterList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mcontext=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=(ListView)findViewById(R.id.listview);
        String name[]={"David","Moris","Smith","Jhon","Morkel","Rabin","Daduon"};
        String phone[]={"8574-5896","8574-85564","8574-46545","8574-2156","8574-6554","8574-5564","8574-5456454"};
        int image[]={R.drawable.a,R.drawable.e,R.drawable.b,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.t};
        baseAdpterList=new BaseAdpterList(mcontext,name,phone,image);
        lv.setAdapter(baseAdpterList);

    }
}
