package com.example.PlayListApi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayListService {
    private PlayListRepository playlistRepo=null;

    public PlayListService(PlayListRepository playlistReop){
        this.playlistRepo = playlistRepo;
    }

    public List<PlayList> getAllPlayList(){
        return playlistRepo.findAll();
    }
}
