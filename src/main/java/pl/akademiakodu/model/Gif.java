package pl.akademiakodu.model;

import org.springframework.stereotype.Component;

@Component
public class Gif {

    private String name;
    private String username;
    private Boolean favorite;

    public Gif() {
    }

    public Gif(String name, String username, Boolean favorite) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
