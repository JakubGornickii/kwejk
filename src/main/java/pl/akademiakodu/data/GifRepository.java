package pl.akademiakodu.data;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {


    private static final List<Gif> ALL_GIFS = Arrays.asList(

            new Gif("android-explosion", "michalos", true,1),
            new Gif("ben-and-mike", "mike", true,2),
            new Gif("book-dominos", "ola", true,3),
            new Gif("compiler-bot", "bot", true,1),
            new Gif("cowboy-coder", "coder", true,1),
            new Gif("infinite-andrew", "andrew", true,2)

    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name))
                return gif;
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> getFavorites() {
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getFavorite()) {
                gifs.add(gif);
            }

        }
        return gifs;
    }

    public List<Gif> getByCategories(int id) {
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                gifs.add(gif);
            }

        }
        return gifs;
    }
}
