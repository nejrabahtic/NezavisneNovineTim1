/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.telegroup.nezavisnenovine;

import android.support.v17.leanback.widget.AbstractDetailsDescriptionPresenter;
import android.util.Log;

public class DetailsDescriptionPresenter extends NewsAbstractPresenter {

    @Override
    protected void onBindDescription(ViewHolder viewHolder, Object item) {
        //Movie movie = (Movie) item;
        News news = (News) item;

        Log.d("Test", "Printing from presenter: " + news.getTitle() + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        if (news != null) {

            viewHolder.getmTitle().setText(news.getTitle());
            viewHolder.getmAuthor().setText(news.getAuthor());
            viewHolder.getmDate().setText(news.getDate());
            viewHolder.getmLid().setText(news.getLid());
            viewHolder.getmDesc().setText(news.getBody());

        }
    }
}
