
//Event Delegation
function parentCall(ev){
    console.log(ev.currentTarget)
}

function childCall(ev){
    // ev.stopPropagation()

    // console.log("this is child")
}

function childCall(ev){
    console.log("this is chilf event 1")
}

function childCall1(ev){
    console.log("This is child event")
}

function childCall2(ev){
    if(true)
    ev.stopImmediatePropagation()

    console.log("This is child event 2")
}

function childCall3(ev){

    console.log("This is child event 3")
}

function anchorEvent(ev){
    ev.preventDefault();

    console.log("Event on anchor Element")
}

var p1 = docuemnt.getElementById("parent1");
var p2 = docuemnt.getElementById("parent2");
var c1 = docuemnt.getElementById("child1");
var c2 = docuemnt.getElementById("child2");
var c = docuemnt.getElementById("anc");

anchorEvent.addEventListner("click",anchorEvent)

p1.addEventListner("click",parentCall,true)
p1.addEventListner("click",parentCall)
c1.addEventListner("click",childCall)

p2.addEventListner("click",parentCall);
c2.addEventListner("click",childCall);


