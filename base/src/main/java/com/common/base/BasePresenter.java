package com.common.base;

import android.content.Context;

public abstract  class BasePresenter<M,V> {
    public Context mContext;
    public M mModel;
    public V mView;

    public void setMV(M m,V v){
        this.mModel = m;
        this.mView = v;
    }
}
