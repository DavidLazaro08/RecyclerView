# RecyclerView - Lista de Tareas

Aplicación Android desarrollada en Kotlin para trabajar el uso de **RecyclerView**, gestión de listas dinámicas y actualización de interfaz sin recargar la pantalla.

## Descripción

La aplicación muestra una lista de tareas organizadas en tarjetas (CardView). Cada tarea tiene:

- Un título
- Una categoría
- Un indicador visual de prioridad (color)

Se permite interactuar con cada elemento de la lista mediante acciones sencillas.

## Funcionalidades

- Visualización de tareas mediante **RecyclerView**
- Representación de prioridad mediante colores:
  - 🔴 Alta
  - 🟡 Media
  - 🟢 Baja
- Al pulsar una tarea:
  - Se muestra un mensaje tipo *Toast*
  - La tarea cambia automáticamente a prioridad baja (completada)
- Eliminación de tareas:
  - Se eliminan dinámicamente usando `notifyItemRemoved`
- Añadir nuevas tareas:
  - Se generan automáticamente desde el botón "+ Añadir tarea"
  - Se insertan sin recargar la pantalla (`notifyItemInserted`)

## Estructura del proyecto

- `MainActivity.kt` → Configuración del RecyclerView y lógica principal
- `Tarea.kt` → Modelo de datos (data class)
- `TareaAdapter.kt` → Adapter y ViewHolder
- `activity_main.xml` → Layout principal
- `item_tarea.xml` → Diseño de cada elemento de la lista

## Tecnologías utilizadas

- Kotlin
- Android Studio
- RecyclerView
- CardView

## Objetivo

Aplicar el uso de RecyclerView:

- Creación de Adapter y ViewHolder
- Uso de `onBindViewHolder`
- Actualización dinámica de la lista sin recargar la pantalla
- Gestión de eventos en elementos individuales

## Estado

Aplicación funcional con interacción completa sobre los elementos de la lista.

## Vídeo

El funcionamiento de la aplicación se puede ver en el siguiente vídeo:

[Ver vídeo](./video/video.mp4)
