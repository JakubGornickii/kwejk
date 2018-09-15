package pl.akademiakodu.data;

import pl.akademiakodu.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GifRepository {


    private static final List<Gif> ALL_GIFS = Arrays.asList(

            new Gif("android-explosion","michalos",true),
            new Gif("ben-and-mike","mike",true),
            new Gif("book-dominos","ola",true),
            new Gif("compiler-bot","bot",true),
            new Gif("cowboy-coder","coder",true),
            new Gif("infinite-andrew","andrew",true)

    );
}
