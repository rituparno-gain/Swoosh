package com.rigain.swoosh.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Rituparno on 11/25/17.
 */
class Player (var league : String , var skillLevel : String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeString(league)
            parcel.writeString(skillLevel)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }

}