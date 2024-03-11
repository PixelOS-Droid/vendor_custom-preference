/*
 * Copyright (C) 2020 Havoc-OS
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

package com.android.settings.custom.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.TypedArrayUtils;

public class SwitchPreference extends androidx.preference.SwitchPreferenceCompat {

    public SwitchPreference(Context context, AttributeSet attrs, int defStyleAttr,
            int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public SwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public SwitchPreference(Context context, AttributeSet attrs) {
        this(context, attrs, androidx.preference.R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreference(Context context) {
        this(context, null);
    }

    @Override
    protected void performClick(View view) {
        super.performClick(view);
    }
}
