package com.pzc.app.photoweb.service.impl;

import com.pzc.app.photoweb.mapper.PhotoMapper;
import com.pzc.app.photoweb.model.Photo;
import com.pzc.app.photoweb.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service("photoService")
public class PhotoServiceImpl implements PhotoService {


    @Autowired
    private PhotoMapper photoMapper;

    @Override
    public List<Photo> getAll() {
        return photoMapper.selectAll();
    }

    @Override
    public void addPhoto(Photo photo) {
        photoMapper.addPhoto(photo);
    }
}
