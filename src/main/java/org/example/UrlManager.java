package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UrlManager {
    private final List<Listener> listeners = new ArrayList<>();
    private static final int STRING_LENGTH = 20;

    // Añade un listener a la lista de listeners
    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    // Añade una URL a la lista de listeners
    public void addUrl(String url) {
        String randomString = generateRandomString(STRING_LENGTH);
        for (Listener listener : listeners) {
            listener.update(url, randomString);
        }
    }

    // Genera un string aleatorio de longitud length
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            stringBuilder.append(characters.charAt(random.nextInt(characters.length())));
        }

        return stringBuilder.toString();
    }
}