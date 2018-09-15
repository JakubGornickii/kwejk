package pl.akademiakodu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.data.GifRepository;
import pl.akademiakodu.model.Gif;

@Controller
public class GifController {
@Autowired
GifRepository gifRepository;



    @RequestMapping("/")


    public String listGifs(ModelMap modelMap){
modelMap.addAttribute("gifs",gifRepository.getAllGifs());
        return "home";

    }

    @RequestMapping("/search")
    public String searchGif(@RequestParam String q, ModelMap modelMap){
        Gif gif = gifRepository.findByName(q);
        if (gif == null){
            String error = "brak obrazka w bazie";
            modelMap.put("comment",error);
            return "home";}
        modelMap.put("gif",gif);
        return "gif-details";
    }


    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif",gif);
        return "gif-details";
    }

}
