import {describe, it, test, expect} from "vitest"
import {calculateAverage} from '../src/CalcAverage.js'

describe('calculateAverage', ()=>{
    it('Should return NAN if given an empty array', ()=>{
        expect(calculateAverage([])).toBe(NaN)
    });

    it('should calculate the average of an array of a single element', ()=>{
        expect(calculateAverage([1])).toBe(1)
    })

    it('should calculate the average of two elements', ()=>{
        expect(calculateAverage([1,2])).toBe(1.5)
    })

    it('should calculate the average of three elements', ()=>{
        expect(calculateAverage([1,2,3])).toBe(2)
    })
})