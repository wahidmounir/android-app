package me.echeung.moemoekyun.api.responses;

import java.util.List;

import lombok.Getter;
import me.echeung.moemoekyun.model.Song;

@Getter
public class UploadsResponse extends BaseResponse {
    private List<Song> uploads;
}
