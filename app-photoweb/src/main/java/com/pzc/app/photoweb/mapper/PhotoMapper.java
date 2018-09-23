package com.pzc.app.photoweb.mapper;


import com.pzc.app.photoweb.model.Photo;

import java.util.List;

/**
 * @author pengzc
 * @deprecated 相册接口
 *
 */
public interface PhotoMapper {

    /**
     * 查询所有相册
     * @return
     */
     List<Photo> selectAll();


     void addPhoto(Photo photo);


}
