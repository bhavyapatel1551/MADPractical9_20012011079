package com.example.madpractical9_20012011079

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.Telephony

open class MyReceiver : BroadcastReceiver() {

    interface Listener{
        fun onTextReceived(sPhoneNo:String?,sMsg:String?)
    }
    lateinit var listener:Listener
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        TODO("MyReceiver.onReceive() is not implemented")
        if(intent.action==Telephony.Sms.Intents.SMS_RECEIVED_ACTION){
            var pnumber=""
            var smsbody=""
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                for(Sms in Telephony.Sms.Intents.getMessagesFromIntent(intent)){
                    pnumber=Sms.displayOriginatingAddress
                    smsbody+=Sms.messageBody
                }
                if(listener!=null){
                    listener?.onTextReceived(pnumber,smsbody)
                }

            }
        }

    }
}