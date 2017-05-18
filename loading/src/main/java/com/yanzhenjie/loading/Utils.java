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
package com.yanzhenjie.loading;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * <p>Core utils.</p>
 * Created by Yan Zhenjie on 2017/5/17.
 */
public class Utils {

    public static float dip2px(Context context, float dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (float) ((displayMetrics.density + 0.5) * dp);
    }

    public static float px2dip(Context context, int px) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (float) (px / (displayMetrics.density + 0.5));
    }

}
