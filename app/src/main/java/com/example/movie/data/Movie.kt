package com.example.movie.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val id: String,
    val title: String,
    val overview: String,
    val poster_path: String,
    val vote_average: String
) : Parcelable