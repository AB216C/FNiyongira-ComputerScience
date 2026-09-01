import {it, describe, expect, test} from "vitest"
import {factorial} from '../src/factorial.js'

describe('factorial', ()=>{
    it('should return 1 on 0', ()=>{
        expect(factorial(0)).toBe(1)
    })
    it('should return 1 on 0', ()=>{
        expect(factorial(1)).toBe(1)
    })
    it('should return 2 on 2', ()=>{
        expect(factorial(2)).toBe(2)
    })

    it('should return 4 on 24', ()=>{
        expect(factorial(4)).toBe(24)
    })

    it('should return undefined on -1', ()=>{
        expect(factorial(-1)).toBe(undefined)
    })

})