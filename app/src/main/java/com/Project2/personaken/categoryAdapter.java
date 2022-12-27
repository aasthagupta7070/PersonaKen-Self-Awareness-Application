package com.Project2.personaken;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public
class categoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<categoryAdapter.viewholder> {
private
    List<quizcategmodel>quizcategmodelList;
public categoryAdapter(List<quizcategmodel>quizcategmodelList){
    this.quizcategmodelList=quizcategmodelList;
}

    @NonNull
    @Override
    public
    viewholder onCreateViewHolder ( @NonNull ViewGroup parent , int viewType ) {
       View view = LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.quizcategory,parent , false );
       return new viewholder ( view );

    }

    @Override
    public void onBindViewHolder ( @NonNull viewholder  holder, int position ) {
holder.setData ( quizcategmodelList.get ( position ).getImageurl (),quizcategmodelList.get ( position ).getTitle ());
    }

    @Override
    public
    int getItemCount () {
        return quizcategmodelList.size ();
    }

    class  viewholder extends RecyclerView.ViewHolder{
    private
        CircleImageView imageView;
     private
        TextView title;

        public viewholder( @NonNull View itemview){
            super(itemview);
            imageView=itemview.findViewById ( R.id.imageView );
            title=itemview.findViewById ( androidx.appcompat.R.id.action_bar_title);
        }
        private void setData(String url,String title){
            Glide.with(itemView.getContext ()).load ( url ).into ( imageView );
            this.title.setText ( title );
        }
    }

}
