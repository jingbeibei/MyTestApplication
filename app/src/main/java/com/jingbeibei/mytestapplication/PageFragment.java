package com.jingbeibei.mytestapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

/**
 * Created by 景贝贝 on 2016/8/18.
 */
public class PageFragment extends android.support.v4.app.Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
    private Banner banner;
    String[] images= new String[] {"file:///android_asset/1.png","file:///android_asset/2.png","file:///android_asset/3.png"};
    String[] titles=new String[]{"标题"};

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
        if (mPage==1){
        banner = (Banner) view.findViewById(R.id.banner);
        //一步搞定，设置图片就行了
        banner.setImages(images);
        banner.setBannerStyle(BannerConfig.NUM_INDICATOR);}
        return view;
    }
}
