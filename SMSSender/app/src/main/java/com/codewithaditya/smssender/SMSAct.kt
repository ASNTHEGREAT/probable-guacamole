package com.codewithaditya.smssender

import android.os.Bundle
import android.telephony.SmsManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*

class SMSAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_send.setOnClickListener {
            var obj=SmsManager.getDefault()
            obj.sendTextMessage("+918308705979", null, "welcome", null, null)
        }
    }
}