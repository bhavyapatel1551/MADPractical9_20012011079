package com.example.madpractical9_20012011079

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony

open class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        TODO("MyReceiver.onReceive() is not implemented")
        if(intent.action==Telephony.Sms.Intents.SMS_RECEIVED_ACTION){
            var pnumber=""
            var smsbody=""
        }
    }
}