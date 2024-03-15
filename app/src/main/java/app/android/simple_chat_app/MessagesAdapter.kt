package app.android.simple_chat_app

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MessagesAdapter(val messages:ArrayList<SampleMessage>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemViewType(position: Int): Int {
        if(messages[position].isSent){
            return 1//send message
        }
        return 2// Received message
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}