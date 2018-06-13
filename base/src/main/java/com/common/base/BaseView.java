package com.common.base;

/**
 * @author zkk
 * @data 2018/06/13
 */
public interface BaseView {

    /**
     * 开始加载
     *
     * @param title
     */
    void showLoading(String title);

    /**
     * 停止加载
     */
    void stopLoading();

    /**
     * 错误提示
     */
    void showErrorTip();
}
