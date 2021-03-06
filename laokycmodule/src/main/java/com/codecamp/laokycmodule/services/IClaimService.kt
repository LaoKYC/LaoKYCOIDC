package com.codecamp.laokycmodule.services

import android.content.Context
import android.content.Intent

interface IClaimService {
    var allClaims : String
    var idToken : String
    var accessToken : String
    var firstName : String
    var familyName : String
    var picture : String
    var phoneNumber : String
    var preferredUsername : String
    var userID : String
    var gender : String
    var account : String
    var sub : String
    var factor : String
    var isLogOut : Boolean

    fun ExtractClaims(context: Context, dataIntent: Intent)

}