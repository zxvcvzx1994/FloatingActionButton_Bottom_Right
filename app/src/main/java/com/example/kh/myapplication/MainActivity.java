package com.example.kh.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.fab1)
    FloatingActionButton fab2;
    @BindView(R.id.fab2)
    FloatingActionButton fab1;
    @BindView(R.id.fab3)
    FloatingActionButton fab3;
    @BindView(R.id.fabMain)
    FloatingActionButton fabMain;
    boolean show  =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.fabMain)
        public void fabMain(){
        if(show==false){
            show();
            show= true;
        }else{
            hide();
            show=  false;
        }
    }

    private void show(){
        fab1.show();
        fab2.show();
        fab3.show();
    }

    private void hide(){
        fab1.hide();
        fab2.hide();
        fab3.hide();
    }

}
