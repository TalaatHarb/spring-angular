import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

interface Resource {
  id: number;
  txt: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {


  title = 'web-app';
  id: number;
  txt: string;

  constructor(private http: HttpClient) {
    this.txt = 'Test String: 1';
    this.id = 1;
  }

  ngOnInit() {
  }

  test() {
    this.http
      .get<Resource>('/api/strings/' + String(this.id))
      .subscribe(
        response => {
          console.log(response);
          this.txt = response.txt;
        });
  }
}
