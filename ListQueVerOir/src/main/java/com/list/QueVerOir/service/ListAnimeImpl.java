package com.list.QueVerOir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.list.QueVerOir.dao.IlistAnimeDao;
import com.list.QueVerOir.models.ListAnime;

@Service
public class ListAnimeImpl implements IListAnimeService{
    @Autowired
    private  IlistAnimeDao animeDao;
	@Override
	public ListAnime get(int id) {
		return animeDao.findById(id).get();
	}

	@Override
	public List<ListAnime> getAll() {
		return (List<ListAnime>) animeDao.findAll();
	}

	@Override
	public void post(ListAnime anime) {
		animeDao.save(anime);
	}

	@Override
	public void put(ListAnime anime, int id) {
		animeDao.findById(id).ifPresent((x)->{
			anime.setId(id);
			animeDao.save(anime);
		});
		
	}

	@Override
	public void delete(int id) {
		animeDao.deleteById(id);
	}

}
