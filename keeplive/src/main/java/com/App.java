/*
package com;

import android.app.Application;

import com.fanjun.keeplive.KeepLive;
import com.fanjun.keeplive.XLog;
import com.fanjun.keeplive.config.KeepLiveService;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        four();
    }

    private void four() {
        XLog.showArgsInfo("MainActivity.four");
        //定义前台服务的默认样式。即标题、描述和图标
//        ForegroundNotification foregroundNotification = new ForegroundNotification("测试", "描述", R.mipmap.ic_launcher,
//                //定义前台服务的通知点击事件
//                new ForegroundNotificationClickListener() {
//
//                    @Override
//                    public void foregroundNotificationClick(Context context, Intent intent) {
//                        XLog.showArgsInfo("MainActivity.foregroundNotificationClick");
//                    }
//                });
        //启动保活服务
        KeepLive.startWork(this, KeepLive.RunMode.ENERGY, null,
                //你需要保活的服务，如socket连接、定时任务等，建议不用匿名内部类的方式在这里写
                new KeepLiveService() {
                    */
/**
                     * 运行中
                     * 由于服务可能会多次自动启动，该方法可能重复调用
                     *//*

                    @Override
                    public void onWorking() {
                        XLog.showArgsInfo("MainActivity.onWorking");
                    }

                    */
/**
                     * 服务终止
                     * 由于服务可能会被多次终止，该方法可能重复调用，需同onWorking配套使用，如注册和注销broadcast
                     *//*

                    @Override
                    public void onStop() {
                        XLog.showArgsInfo("MainActivity.onStop");
                    }
                }
        );
    }

}
*/
