package com.jingbeibei.mytestapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import me.nereo.multi_image_selector.MultiImageSelector;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_IMAGE = 2;
    private ArrayList<String> mSelectPath;
    TextView tv;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button) findViewById(R.id.button);
        tv= (TextView) findViewById(R.id.textView);
        image= (ImageView) findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiImageSelector.create(MainActivity.this)
                        .showCamera(true) // 是否显示相机. 默认为显示
                .count(1) // 最大选择图片数量, 默认为9. 只有在选择模式为多选时有效
                .single() // 单选模式
                       // .multi() // 多选模式, 默认模式;
                        .origin( mSelectPath) // 默认已选择图片. 只有在选择模式为多选时有效
                        .start(MainActivity.this, REQUEST_IMAGE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_IMAGE){
            if(resultCode == RESULT_OK){
                mSelectPath = data.getStringArrayListExtra(MultiImageSelector.EXTRA_RESULT);
                StringBuilder sb = new StringBuilder();
                for(String p: mSelectPath){
                    sb.append(p);
                   // sb.append("\n");
                    System.out.println(sb);
                }
                tv.setText(sb.toString());
                Bitmap bt= BitmapFactory.decodeFile(sb.toString());
                image.setImageBitmap(bt);
            }
        }
    }
}
