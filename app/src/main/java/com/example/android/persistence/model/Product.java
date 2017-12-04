/*
 * Copyright 2017, The Android Open Source Project
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

package com.example.android.persistence.model;

import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.databinding.ObservableField;
import android.text.TextWatcher;

public abstract class Product {
    public abstract int getId();
    public abstract String getName();
    public abstract String getDescription();
    public abstract int getPrice();
    public abstract TextWatcher getTextWatcher();
    public abstract ObservableField<String> getObservableField();
    public abstract void setObservableField(ObservableField<String> text);

    @Ignore
    public ObservableField<String> text;

}
