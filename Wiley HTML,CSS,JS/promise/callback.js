console.log("starting")

function userlogin(username,pw,callback){
    setTimeout(()=>{
        console.log("user logged in");
        callback({uname : username})
    }),5000
}
function getProjectByUser(uname,callback){
    setTimeout(()=>{
        console.log("Projects are here");
        callback(["proj1","proj2","proj3"])
    }),5000
}
function projDetails(projects,callback){
    setTimeout(()=>{
        console.log("project Details")
    },5000)

}

const userInfo =userlogin("name","12345",(user)=>{
    console.log(user)
    
    getProjectByUser(user,(projects)=>{
        console.log(projects)
        var proj = projects[0];

        projDetails(proj,details=>{
            console.log(details)
        })
    })

})

// console.log(userInfo)

console.log("ending")