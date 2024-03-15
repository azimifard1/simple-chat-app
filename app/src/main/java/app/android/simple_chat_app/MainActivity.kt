package app.android.simple_chat_app

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.android.simple_chat_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val messagesSample:ArrayList<SampleMessage> = ArrayList()
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        messagesSample.add(SampleMessage("Hello",true))
        messagesSample.add(SampleMessage("Hi",true))
        messagesSample.add(SampleMessage("Hello Hello Hello Hello Hello Hello ",false))
        messagesSample.add(SampleMessage("What The Hell Mate",false))
        messagesSample.add(SampleMessage("Nothing",true))
        messagesSample.add(SampleMessage("Don't Spam Bro",false))
        messagesSample.add(SampleMessage("Ok My Friend",true))
        messagesSample.add(SampleMessage("By The Way",true))
        messagesSample.add(SampleMessage("Here is A Long Text:",true))
        messagesSample.add(SampleMessage("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum",true))
        messagesSample.add(SampleMessage("Alright Thank You I Read All Of That",false))
        binding.messagesRecyclerview.adapter = MessagesAdapter(messagesSample,layoutInflater)
        binding.messagesRecyclerview.layoutManager = LinearLayoutManager(this)
    }
}