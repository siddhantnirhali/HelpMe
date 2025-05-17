package com.example.core_utils.call
import android.content.Context
import android.telephony.PhoneStateListener
import android.telephony.TelephonyManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CallStateListener(context: Context) {
    private val _callState = MutableStateFlow(TelephonyManager.CALL_STATE_IDLE)
    val callState = _callState.asStateFlow()

    private val telephonyManager = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

    private val listener = object : PhoneStateListener() {
        override fun onCallStateChanged(state: Int, phoneNumber: String?) {
            _callState.value = state
        }
    }

    fun start() {
        telephonyManager.listen(listener, PhoneStateListener.LISTEN_CALL_STATE)
    }

    fun stop() {
        telephonyManager.listen(listener, PhoneStateListener.LISTEN_NONE)
    }
}
