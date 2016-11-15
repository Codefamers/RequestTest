package com.qhn.administrator.requesttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.qhn.administrator.requesttest.data.SearchMusicEntity;
import com.qhn.administrator.requesttest.service.SearchMusicService;
import com.qhn.administrator.requesttest.utils.Constants;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class RxRetrofitActivity extends AppCompatActivity {

    private static final String TAG = "RxRetrofitActivity";
    @Bind(R.id.et_search_input)
    EditText etSearchInput;
    @Bind(R.id.btn_search)
    Button btnSearch;
    @Bind(R.id.xrec_info_search)
    RecyclerView recInfoSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_retrofit);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_search)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_search:
                String searchMusic = etSearchInput.getText().toString();
                sendSearchMusicQuest(searchMusic);
                break;
        }
    }

    private void sendSearchMusicQuest(String searchMusic) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        SearchMusicService searchMusicService = retrofit.create(SearchMusicService.class);
        searchMusicService.searchRxjavaMusic(searchMusic, 1, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<SearchMusicEntity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(SearchMusicEntity searchMusicEntity) {
                        Log.d(TAG, "onNext: " + searchMusicEntity.getTotalCount());
                        final ArrayList<SearchMusicEntity.DataBean> arrayData=
                                (ArrayList<SearchMusicEntity.DataBean>) searchMusicEntity.getData();
                        recInfoSearch.setLayoutManager(new LinearLayoutManager(RxRetrofitActivity.this));
                        recInfoSearch.setAdapter(new CommonAdapter<SearchMusicEntity.DataBean>(RxRetrofitActivity.this,
                                R.layout.item_search_result, arrayData) {
                            @Override
                            protected void convert(ViewHolder holder, SearchMusicEntity.DataBean dataBean, int position) {
                                holder.setText(R.id.txt_sort_id, String.valueOf(position+1));
                                holder.setText(R.id.txt_album, dataBean.getAlbumName());
                                holder.setText(R.id.txt_music_alias, dataBean.getAlias());
                                holder.setText(R.id.txt_singerName, dataBean.getSingerName());
                                holder.setText(R.id.txt_music_name, dataBean.getName());
                                Log.d(TAG, "convert: " + dataBean.getName());
                            }

                        });
                    }
                });

    }

    /*private void sendSearchMusicQuest(String searchMusic) {
        Retrofit retrofit=new Retrofit
                .Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SearchMusicService searchMusicService=retrofit.create(SearchMusicService.class);
        Call<SearchMusicEntity> call=searchMusicService.searchMusic(searchMusic,1,20);
        call.enqueue(new Callback<SearchMusicEntity>() {
            @Override
            public void onResponse(Call<SearchMusicEntity> call, Response<SearchMusicEntity> response) {
                SearchMusicEntity.DataBean dataBean=response.body().getData().get(0);
                Log.d(TAG, "onResponse: "+dataBean.getName());

            }

            @Override
            public void onFailure(Call<SearchMusicEntity> call, Throwable t) {
                Log.d(TAG, "onResponse: "+t.getMessage());
            }
        });
    }*/

}
