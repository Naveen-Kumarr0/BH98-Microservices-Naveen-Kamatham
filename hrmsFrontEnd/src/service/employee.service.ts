import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Employee } from 'src/model/employee';

@Injectable({
	providedIn: 'root'
})
export class EmployeeService {
	private baseURL = "http://13.233.250.68:8080/employees";
	constructor(private httpClient: HttpClient) { }
	getEmployeesList(): Observable<Employee[]> {
		return this.httpClient.get<Employee[]>(`${this.baseURL}`);
	}
	createEmployee(employee: Employee): Observable<Object> {
		return this.httpClient.post(`${this.baseURL}`, employee);
	}
	deleteEmployee(id: number): Observable<Object> {
		return this.httpClient.delete(`${this.baseURL}/${id}`);
	}
	getEmployeeById(id: number): Observable<Employee>{
		return this.httpClient.get<Employee>(`${this.baseURL}/${id}`);
	}
	updateEmployee(id: number, employee: Employee): Observable<Object>{
		return this.httpClient.put(`${this.baseURL}/${id}`, employee);
	}
}
