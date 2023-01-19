import { createMayBeForwardRefExpression } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { RegisterService } from '../service/register.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  getForm = new FormGroup({
    employeeId:new FormControl(' ',[
      Validators.required,
      Validators.pattern("^[0-9]*$"),
      Validators.minLength(8),] ),
  })

  private employee:RegisterService
  response: any=[];
  constructor(e:RegisterService) {
    this.employee = e;
   }

  ngOnInit(): void {
  }

  employeeId(){
    console.log("id", this.getForm.value.employeeId);
    
    this.employee.employeeById(this.getForm.value.employeeId).subscribe
    ((res)=>{this.response=res;
    if (!res) {
      alert('Invalid users')
    }},);
  }

}
