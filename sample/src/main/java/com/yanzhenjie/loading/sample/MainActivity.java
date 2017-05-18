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
package com.yanzhenjie.loading.sample;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.yanzhenjie.loading.LoadingView;
import com.yanzhenjie.loading.dialog.LoadingDialog;

/**
 * <p>Entrance.</p>
 * Created by Yan Zhenjie on 2017/5/17.
 */
public class MainActivity extends AppCompatActivity {

    // dialog.
    private Button mBtnStart;
    private Dialog mWaitDialog;

    // layout.
    private LoadingView mLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mLoadingView = (LoadingView) findViewById(R.id.loading_view);

        mWaitDialog = new LoadingDialog(this);

        mBtnStart = (Button) findViewById(R.id.btn_start);
        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoadingView.setVisibility(View.GONE);
                mWaitDialog.show();
                mBtnStart.postDelayed(closeDialog, 4000);
            }
        });
    }

    private Runnable closeDialog = new Runnable() {
        @Override
        public void run() {
            mLoadingView.setVisibility(View.VISIBLE);
            if (mWaitDialog != null && mWaitDialog.isShowing()) mWaitDialog.dismiss();
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        mBtnStart.removeCallbacks(closeDialog);
    }
}
