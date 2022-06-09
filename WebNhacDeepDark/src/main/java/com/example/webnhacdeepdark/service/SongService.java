package com.example.webnhacdeepdark.service;

import com.example.webnhacdeepdark.entity.Author;
import com.example.webnhacdeepdark.entity.Singer;
import com.example.webnhacdeepdark.entity.Song;
import com.example.webnhacdeepdark.repositories.SongRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {
    @Autowired
    SongRepositories songRepositories;

    public Song getSongByID(int id) {
        return songRepositories.findById(id).get();
    }

    public Song saveSong(Song song) {
        return songRepositories.save(song);
    }

    public List<Song> findAll() {
        return songRepositories.findAll();
    }

    public List<Song> findByAuthor(Author author) {
        List<Song> listByNameAuthor = new ArrayList<>();
        List<Song> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAuthor().getId() == author.getId()) {
                listByNameAuthor.add(list.get(i));
                System.out.println("Song = " + list.get(i));
                System.out.println("CC = " + listByNameAuthor);
            } else {
                System.out.println("Không có song này");
            }
        }
        System.out.println("listByNameAuthor = " + listByNameAuthor);
        return listByNameAuthor;
    }

    public List<Song> findByNameContaining(String nameSong) {
        return songRepositories.findByNameContaining(nameSong);
    }

    public List<Song> findBySinger(Singer singer) {
        List<Song> listByNameSinger = new ArrayList<>();
        List<Song> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSinger().getId() == singer.getId()) {
                listByNameSinger.add(list.get(i));
            }
        }
        return listByNameSinger;
    }
}
