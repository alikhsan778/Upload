package com.tommyputranto.myapplication.dagger;

import com.tommyputranto.myapplication.api.core.CoreApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tommy Dwi Putranto on 11/04/18.
 */

@Module
public class NetModule {
    @Singleton
    @Provides
    CoreApi provideApiClient() {
        return new CoreApi();
    }

//    @Singleton
//    @Provides
//    HomeViewRequest provideHomeViewRequest(CoreApi api){
//        return new HomeViewRequestImpl(api);
//    }
//
//    @Singleton
//    @Provides
//    NextViewRequest provideNextViewRequest(CoreApi api){
//        return new NextViewRequestImpl(api);
//    }

//    @Singleton
//    @Provides
//    ReportViewRequest provideReportViewRequest(CoreApi api){
//        return new ReportViewRequestImpl(api);
//    }


}