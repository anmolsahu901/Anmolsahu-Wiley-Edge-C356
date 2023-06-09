"use strict";
let id = 123;
let company = "Wiley";
let isPublished = true;
let x;
let studentIds = [1, 2, 3, 4, 5, 6];
studentIds.push(19);
console.log(studentIds);
//tuple
let person = [1, "Praveen", true];
//tuple array
let employees;
employees = [
    [1, "Praveen"],
    [2, "Anonymous"]
];
let empId;
empId = "venkat";
//enum
var Directions;
(function (Directions) {
    Directions[Directions["Up"] = 0] = "Up";
    Directions[Directions["Down"] = 1] = "Down";
    Directions[Directions["Left"] = 2] = "Left";
    Directions[Directions["Right"] = 3] = "Right";
})(Directions || (Directions = {}));
const studentOne = {
    id: 1,
    name: "Praveen"
};
let sid = 1;
let eid = sid;
console.log(eid);
//---------function-----------9/6/23-------
//                                    return type
function calculate(x, y) {
    return x + y;
}
function sendMessage(message) {
    console.log("My message");
}
const student1 = {
    id: 1,
    name: "Anmol"
};
const add = (x, y) => x + y;
const subtract = (x, y) => x - y;
class Person {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    register() {
        return `${this.name} is now registered with wiley`;
    }
}
const venkat = new Person(1, "Venkat");
const muskan = new Person(2, "muskan");
venkat.register();
class Emplyee extends Person {
    constructor(id, name, position) {
        super(id, name);
        this.position = position;
    }
}
const emp1 = new Emplyee(3, "Anmol", "Senior Developer");
function getData(items) {
    return new Array().concat(items);
}
let numberData = getData([1, 2, 3, 4]);
let skills = getData(["Java", "JS"]);
numberData.push(1);
