package com.hieu.accountactivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Profile extends AppCompatActivity {
    TextView thong_bao;
    GridView gridView;
    Button photo,post;
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Intent intent = this.getIntent();
        String email= intent.getStringExtra("mail");
        String password = intent.getStringExtra("pass");
        gridView = (GridView) findViewById(R.id.gridView);
        post = (Button) findViewById(R.id.post);
        photo = (Button) findViewById(R.id.photo);

        //Listview
        lv = (ListView) findViewById(R.id.list_post);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.avt, "Android","Bai viet nay duoc viet boi hieu giddy"));
        arr_bean.add(new ListViewBean(R.drawable.avt, "Java","Bai viet nay duoc viet boi hieu giddy"));
        arr_bean.add(new ListViewBean(R.drawable.avt,"Python","Bai viet nay duoc viet boi hieu giddy"));
        arr_bean.add(new ListViewBean(R.drawable.avt, "MySQL","Bai viet nay duoc viet boi hieu giddy"));
        arr_bean.add(new ListViewBean(R.drawable.avt, "PHP","Bai viet nay duoc viet boi hieu giddy"));
        adapter=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(adapter);

        //Gridview
        List<Anh> image_details = getListData();
        final GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new CustomGridAdapter(this, image_details));


        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                post.setBackgroundColor(0x0000FF00);//màu trong suốt
                photo.setBackgroundColor(Color.parseColor("#ffffff"));
                lv.setVisibility(View.INVISIBLE);
                gridView.setVisibility(View.VISIBLE);
            }
        });
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                photo.setBackgroundColor(0x0000FF00);//màu trong suốt
                post.setBackgroundColor(Color.parseColor("#ffffff"));
                gridView.setVisibility(View.INVISIBLE);
                lv.setVisibility(View.VISIBLE);
            }
        });
    }

    private  List<Anh> getListData() {
        List<Anh> list = new ArrayList<Anh>();
        Anh vietnam = new Anh(R.drawable.girl1);
        Anh usa = new Anh(R.drawable.girl2);
        Anh russia = new Anh(R.drawable.girl3);
        Anh australia = new Anh(R.drawable.girl4);
        Anh japan = new Anh(R.drawable.girl5);
        Anh japan1 = new Anh(R.drawable.girl6);
        Anh japan2 = new Anh(R.drawable.girl7);
        Anh japan3 = new Anh(R.drawable.girl8);
        Anh japan4 = new Anh(R.drawable.girl9);
        Anh japan5 = new Anh(R.drawable.girl10);
        Anh japan6 = new Anh(R.drawable.girl11);
        Anh japan7 = new Anh(R.drawable.girl12);
        Anh japan8 = new Anh(R.drawable.girl13);
        Anh japan9 = new Anh(R.drawable.girl14);
        Anh japan10 = new Anh(R.drawable.girl15);
        Anh japan11 = new Anh(R.drawable.girl16);

        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(australia);
        list.add(japan);
        list.add(japan1);
        list.add(japan2);
        list.add(japan3);
        list.add(japan4);
        list.add(japan5);
        list.add(japan6);
        list.add(japan7);
        list.add(japan8);
        list.add(japan9);
        list.add(japan10);
        list.add(japan11);



        return list;
    }
}