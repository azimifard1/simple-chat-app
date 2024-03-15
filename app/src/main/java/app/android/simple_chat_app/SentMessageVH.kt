package app.android.simple_chat_app

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class SentMessageVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val sentBubble:ConstraintLayout
    val sentMessage:TextView
    val sentTime:TextView
    init {
        sentBubble = itemView.findViewById(R.id.sent_bubble)
        sentMessage = itemView.findViewById(R.id.sent_text)
        sentTime = itemView.findViewById(R.id.sent_time)
        sentBubble.setOnClickListener{
            if(sentBubble.visibility==View.GONE){
                sentBubble.visibility = View.VISIBLE
            }else{
                sentBubble.visibility = View.GONE
            }
        }
    }
}
