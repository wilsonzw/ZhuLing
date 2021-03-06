package com.itant.zhuling.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jason on 2017/3/26.
 */

public abstract class BaseFragment extends Fragment {

    private View mView;

    public abstract int getLayoutId();

    public abstract void initViews(View view);

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(getLayoutId(), container, false);
            initViews(mView);
        }
        return mView;
    }
}
