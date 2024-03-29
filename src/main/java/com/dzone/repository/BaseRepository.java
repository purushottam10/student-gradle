package com.dzone.repository;

import com.dzone.api.BaseModel;

import java.util.List;

public interface BaseRepository<T extends BaseModel> extends GenericRepository<T> {

    T save (T model);
    List<T> getAll();
    T getById(String Id);
    void deleteById(String Id);
    T updateById(String Id, T model);
}
