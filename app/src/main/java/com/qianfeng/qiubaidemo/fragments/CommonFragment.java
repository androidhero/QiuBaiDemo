package com.qianfeng.qiubaidemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.qianfeng.qiubaidemo.R;
import com.qianfeng.qiubaidemo.Response;
import com.qianfeng.qiubaidemo.adapters.ItemAdapter;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Retrofit;

/**
 * Created by gaoChao
 * Date 15-12-30
 */
public class CommonFragment extends Fragment implements Callback<Response> {

    private ItemAdapter itemAdapter;
    private Call<Response> call;
    private static String[] types =
            new String[]{"suggest","video","text","image","latest"};
    public static final String TITLE = "title";
    public static final String URL = "http://m2.qiushibaike.com";

    public CommonFragment() {
    }
    public static Fragment newInstance(String arg){
        CommonFragment commonFragment=new CommonFragment();
        Bundle bundle=new Bundle();
        bundle.putString(TITLE,arg);
        commonFragment.setArguments(bundle);
        return commonFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_comment,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listView= (ListView) view.findViewById(R.id.main_list);
        //itemAdapter=new ItemAdapter(getContext);

        TextView text= (TextView) view.findViewById(R.id.txt);
        String s=getArguments().getString(TITLE);
        text.setText(s);
    }

    @Override
    public void onResponse(retrofit.Response<Response> response, Retrofit retrofit) {

    }

    @Override
    public void onFailure(Throwable t) {

    }
}
