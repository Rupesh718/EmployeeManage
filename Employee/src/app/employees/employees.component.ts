import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../service/register.service';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
employeeDetails: any;
private employee:RegisterService;

  constructor(e:RegisterService) { 
    this.employee=e;
  }

  ngOnInit(): void {
    this.employee
    .getemployee()
    .subscribe(
    (response)=>{this.employeeDetails = response;},
    (error)=>{
      alert('Invalid Id Password'),
      console.log(error);}
    );
  }

}
