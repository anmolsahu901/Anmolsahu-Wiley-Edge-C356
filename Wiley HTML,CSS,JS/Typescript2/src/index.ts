let id: number = 123;
let company: String = "Wiley"
let isPublished: boolean = true
let x: any;

let studentIds: number[] = [1,2,3,4,5,6]
studentIds.push(19)
console.log(studentIds)

//tuple
let person: [number, String, boolean] = [1, "Praveen", true]

//tuple array
let employees: [number, String][]
employees = [
    [1,"Praveen"],
    [2,"Anonymous"]
] 
let empId: string | number
empId="venkat"

//enum
enum Directions{
    Up, Down, Left, Right
}

//custom types
type Student = {
    id: number,
    name: String,
    age?:number
}

const studentOne: Student ={
    id: 1,
    name: "Praveen"
}

let sid: any = 1;
let eid= sid;

console.log(eid);

//---------function-----------9/6/23-------

//                                    return type
function calculate(x:number,y:number): number {
    return x+y;
}

function sendMessage(message: string | number ):void{
    console.log("My message")    
}

/// interface
interface StudentInterface{
    readonly id: number, // u can't override this value again
    name: string,
    age?: number
}

const student1: StudentInterface={
    id:1,
    name:"Anmol"
}

interface CalcFunc{
    (x:number,y:number):number
    // (x:number,y:number):string 

}

const add: CalcFunc=(x:number,y:number):number => x+y
const subtract: CalcFunc=(x:number,y:number):number => x-y

interface PersonInterface{
    id :number
    name:string
    register():string
}

class Person implements PersonInterface{
    id: number
    name: string

    constructor(id:number,name:string){
        this.id = id;
        this.name = name;
    }

    register():string{
        return `${this.name} is now registered with wiley`
    }

}

const venkat = new Person(1,"Venkat")
const muskan = new Person(2,"muskan")

venkat.register();


class Emplyee extends Person{
    position: string


    constructor(id:number,name:string,position:string){
       super(id,name)
       this.position = position
    }
}


const emp1 = new Emplyee(3,"Anmol","Senior Developer")

function getData<T>(items: T[]): T[]{
    return new Array().concat(items);
}

let numberData = getData<number>([1,2,3,4]);
let skills = getData<String>(["Java", "JS"]);

numberData.push(1);




