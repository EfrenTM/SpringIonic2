package com.list.QueVerOir.service;

import java.util.List;

import com.list.QueVerOir.models.ListAnime;



public interface IListAnimeService {
	public ListAnime get(int id);
	public List<ListAnime>getAll();
	public void post(ListAnime anime);
	public void put(ListAnime anime, int id);
	public void delete(int id);
	
}
