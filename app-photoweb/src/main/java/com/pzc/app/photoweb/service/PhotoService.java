package com.pzc.app.photoweb.service;


import com.pzc.app.photoweb.model.Photo;

import java.util.List;
import java.util.Map;

public interface PhotoService {


    public List<Photo> getAll();

    void addPhoto(Photo photo);

}
