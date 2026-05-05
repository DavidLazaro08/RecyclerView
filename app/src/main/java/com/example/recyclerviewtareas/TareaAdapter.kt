package com.example.recyclerviewtareas

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class TareaAdapter(
    private val listaTareas: MutableList<Tarea>
) : RecyclerView.Adapter<TareaAdapter.TareaViewHolder>() {

    class TareaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val contenedorTarea: View = view.findViewById(R.id.contenedorTarea)
        val viewPrioridad: View = view.findViewById(R.id.viewPrioridad)
        val txtTitulo: TextView = view.findViewById(R.id.txtTituloTarea)
        val txtCategoria: TextView = view.findViewById(R.id.txtCategoriaTarea)
        val btnEliminar: Button = view.findViewById(R.id.btnEliminar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareaViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tarea, parent, false)

        return TareaViewHolder(vista)
    }

    override fun onBindViewHolder(holder: TareaViewHolder, position: Int) {
        val tarea = listaTareas[position]

        holder.txtTitulo.text = tarea.titulo
        holder.txtCategoria.text = tarea.categoria

        when (tarea.prioridad) {
            2 -> holder.viewPrioridad.setBackgroundColor(Color.RED)
            1 -> holder.viewPrioridad.setBackgroundColor(Color.YELLOW)
            else -> holder.viewPrioridad.setBackgroundColor(Color.GREEN)
        }

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Completando... ${tarea.titulo}",
                Toast.LENGTH_SHORT
            ).show()

            tarea.prioridad = 0
            notifyItemChanged(position)
        }

        holder.btnEliminar.setOnClickListener {
            listaTareas.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    override fun getItemCount(): Int {
        return listaTareas.size
    }
}