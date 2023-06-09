const promise = new Promise((resolve,reject)=> {
    setTimeout(()=>{
        //...
        resolve({user: "Wiley"})
    },5000)
});

promise
.then(user=> console.log(user))
.catch(err=> console.log(err))
.finally(()=>console.log("final message"))