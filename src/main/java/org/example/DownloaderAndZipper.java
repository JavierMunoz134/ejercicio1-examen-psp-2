package org.example;

public class DownloaderAndZipper implements Listener {

    @Override
    // Este método se ejecutará cuando se añada una URL al gestor de URLs
    public void update(String url, String randomString) {
        // Si la URL está vacía, se procederá a descargar y comprimir los ficheros
        if (url.isEmpty()) {
            System.out.println("Se va a proceder a descargar y comprimir los ficheros");
        }
        else {
            // Si la URL no está vacía, se encolará la URL con un nombre aleatorio
            System.out.println(url + " encolado como " + randomString);
        }
    }
}
