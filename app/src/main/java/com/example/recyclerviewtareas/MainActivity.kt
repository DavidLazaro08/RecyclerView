package com.example.recyclerviewtareas

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val listaTareas = mutableListOf(
        Tarea("Preparar diseño inicial", "Diseño", 2),
        Tarea("Revisar RecyclerView", "Programación", 1),
        Tarea("Subir proyecto a GitHub", "Entrega", 2),
        Tarea("Grabar vídeo demostrativo", "Documentación", 1),
        Tarea("Repasar explicación del Adapter", "Estudio", 0)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerTareas = findViewById<RecyclerView>(R.id.recyclerTareas)
        val btnAdd = findViewById<Button>(R.id.btnAdd)

        recyclerTareas.layoutManager = LinearLayoutManager(this)
        val adapter = TareaAdapter(listaTareas)
        recyclerTareas.adapter = adapter

        btnAdd.setOnClickListener {

            val nuevaTarea = Tarea(
                "Nueva tarea ${listaTareas.size + 1}",
                "General",
                (0..2).random() // prioridad aleatoria
            )

            listaTareas.add(nuevaTarea)
            adapter.notifyItemInserted(listaTareas.size - 1)

            recyclerTareas.scrollToPosition(listaTareas.size - 1)
        }
    }
}