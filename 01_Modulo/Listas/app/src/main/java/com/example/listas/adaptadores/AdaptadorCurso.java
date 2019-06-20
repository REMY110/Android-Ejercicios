package com.example.listas.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.listas.R;
import com.example.listas.TomaListaActividad;
import com.example.listas.listeners.OnItemListenerProyecto;
import com.example.listas.modelo.Cursos;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdaptadorCurso extends RecyclerView.Adapter<AdaptadorCurso.ViewHolder> implements OnItemListenerProyecto

{
    private final Context context;
    private List<Cursos> lista;

    public <ListCursos, a> AdaptadorCurso(Context context, List<Cursos> a){
        this.context=context;
        this.lista=a;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_curso,viewGroup, false);
        return new ViewHolder(v, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Cursos curso = lista.get(i);
        viewHolder.txtNombreCurso.setText(curso.getNombre());
        viewHolder.txtPorcentajeCurso.setText("Asistencia :" + curso.getPorcentaje());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onItemClick(View v, int position) {
        Intent i = new Intent(context, TomaListaActividad.class);
       /* i.putExtra(lista.get(position).getId());*/
        context.startActivity(i);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtNombreCurso;
        TextView txtPorcentajeCurso;
        CircleImageView img;

        OnItemListenerProyecto listenerProyecto;

        public ViewHolder(@NonNull View itemView,OnItemListenerProyecto listenerProyecto){
            super(itemView);
            this.listenerProyecto = listenerProyecto;

            txtNombreCurso=(TextView)itemView.findViewById(R.id.txtNombreCurso);
            txtPorcentajeCurso=(TextView)itemView.findViewById(R.id.txtPorcentajeCurso);
            img=(CircleImageView)itemView.findViewById(R.id.imgCurso);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listenerProyecto.onItemClick(v,getAdapterPosition());
        }
    }
}
