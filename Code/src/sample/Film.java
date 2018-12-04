package sample;

public class Film {

    private String name;
    private String path;

    Film(String path, String name) {
        setPath(path);
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
