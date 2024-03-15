package app.android.simple_chat_app

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class SampleMessage(val text:String,val time:String,val isSent:Boolean){

    @RequiresApi(Build.VERSION_CODES.O)
    constructor(text: String, isSent: Boolean):this(text,LocalDateTime.now().format(
        DateTimeFormatter.ofPattern("d MMM u - HH:mm:ss a")),isSent)

}
