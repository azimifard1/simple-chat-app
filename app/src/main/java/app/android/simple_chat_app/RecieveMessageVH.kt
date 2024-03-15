package app.android.simple_chat_app

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class RecieveMessageVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val receiveBubble:ConstraintLayout
    val receiveText:TextView
    val receiveTime:TextView
    init {
        receiveBubble = itemView.findViewById(R.id.received_bubble)
        receiveText = itemView.findViewById(R.id.recieved_text)
        receiveTime = itemView.findViewById(R.id.recieved_text)
        receiveBubble.setOnClickListener{
            if(receiveBubble.visibility==View.GONE){
                receiveBubble.visibility = View.VISIBLE
            }else{
                receiveBubble.visibility = View.GONE
            }
        }
    }
}
