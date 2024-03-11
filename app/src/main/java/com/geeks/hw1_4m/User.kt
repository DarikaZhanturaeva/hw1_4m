package com.geeks.hw1_4m

import android.os.Parcelable
import java.io.Serializable

data class User (
    val email : String=" ",
    val password :Int
):Serializable