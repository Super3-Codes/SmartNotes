package com.example.smartnotes

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(

    @PrimaryKey(autoGenerate = true)
    val id:Long = 0L,

    val title: String = "",

    val timeStamp : Long = 0,

    val imageUrl: String = "",

    val description : String = "",

)
