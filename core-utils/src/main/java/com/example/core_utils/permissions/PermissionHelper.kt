package com.example.core_utils.permissions

object PermissionHelper {
    val REQUIRED_PERMISSIONS = arrayOf(
        android.Manifest.permission.CALL_PHONE,
        android.Manifest.permission.READ_PHONE_STATE,
        android.Manifest.permission.SEND_SMS,
        android.Manifest.permission.ACCESS_FINE_LOCATION
    )
}