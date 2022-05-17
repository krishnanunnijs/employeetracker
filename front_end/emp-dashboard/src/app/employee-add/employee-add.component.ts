import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormGroup, FormControl} from '@angular/forms';
import { EmployeeService } from '../service/employee.service';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent {

  employee: Employee;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private employeeService: EmployeeService
    ) { 
      this.employee= new Employee();
    }

  save() {
    this.employeeService.saveEmployee(this.employee).subscribe(result => this.gotoEmployeeList());
  }

  gotoEmployeeList() {
    console.warn('Employee added successfully ! ', this.employee);
    this.router.navigate(['/']);
  }

}
