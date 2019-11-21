package com.example.demogridlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Gallary> gallaryList = new ArrayList<>();
    private RecyclerView recyclerView;
    private GallaryAdapter gAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gAdapter = new GallaryAdapter(gallaryList);
        recyclerView.setHasFixedSize(true);

      //  RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
       // recyclerView.setLayoutManager(mLayoutManager);
        GridLayoutManager manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
      //  recyclerView.setLayoutManager (new GridLayoutManager(this, 3));
       // recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Gallary gallary = gallaryList.get(position);
                Intent intent = new Intent(MainActivity.this,ImageActivity.class);
                intent.putExtra("obj",gallary);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), gallary.getImagename() + " is selected!", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareUserData();
    }
    private void prepareUserData()
    {
        Gallary gallary;
        gallaryList.add(new Gallary("Taylor",R.drawable.taylor));
        gallaryList.add(new Gallary("Deepika",R.drawable.deepika));
        gallaryList.add(new Gallary("Anjila",R.drawable.download));
        gallaryList.add(new Gallary("Risky",R.drawable.download2));
        gallaryList.add(new Gallary("Amitabh Bachhan", R.drawable.amithbh));
        gallaryList.add(new Gallary("Sahrukh Khan",R.drawable.sahrukh));
        gallaryList.add(new Gallary("Amir Khan",R.drawable.amir));
        gallaryList.add(new Gallary("Anil Kapoor",R.drawable.anilkapoor));
        gallaryList.add(new Gallary("SalmanKhan",R.drawable.salaman));
        gallaryList.add(new Gallary("RanveerSinh",R.drawable.ranvirsinh));
        gallaryList.add(new Gallary("Siddharth",R.drawable.sidddhart));
        gallaryList.add(new Gallary("Kajal",R.drawable.kajal));
        gallaryList.add(new Gallary("Ketrina",R.drawable.karina));
        gallaryList.add(new Gallary("Kriti Sanon",R.drawable.kriti));
        gallaryList.add(new Gallary("Aishwarya",R.drawable.aishwarya));
        gallaryList.add(new Gallary("Tapsi",R.drawable.tapsi));
        gallaryList.add(new Gallary("Alia Bhatt",R.drawable.alia));
        gallaryList.add(new Gallary("Priyanka",R.drawable.priyanka));





        // userList.add(new User("John","Paris","25 Aug",R.drawable.usertwo));


    }

}
