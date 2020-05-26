package org.secuso.privacyfriendlycircuittraining.adapters;

import android.content.Context;

import org.secuso.privacyfriendlycircuittraining.database.PFASQLiteHelper;
import org.secuso.privacyfriendlycircuittraining.models.InformationData;

import java.util.List;

public class UserActivityAdapter {
List<InformationData>data;
Context context;
private PFASQLiteHelper dbsql;

    public UserActivityAdapter(List<InformationData> data, Context context) {
        this.data = data;
        this.context = context;
    }

}
