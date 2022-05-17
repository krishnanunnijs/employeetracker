import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders  } from '@angular/common/http';

import { Employee } from '../model/employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private appUrl: string;

  constructor(private http: HttpClient) {
    this.appUrl ='http://localhost:8080';
   }

  getEmployee(id: number){
    return this.http.get<Employee>(this.appUrl+'/'+id);
  }

  getAllEmployees(): Observable<Employee[]>{
    return this.http.get<Employee[]>(this.appUrl+'/');
  }

  saveEmployee(employee: Employee){
    return this.http.post<Employee>(this.appUrl+'/saveEmployee', employee);
  }

}
