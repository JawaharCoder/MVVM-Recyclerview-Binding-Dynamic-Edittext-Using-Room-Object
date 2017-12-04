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

package com.example.android.persistence.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.android.persistence.model.Product;

import java.util.Objects;

@Entity(tableName = "products")
public class ProductEntity extends Product {
    @PrimaryKey
    private int id;
    private String name;
    private String description;
    private int price;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public TextWatcher getTextWatcher(){

        TextWatcher textWatcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!Objects.equals(getProductentity().getObservableField().get(), s.toString())) {
                    getProductentity().getObservableField().set(s.toString());

                }
            }
        };

        return textWatcher;

    }

    @Override
    public void setObservableField(ObservableField<String> text1) {
        text=text1;
    }

    @Override
    public ObservableField<String>  getObservableField(){
        return text;
    }

    public Product getProductentity(){
        return this;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductEntity() {
    }

    public ProductEntity(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
    }
}
