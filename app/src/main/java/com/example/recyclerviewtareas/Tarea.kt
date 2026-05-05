package com.example.recyclerviewtareas

data class Tarea(
    val titulo: String,
    val categoria: String,
    var prioridad: Int // 0 = verde, 1 = amarillo, 2 = rojo
)