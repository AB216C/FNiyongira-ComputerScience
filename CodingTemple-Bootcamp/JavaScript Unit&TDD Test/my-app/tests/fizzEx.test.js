import {describe, test, it, expect} from "vitest"
import {fizzBuzz} from "../src/fizzEx.js"

describe('fizzBuzz', ()=>{

    it('should return FizzBuzz if divisible by 3 and 5', ()=>{
        expect(fizzBuzz(15)).toBe('FizzBuzz')
    });

    it("should return Fizz if divisible by 3", ()=>{
        expect(fizzBuzz(6)).toBe('Fizz')
    });

    it("should return Buzz if divisible by 5", ()=>{
        expect(fizzBuzz(10)).toBe('Buzz')
    });

    it('should return argument as a string not visible by 3 or 5',()=>{
        expect(fizzBuzz(4)).toBe('4')
    })

})



