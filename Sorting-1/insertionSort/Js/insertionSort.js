function insertioSort(arr){
    for(let i = 1;i<arr.length;i++){
        let element = arr[i];
        let j;
        for( j = i-1;j>=0;j--){
            if(arr[j]>element){
                arr[j+1]=arr[j];
            }else{
                break;
            }
        }
        arr[j+1]=element;
    }
}

let arr = [5,4,3,1]
insertioSort(arr);
console.log(arr);
