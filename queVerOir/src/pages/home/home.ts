import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { SpringService } from '../../providers/spring-service';

@Component({

  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  animes: Array<any>;
  nuevoAnime: any = { name: "", gender: "", status: "", chapter: "" }
  newName: string;
  newGender: string;
  newStatus: string;
  newChapter: number;
  deleteAnime: number;
  idDelete: number;

  constructor(public navCtrl: NavController, public springService: SpringService) {

  }

  getAllAnime() {
    this.springService.getAll().subscribe(animesArray => {
      this.animes = animesArray;
    })
  }

  /*getOne(id: number) {
    this.springService.get(id).subscribe(
       
    })*/

  addOneAnime(nuevoAnime) {
    //this.nuevoAnime= {name: this.newName, gender: this.newGender, status: this.newStatus, chapter: this.newChapter}

    

    this.springService.addOne(nuevoAnime).subscribe(() => {
      console.log("funcionó");
    }, error => {
      console.log(error);
    });
  }

  informationForAddOne() {
    this.nuevoAnime = { name: this.newName, gender: this.newGender, status: this.newStatus, chapter: this.newChapter };

    this.addOneAnime(this.nuevoAnime);
  }

  deleteOne(idDelete){
    console.log("llego al delete");
     this.springService.removeOne(idDelete).subscribe(() =>{
      console.log("funcionó");
     }, error =>{
      console.log(error);
     })
  }

  infomationDelete(){
    console.log("llego al infotmation");
      this.idDelete= this.deleteAnime;
      
      this.deleteOne(this.idDelete);
  }
}
