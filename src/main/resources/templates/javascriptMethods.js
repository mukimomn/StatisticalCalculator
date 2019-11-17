<script> 
//Enabling Tooltips for this page
$(function () {
    $('[data-toggle="tooltip"]').tooltip()
})

//Obtaining user-entered numbers
function get_results() 
{
    var enteredString = document.getElementById('numbers').value;
    
    //convert non-numbers to spaces
    var enteredNumbers = enteredString.replace(/\D/g,' ');
    
    //turn string into array, split at spaces
    var enteredArray = enteredNumbers.split(' ').map(function(item) {
   	    return parseInt(item, 10);
    });
    //remove spaces (which are NaNs) from array
    var convertedArray = enteredArray.filter(function (item) {
        return item;
    });

    var sum = 0;
    var count = 0;
    var max = convertedArray[0];
    var min = convertedArray[0];
    var median = 0;
    var mode = 0;
    var average = 0; 

    sum = getSum(convertedArray); 
    min = getMinValue(convertedArray); 
    max = getMaxValue(convertedArray);
    average = getAverage(sum, count); 
    median = getMedianValue(convertedArray);

    getMode(convertedArray);    

    // display the values on the webpage
    document.getElementById('numbersUsedInput').value = convertedArray;
	document.getElementById('totalSum').value = sum;
	document.getElementById('count').value = count;
	document.getElementById('maxVal').value = max;
	document.getElementById('minVal').value = min;
	document.getElementById('mean').value = average;
	document.getElementById('median').value = median;
    
}

function getAverage(sum, count)
{
    let average = 0; 
    average = sum / count;
    return average; 

}

function getSum(convertedArray)
{
    for (var i =0; i < convertedArray.length; i++)
    {
        sum =+ convertedArray[i];
        count++;
    }
    return sum;
}

function getMaxValue(convertedArray)
{
    let maxValue = 0; 
    maxValue = Math.max(convertedArray); 
    return maxValue; 
}

function getMinValue(convertedArray)
{
    let minValue = 0; 
    minValue = Math.min(convertedArray); 
    return minValue; 
}

function getMedianValue(convertedArray)
{
    let median = 0; 
    // Sort the array 
    convertedArray.sort(function(a,b ){return a - b});
    //median calculation
    if (convertedArray.length % 2 === 0 ) // is even
    {   // average of two middle numbers
        median = (convertedArray[convertedArray.length / 2 - 1] + convertedArray[convertedArray.length / 2]) / 2;
    } 
    else
    {   // is odd
        // middle number only
        median = convertedArray[(convertedArray.length - 1) / 2];      
    }
    return median;
}

function getMode(convertedArray)
{
    //mode calculation
	var modes = [], countArray = [], i, number, maxIndex = 0;

    for (i = 0; i < convertedArray.length; i += 1)
    {
        number = convertedArray[i];
        countArray[number] = (countArray[number] || 0) + 1;
        if (countArray[number] > maxIndex) 
        {
            maxIndex = countArray[number];
        }
    }

    for (i in countArray)
    {
        if (countArray.hasOwnProperty(i)) 
        {
            if (countArray[i] === maxIndex) 
            {
                modes.push(Number(i));
            }
        }
    }

    if (countArray[i] == 1)
    {
        document.getElementById('mode').value = "no mode found";
    }
    else 
    {
        document.getElementById('mode').value = modes;
    }
}

document.getElementById('calculate').addEventListener('click', get_results);



</script> 