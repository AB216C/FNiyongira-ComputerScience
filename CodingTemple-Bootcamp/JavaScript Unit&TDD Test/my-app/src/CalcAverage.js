export function calculateAverage(numbers){
    if (numbers.length===0) return NaN;

    const sum = numbers.reduce((sum,current) => sum + current,0);
    return sum / numbers.length;
}