package me.echeung.moemoekyun.api.responses;

import lombok.Getter;
import me.echeung.moemoekyun.model.Artist;

@Getter
public class ArtistResponse extends BaseResponse {
    private Artist artist;
}
