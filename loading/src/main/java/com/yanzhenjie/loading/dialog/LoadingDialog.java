/*
 * Copyright © Yan Zhenjie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yanzhenjie.loading.dialog;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

import com.yanzhenjie.loading.LoadingView;
import com.yanzhenjie.loading.R;

/**
 * <p>Default loading dialog.</p>
 * Created by Yan Zhenjie on 2017/5/17.
 */
public class LoadingDialog extends Dialog {

    private LoadingView mLoadingView;
    private TextView mTvMessage;

    public LoadingDialog(Context context) {
        super(context, R.style.loadingDialog_Loading);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setContentView(R.layout.loading_wait_dialog);

        mLoadingView = (LoadingView) findViewById(R.id.loading_view);
        mTvMessage = (TextView) findViewById(R.id.loading_tv_message);
    }

    /**
     * Set several colors of the circle.
     */
    public void setCircleColors(int r1, int r2, int r3) {
        mLoadingView.setCircleColors(r1, r2, r3);
    }

    /**
     * Set message.
     */
    public void setMessage(int resId) {
        mTvMessage.setText(resId);
    }

    /**
     * Set message.
     */
    public void setMessage(String message) {
        mTvMessage.setText(message);
    }

}
