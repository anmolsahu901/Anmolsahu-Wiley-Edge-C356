let n = "Venkat"
const message = "Wiley"
const skills = [];

// function fn(){
//     console.log("Wecome to wiley edge")
// }

// arrow functions
var fn = (fname, lname)=>`Hey ${fname} Wecome to wiley edge`
fn("Anmol","Sahu")

//destructuring of array
let tools = ["html","css","js","java"]
let [a,b,...c] =tools;

let person = {
    name :"Anmol",
    age : "21",
    hobbies : ["tinder","learning"]
}

let {name,age} = person

//rest anf spread operator

function calculate(...productPrices){
    var total = 0;

    for(let x of productPrices)
    total +=x;

    return total
}

var numbers = [100,200,300,400,500,600]
Math.max(...numbers)


//
var fname = "venkat"
var old = 32

let person1 = {fname,old}