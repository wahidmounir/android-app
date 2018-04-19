package me.echeung.moemoekyun.api.responses;

import java.util.List;

import lombok.Getter;
import me.echeung.moemoekyun.models.SongListItem;

@Getter
public class SongsResponse extends BaseResponse {
    private List<SongListItem> songs;
}