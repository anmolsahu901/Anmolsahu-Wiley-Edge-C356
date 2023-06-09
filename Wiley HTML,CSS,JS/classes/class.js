// class User{
//     constructor(name){
//         this.name = name;
//     }
//     sayHi(){
//         console.log(this.name);
//     }
// }

// let user1 = new User("Anmol")

// user1.sayHi()

///prototype way 2

// function User(name){
//     this.name = name;
// }

// User.prototype.sayHi = function(){console.log(`hii ${this.name}`)}

// let user = new User("Wiley")
// user.sayHi()

//way 3

// let User = class{
//     sayHi(){
//         alert("hello")
//     }
// }
// new User().sayHi()


//dynamically make class

function createClass(info){
    return class{
        sayHi(){
            console.log(info)
        }
    }
}

let User = createClass("Wiley Edge")

new User.sayHi();


