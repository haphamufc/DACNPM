package com.example.webnhacdeepdark.controller;

<<<<<<< Updated upstream
import com.example.webnhacdeepdark.entity.Album;
import com.example.webnhacdeepdark.entity.Users;
import com.example.webnhacdeepdark.service.AlbumService;
import com.example.webnhacdeepdark.service.UserService;
=======
import com.example.webnhacdeepdark.entity.*;
import com.example.webnhacdeepdark.service.*;
>>>>>>> Stashed changes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< Updated upstream
=======
import java.util.ArrayList;
>>>>>>> Stashed changes
import java.util.List;

@Controller
public class Home {
    @Autowired
    UserService userService;
    @Autowired
<<<<<<< Updated upstream
    AlbumService albumService;
=======
    AuthorService authorService;
    @Autowired
    SongService songService;
    @Autowired
    SingerService singerService;
>>>>>>> Stashed changes

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
        Users u = userService.findById(69);
        mav.addObject("user", u);

        return mav;
    }

    @RequestMapping(path = "/dulieu", method = RequestMethod.POST)
    public ModelAndView test(@RequestParam("email") String email) {
        ModelAndView mav = new ModelAndView("index2");
        mav.addObject("email", email);
        return mav;

    }

    @RequestMapping(path = "/testUser", method = RequestMethod.GET)
    public String test2() {
        return "test";
    }

//    @RequestMapping(path = "/search/Author")
//    public ModelAndView searchAuthor(@RequestParam(name = "inputSearch") String inputSearch) {
//        ModelAndView mav = new ModelAndView("Search");
//        List<Song> last = new ArrayList<>();
//        List<Song> listSearchName = new ArrayList<>();
//        List<Author> author = authorService.findByNameContaining(inputSearch);
//        System.out.println("author = " + author);
//        for (int i = 0; i < author.size(); i++) {
//            listSearchName = songService.findByAuthor(author.get(i));
//            for (int j = 0; j < listSearchName.size(); j++) {
//                last.add(listSearchName.get(j));
//            }
//        }
//        mav.addObject("listSearchName", last);
//        return mav;
//    }

    @RequestMapping(path = "/search/Song")
    public ModelAndView searchSinger(@RequestParam(name = "inputSearch") String inputSearch) {
        ModelAndView mav = new ModelAndView("search");
        List<Song> last = new ArrayList<>();
        List<Song> listSearchName;
        List<Singer> singer = singerService.findByNameContaining(inputSearch);
        List<Song> listSearchNameSong = songService.findByNameContaining(inputSearch);
        for (int i = 0; i < singer.size(); i++) {
            listSearchName = songService.findBySinger(singer.get(i));
            for (int j = 0; j < listSearchName.size(); j++) {
                last.add(listSearchName.get(j));
            }
        }
        for (int k = 0; k < listSearchNameSong.size(); k++) {
            last.add(listSearchNameSong.get(k));
        }
        mav.addObject("inputSearch", inputSearch);
        mav.addObject("listSearchName", last);
        return mav;
    }


    @RequestMapping(path = "/Contact", method = RequestMethod.GET)
    public ModelAndView contact() {
        ModelAndView mav = new ModelAndView("contact");
        return mav;
    }

    @RequestMapping(path = "/search")
    public ModelAndView search(){
        ModelAndView mav = new ModelAndView("Search");
//        List<Album> list = albumService.SearchNameAllbum(name);
//        mav.addObject("list", list);
        return mav;
    }
}