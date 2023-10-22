function descendingSort(arr) {
    let swapped = true;
    while (swapped) {
        swapped = false;
        for (let i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                let temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
    }
}

const inputArray = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];
descendingSort(inputArray);
console.log("Sorted Array (Descending):", inputArray);
