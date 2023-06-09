import{Component} from  "@angular/core";
import { STUDENTS } from "./mock-students";

@Component({
    selector:"app-welcome",
    templateUrl:'./welcome.component.html',
    styleUrls: ["./welcome.component.css"]
})

export class welcomeComponent{
    message = "Welcome to Wiley Edge Anmol"
    
    // students: Student ={
    //     id :1,
    //     name :"Venkat"
    // }

    students = STUDENTS;
    
}