import {describe, test, it, expect} from "vitest"

import {max} from '../src/intro.js'

// 1st argument=max, Name of the function to test
// 2nd argumet is the test that will be called 

//Next is = it or test(different test happening here): Have to arguments

// FOR  AAA to organize a test: Arrange,Act, assert

// In assert we have toBeCalled; toBeDefined; toBeInstanceOf: main gaol is to verify the expectation

// describe('max', ()=> {
//     it('should return the first argument if it is greater', ()=>{
//         //Arrange
//         const a = 2;
//         const b = 1;

//         //ACT
//         const result = max(a,b);

//         //Assert 
//         expect(result).toBe(2)

//     } )

// })


//Simplified version


describe('max', ()=> {
    it('should return the first argument if it is greater', ()=>{
        expect(max(2,1)).toBe(2);

    } )

    it('should return the second argument if it is greater', ()=>{
        expect(max(1,2)).toBe(2);

    } )

    it('should return the first argument if equal', ()=>{
        expect(max(1,1)).toBe(1);

    } )
})

