function LinerSearch(arr){
    
    let x = 98;
    let ind = -1;
    for(let i = 0; i<arr.length;i++){
        if(arr[i]===x){
            ind = i ;
            break;
        }
    }
    if(ind===-1){
        console.log("element is not present in array ");
    }
    else{
        console.log('element is  present in at index : ',ind);
        
    }
}
let arr = [2,3,4,6,89,8];
LinerSearch(arr)