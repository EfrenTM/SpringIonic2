import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class SpringService {
    public API = 'http://localhost:8090';

    constructor(public http: HttpClient) {
    }

    getAll(): Observable<any> {
        return this.http.get(this.API + '/anime_all');
    }

    /*get(id : number) {
      return this.http.get(this.API+'/'+id);
    }*/

    addOne(nuevoAnime: any) {
        return this.http.post(this.API + '/anime', nuevoAnime);
    }
    
    removeOne(idDelete :number){
        return this.http.delete(this.API + '/anime_delete/' + idDelete);
    }
}