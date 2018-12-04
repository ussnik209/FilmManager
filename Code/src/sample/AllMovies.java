package sample;

import java.util.*;
import java.util.function.Predicate;

public class AllMovies {

    private static List<Film> filmList = null;
    private static Boolean isCreated = false;

    AllMovies() {}

    AllMovies(String path, String name) {
        Film film = new Film(path,name);
        filmList = new ArrayList<>();
        filmList.add(film);
        isCreated = true;
    }

    public static void add(String path, String name) {
        Film film = new Film(path,name);
        filmList.add(film);
    }

    public static void remove(String name) {
        Film film = findFilm(name);
        if(film != null) {
            filmList.remove(film);
        }
        if(filmList.isEmpty()) {

        }
    }

    public static Film findFilm(String name) {
        Film film = null;
        boolean finded = false;
        for(int i = 0; i < filmList.size(); i++) {
            if(filmList.get(i).getName() == name) {
                film = filmList.get(i);
            }
        }
        return film;
    }

    public static Boolean isCreated() {
        return isCreated;
    }

    public static int size() {
        return filmList.size();
    }

    public static String getFilmData(int number) {
        if(filmList == null) return null;
        String path = filmList.get(number).getPath();
        String name = filmList.get(number).getName();
        String data = new String();
        data += path;
        data += "   ";
        data += name;
        return data;
    }

    public static String getFilmName(int i) {
        if(filmList == null){
            return "Empty";
        }
        if(i >= filmList.size()){
            return "Empty";
        }
        return filmList.get(i).getName();
    }
}
