package com.example.smartnotes

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface NoteDao  {
    
    @Insert
    suspend fun insert(note:Note)

    @Update
    suspend fun update(note:Note)

    @Delete
    suspend fun delete(note:Note)

    @Query("SELECT * FROM notes_table WHERE id = :noteId")
    fun get(noteId: Long): LiveData<Note>

    @Query("SELECT * FROM notes_table ORDER BY id DESC")
    fun getAll(note:Note):List<LiveData<Note>>
}