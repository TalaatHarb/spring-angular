import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


interface Resource {
  id: number;
  txt: string;
}

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.scss']
})
export class MainPageComponent implements OnInit {

  id: number;
  txt: string;

  constructor(private http: HttpClient) {
    this.txt = 'Test String: 1';
    this.id = 1;
  }

  ngOnInit() {
  }

  test(){
    this.http.get<Resource>('/api/strings/' + String(this.id)).subscribe(response =>{
      this.txt = response.txt;
    });
  }

}
