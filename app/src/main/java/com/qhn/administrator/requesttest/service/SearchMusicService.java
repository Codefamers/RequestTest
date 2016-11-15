package com.qhn.administrator.requesttest.service;

import com.qhn.administrator.requesttest.data.SearchMusicEntity;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/9/28 0028.
 */

public interface SearchMusicService {
  /*  @GET("search")
    Call<SearchMusicEntity> searchMusic(@Query("q") String musicName, @Query("page")
            int page, @Query("size") int size);*/
    @GET("search")
    Observable<SearchMusicEntity> searchRxjavaMusic(@Query("q") String musicName, @Query("page") int page, @Query("size") int size);

}
