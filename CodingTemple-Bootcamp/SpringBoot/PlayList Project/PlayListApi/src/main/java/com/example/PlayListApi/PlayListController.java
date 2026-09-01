package com.example.PlayListApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;




@RestController
@RequestMapping("/api/playlists")
public class PlayListController {

    private final PlayListService service;

    public PlayListController(PlayListService service){
        this.service = service;
    }
    @GetMapping
    public List<PlayList> getPlayLists(){
        //return List.of(new PlayList("Summer Jams"), new PlayList("Best of 2025", "2025 jamz"));
        return service.getAllPlayList();
    }

}
