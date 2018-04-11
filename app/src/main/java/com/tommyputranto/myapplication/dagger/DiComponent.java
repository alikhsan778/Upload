package com.tommyputranto.myapplication.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Tommy Dwi Putranto on 11/04/18.
 */

@Singleton
@Component(modules = {
        AppModule.class,
        NetModule.class
})
public interface DiComponent {

  //  void inject(HomeVM homeVM);
  //  void inject(TestVM testVM);
//    void inject(NextVM nextVM);
//    void inject(ReportVM reportVM);

}