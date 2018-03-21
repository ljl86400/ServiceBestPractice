package com.shawnlee.servicebestpractice;

/**
 * Created by Shawn.Lee on 2018/3/21.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
