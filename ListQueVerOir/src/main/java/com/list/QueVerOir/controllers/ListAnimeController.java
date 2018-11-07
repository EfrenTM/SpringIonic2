package com.list.QueVerOir.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.list.QueVerOir.models.ListAnime;
import com.list.QueVerOir.service.IListAnimeService;

@RestController
@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8090"})
public class ListAnimeController{
 
	@Autowired
	IListAnimeService animeService;
	
	@GetMapping("/anime_all")
	public  List<ListAnime> getAllAnimes(){
		return animeService.getAll();
	};
	
	@GetMapping("/anime/{id}")
	public ListAnime getOne(@PathVariable(value = "id")int id) {
		return animeService.get(id);
	}
	
	@PostMapping("/anime")
	public void add(@RequestBody ListAnime anime) {
		animeService.post(anime);
	}
	
	@PutMapping("/anime/{id}")
	public void update(@RequestBody ListAnime anime, @PathVariable(value = "id")int id ){	
		animeService.put(anime, id);
	}
	
	@DeleteMapping("/anime_delete/{id}")
	public void update( @PathVariable(value = "id")int id ){	
		animeService.delete(id);
	}
}
