import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  private httpCall:HttpClient;
  constructor(http:HttpClient) { 
    this.httpCall = http;
  }
  getemployee(){//add to the 
    return this.httpCall.get("http://localhost:8689/employees");
   }

   
registerUser(data:any){
  return this.httpCall.post("http://localhost:8689/employees",data);
}

employeeById(data:any){
  return this.httpCall.get("http://localhost:8689/employees/"+data);
}
}
