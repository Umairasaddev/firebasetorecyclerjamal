//package com.example.firebasetorecyclerjamal;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.firebase.ui.database.FirebaseRecyclerAdapter;
//import com.firebase.ui.database.FirebaseRecyclerOptions;
//
//public class myadapter extends FirebaseRecyclerAdapter<model, myadapter.myviewholder> {
//
//    /**
//     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
//     * {@link FirebaseRecyclerOptions} for configuration options.
//     *
//     * @param options
//     */
//    public myadapter(@NonNull FirebaseRecyclerOptions<modal> options)
//    {
//        super(options);
//    }
//
//    @Override
//    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {
//
//        //now to feed data to the text views
//        holder.name.setText(model.getName().toString());
//        holder.course.setText(model.getCourse().toString());
//        holder.duration.setText(model.getDuration().toString());
//
//    }
//
//    @NonNull
//    @Override
//    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        //yahan p view holder main jo view ha us ki values a jain g
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
//        return new myviewholder(view);
//    }
//
//
//    //viewholder will have all the views or controls of single view
//    class myviewholder extends RecyclerView.ViewHolder{
//
//        //yahan p hm single row view ki values /fields ko initializ ekar rhy view holder class k ander
//        TextView name,course,duration;
//        public myviewholder(@NonNull View itemView)
//        {
//            super(itemView);
//            name = itemView.findViewById(R.id.name);
//            course = itemView.findViewById(R.id.course);
//            duration = itemView.findViewById(R.id.duration);
//        }
//    }
//}
