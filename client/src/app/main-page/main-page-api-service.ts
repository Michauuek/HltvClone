import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

export interface Map {
  id: number;
  name: string;
  url: string;
}


@Injectable()
export class ApiService {
  constructor(private _http: HttpClient) { }

  getData() {
    return this._http.get<Map>("http://localhost:8080/map/siema");
  }
}