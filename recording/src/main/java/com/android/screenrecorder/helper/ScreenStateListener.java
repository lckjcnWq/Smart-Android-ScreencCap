package com.android.screenrecorder.helper;

/**
 * @author: wuquan
 * @time: 2022/12/6
 * @describe: com.android.screenrecorder.helper
 */
public interface ScreenStateListener {
    /**
     * 录制中
     */
    void recording();

    /**
     * 暂停中
     */
    void pause();

    /**
     * 录制结束
     * @param path 文件地址
     */
    void stop(String path);

    /**
     * 异常
     * @param msg 异常提示
     */
    void error(String msg);


}
