function selectionSort(arr){
    /**
     * we have unsorted region initially from index 0
     * so i denotes the start of unsorted region
     */
    let n = arr.length;
    for(let i = 0 ; i<n-1;i++){//i <n-1 means we just want to go till second last element 
        let min_idx = findMinEelement(arr,i);
        if(min_idx !== i){
            //min element and the first element of unsorted region are diff then swap 
            let temp =arr[i];
            arr[i]= arr[min_idx];
            arr[min_idx]=temp;
        }
    }
}

/**
 * This function find out the index of minmun element in the array from index [i,n-1]
 * 
 */

function findMinEelement(arr,i){
    let min_inx_el = i;// initially the first element is min 
    for(let j = i+1;j<arr.length;j++){
        if(arr[j]<arr[min_inx_el]){
            //if the curr elements is similar then the assumed min elelment ,we updated the assumed min element 
            min_inx_el= j;
        }        
    }
    return min_inx_el;
}

let arr = [9,6,2,1,4];

selectionSort(arr);
console.log(arr);

