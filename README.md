# ejercicio1-examen-psp-2

Descripción del Proyecto

Este proyecto es una aplicación de consola en Java que gestiona URLs. El usuario puede introducir URLs a través de la consola y estas se añaden a un gestor de URLs (UrlManager). 
 
Funcionamiento

Cuando se inicia la aplicación, se crea una instancia de UrlManager y se añade un DownloaderAndZipper como oyente.  El programa entra en un bucle infinito, solicitando al usuario que introduzca una URL o que escriba 'salir' para terminar.  Cada URL introducida por el usuario se añade al UrlManager.  Cuando el usuario decide terminar e introduce 'salir', el bucle se rompe y la aplicación se cierra.
  
Clases Principales

Main: Esta es la clase principal que contiene el método main. Inicia la aplicación y gestiona la entrada del usuario.
UrlManager: Esta clase gestiona las URLs. Puede añadir URLs y notificar a los oyentes cuando se añade una nueva URL.
DownloaderAndZipper: Esta es una clase de oyente que se notifica cuando se añade una nueva URL al UrlManager.

Requisitos

Java
Maven

Cómo Ejecutar

Para ejecutar este proyecto, necesitas tener instalado Java y Maven en tu sistema. Luego, puedes compilar y ejecutar el proyecto usando los comandos de Maven.