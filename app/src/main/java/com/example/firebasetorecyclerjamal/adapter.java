package com.example.firebasetorecyclerjamal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;
import java.util.List;

public class adapter extends FirebaseRecyclerAdapter<modal,adapter.myviewholder>
{


    Context context;
   // List<modal> list  = new ArrayList<>();
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public adapter(@NonNull FirebaseRecyclerOptions<modal> options, Context context)
    {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull modal modal)
    {

        holder.title.setText(modal.getTitle());
        holder.message.setText(modal.getMessage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Toast.makeText(context, "The title is "+modal.getTitle(), Toast.LENGTH_SHORT).show();
         //     Toast.makeText(context, "The message is "+modal.getMessage(), Toast.LENGTH_SHORT).show();
                Intent main =  new Intent(context, newgetdataaActivity.class);
                main.putExtra("title", modal.getTitle());
                main.putExtra("message",modal.getMessage());
                main.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(main);

            }
        });

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.doublerow,parent,false);
        return new myviewholder(view);
    }

    static class myviewholder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        TextView title,message;

        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            message = itemView.findViewById(R.id.message);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
