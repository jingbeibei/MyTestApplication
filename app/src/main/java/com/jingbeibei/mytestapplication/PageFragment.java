package com.jingbeibei.mytestapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.jingbeibei.mytestapplication.ImageSlideshow.ImageSlideshow;
//import com.youth.banner.Banner;
//import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 景贝贝 on 2016/8/18.
 */
public class PageFragment extends android.support.v4.app.Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
//    private Banner banner;
//    String[] images= new String[] {"file:///android_asset/1.png","file:///android_asset/2.png","file:///android_asset/3.png"};
//    String[] titles=new String[]{"标题"};
private ImageSlideshow imageSlideshow;
    private List<String> imageUrlList;
    private List<String> titleList;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment pageFragment = new PageFragment();
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        TextView textView = (TextView) view.findViewById(R.id.TV);
        textView.setText("Fragment #" + mPage);
//        if (mPage==1){
//        banner = (Banner) view.findViewById(R.id.banner);
//        //一步搞定，设置图片就行了
//        banner.setImages(images);
//        banner.setBannerStyle(BannerConfig.NUM_INDICATOR);}
        imageSlideshow = (ImageSlideshow) view.findViewById(R.id.is_gallery);
        imageUrlList = new ArrayList<>();
        titleList = new ArrayList<>();

        // 初始化数据
        initData();

        // 为ImageSlideshow设置数据
        imageSlideshow.setDotSpace(12);
        imageSlideshow.setDotSize(12);
        imageSlideshow.setDelay(3000);
        imageSlideshow.setOnItemClickListener(new ImageSlideshow.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        Toast.makeText(getActivity(),"0",Toast.LENGTH_LONG);
//                        startActivity(new Intent(MainActivity.this,Activity_1.class));
                        break;
                    case 1:
                        Toast.makeText(getContext(),"1",Toast.LENGTH_LONG);
                        break;
                    case 2:
                        Toast.makeText(getContext(),"2",Toast.LENGTH_LONG);
                        break;
                    case 3:
                        Toast.makeText(getContext(),"3",Toast.LENGTH_LONG);
                        break;
                    case 4:
                        Toast.makeText(getContext(),"4",Toast.LENGTH_LONG);
                        break;
                }
            }
        });
        imageSlideshow.commit();
        return view;
    }
    /**
     * 初始化数据
     */
    private void initData() {
        String[] imageUrls = {"http://pic3.zhimg.com/b5c5fc8e9141cb785ca3b0a1d037a9a2.jpg",
                "http://pic2.zhimg.com/551fac8833ec0f9e0a142aa2031b9b09.jpg",
                "http://pic2.zhimg.com/be6f444c9c8bc03baa8d79cecae40961.jpg",
                "http://pic1.zhimg.com/b6f59c017b43937bb85a81f9269b1ae8.jpg",
                "http://pic2.zhimg.com/a62f9985cae17fe535a99901db18eba9.jpg"};
        String[] titles = {"读读日报 24 小时热门 TOP 5 · 余文乐和「香港贾玲」乌龙绯闻",
                "写给产品 / 市场 / 运营的数据抓取黑科技教程",
                "学做这些冰冰凉凉的下酒宵夜，简单又方便",
                "知乎好问题 · 有什么冷门、小众的爱好？",
                "欧洲都这么发达了，怎么人均收入还比美国低"};
        for (int i = 0; i < 5; i++) {
            imageSlideshow.addImageTitle(imageUrls[i], titles[i]);
        }
    }
    @Override
    public void onDestroy() {
        // 释放资源
        imageSlideshow.releaseResource();
        super.onDestroy();
    }
}
