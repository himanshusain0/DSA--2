 function binarySeachArray( arr, x){
    let  low = 0;
    let high = arr.length-1;
    while(low <= high){
            let mid  = Math.floor((high+low)/2);
        if(arr[mid]=== x){
            return mid;       
        }
        else if(arr[mid] < x){
            low = mid +1;
        }else{
            high = mid -1
        }
    }
    return -1
}
function BinarySearch(arr){
    const  x = 5;
    const result = binarySeachArray(arr,x);
    if(result ===-1){
        console.log("element is not present in array");
    }
    else {
        console.log("element is present at index :" ,result);      
    }
}
const arr = [1,5,8,9,56];
BinarySearch(arr);