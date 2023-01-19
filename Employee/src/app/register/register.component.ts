import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { RegisterService } from '../service/register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  private registerService!: RegisterService
  register = new FormGroup({
    employeeName: new FormControl('', [Validators.required, 
    Validators.minLength(8),]),
    employeeSalary: new FormControl('',[Validators.required , Validators.pattern("^[0-9]*$")]),
    employeeEmail: new FormControl('',[Validators.required,]),
    employeeContactNo: new FormControl('',[Validators.required ,  Validators.pattern("^[0-9]*$")])
  })

  constructor(Rs:RegisterService) { 
    this.registerService = Rs;
  }

  ngOnInit(): void {
  }

  regsiterUser(){
    console.log(this.register.value);
    this.registerService.registerUser(this.register.value).subscribe(
      res=>{alert('Welcome'),console.log(res);},
      err=>{
        this.register.reset();
        alert('Invalid Details Password'),console.log(err);}
    );
  }

}
