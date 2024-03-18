package com.example.myapplication;

import android.net.Uri;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class PhotoEntry {

    @PrimaryKey
    public int id;

    @ColumnInfo(name  = "name")
    public String name;

    @ColumnInfo(name  = "uri")
    public Uri uri;

}
