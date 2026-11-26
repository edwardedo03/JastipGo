package com.uas.jastipgo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private List<ChatModel> chatList;

    public ChatAdapter(List<ChatModel> chatList) {
        this.chatList = chatList;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_list_layout, parent, false);
        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        ChatModel chat = chatList.get(position);
        holder.tvName.setText(chat.getName());
        holder.tvMessage.setText(chat.getLastMessage());
        holder.tvTime.setText(chat.getTime());
        if (chat.getUnreadCount() > 0) {
            holder.tvUnread.setVisibility(View.VISIBLE);
            holder.tvUnread.setText(String.valueOf(chat.getUnreadCount()));
        } else {
            holder.tvUnread.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvMessage, tvTime, tvUnread;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.textView50);
            tvMessage = itemView.findViewById(R.id.textView51);
            tvTime = itemView.findViewById(R.id.textView52);
            tvUnread = itemView.findViewById(R.id.textView53);
        }
    }
}
