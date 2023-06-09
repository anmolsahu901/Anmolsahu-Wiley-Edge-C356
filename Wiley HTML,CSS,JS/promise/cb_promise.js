console.log("starting")

function userlogin(username, pw) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("user logged in")
            resolve({ uname: username })
        }, 5000);
    });
}
function getProjectByUser(uname, callback) {

    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Projects are here");
            resolve(["proj1", "proj2", "proj3"])
        }, 5000);
    });

}
function projDetails(projects) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("project Details")
        }, 5000);
    });
}

userlogin("Anmol","123456")
    .then(user=>getProjectByUser(user))
    .then(projects => projDetails(projects[0]))
    .then(details=> console.log(details))
    .catch(err=> console.log(err))
    .finally(()=> console.log("final message"))


// asyc await
async function displayUserProjectDetails(){
    try{
        let userName = await userlogin("Anmol","pw");
        let projects = await getProjectsByUser(userName);
        let proDetails = await projDetails(projects[0]);
        console.log(proDetails)
    }catch(error)
    {
        console.log(error.message)
    }
}

displayUserProjectDetails()

// const userInfo = userlogin("name", "12345", (user) => {
//     console.log(user)

//     getProjectByUser(user, (projects) => {
//         console.log(projects)
//         var proj = projects[0];

//         projDetails(proj, details => {
//             console.log(details)
//         })
//     })

// })


 



// console.log(userInfo)

console.log("ending")