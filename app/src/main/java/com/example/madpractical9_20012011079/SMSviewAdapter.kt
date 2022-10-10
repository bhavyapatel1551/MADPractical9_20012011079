package com.example.madpractical9_20012011079

import android.content.Context
import android.widget.ArrayAdapter

class SMSviewAdapter(context:Context,private val array: ArrayList<smsview>):ArrayAdapter<smsview>(context,array.size,array){
}