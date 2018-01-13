/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.android.speech;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_RECORD_AUDIO_PERMISSION = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Start listening to voices
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
//                == PackageManager.PERMISSION_GRANTED) {
//        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                Manifest.permission.RECORD_AUDIO)) {
//        } else {
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO},
//                    REQUEST_RECORD_AUDIO_PERMISSION);
//        }
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

}
