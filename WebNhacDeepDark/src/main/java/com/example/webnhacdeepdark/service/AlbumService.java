package com.example.webnhacdeepdark.service;

import com.example.webnhacdeepdark.entity.Album;
import com.example.webnhacdeepdark.entity.Author;
import com.example.webnhacdeepdark.repositories.AlbumRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< Updated upstream
=======
import java.util.ArrayList;
>>>>>>> Stashed changes
import java.util.List;

@Service
public class AlbumService {
    @Autowired
    AlbumRepositories albumRepositories;

    public Album getAlbumByID(int id) {
        return albumRepositories.findById(id).get();
    }

    public Album saveAlbum(Album album) {
        return albumRepositories.save(album);
    }

<<<<<<< Updated upstream
    public List<Album> SearchNameAllbum(String name) { return albumRepositories.findByNameContaining(name);};
=======
    public List<Album> findAll() {
        return albumRepositories.findAll();
    }

    public List<Album> findByAuthor(Author author, ArrayList<Album> listByNameAuthor) {
        List<Album> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAuthor().getId() == author.getId()) {
                listByNameAuthor.add(list.get(i));
                System.out.println("Album = " + list.get(i));
            } else {
                System.out.println("Không có album này");
            }
        }
        System.out.println("listByNameAuthor = " + listByNameAuthor);
        return listByNameAuthor;
    }

>>>>>>> Stashed changes
}
