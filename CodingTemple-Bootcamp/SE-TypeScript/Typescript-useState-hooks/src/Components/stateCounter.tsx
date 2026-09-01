import React, { useState } from 'react';

//REACT.FC: This is also called React.Functional Component(Typescript type and provided by React)
//Role: Allows you to type your functional component in React+ typescript project

// Define the type for the state
interface MyComponentState {
  count: number | null; // Setting count as number or null
}

// Functional component with TypeScript and useState
const StateCounter: React.FC = () => {
  // Using useState without type assertion
  const [state1, setState1] = useState<MyComponentState>({ count: null } as MyComponentState);

  // Using useState with type assertion
  const [state2, setState2] = useState<MyComponentState>({ count: 0 } as MyComponentState);

  // Function to update the count in state1
  const incrementCount1 = () => {
    setState1((prevState) => ({
      ...prevState,
      count: (prevState.count || 0) + 5,
    }));
  };

  // Function to update the count in state2
  const incrementCount2 = () => {
    setState2((prevState) => ({
      ...prevState,
      count: (prevState.count || 0) + 5,
    }));
  };

  return (
    <div>
      {/* State 1 */}
      <p>Count in State 1: {state1.count === null ? 'null' : state1.count}</p>
       <p>Count in State 1 prime: {state1.count}</p>
      <button onClick={incrementCount1}>Increment State 1</button>

      {/* State 2 */}
      <p>Count in State 2: {state2.count}</p>
      <button onClick={incrementCount2}>Increment State 2</button>
    </div>
  );
};

export default StateCounter;


/*
This interface defines the structure for the state object, MyComponentState, with a single property, count, that can either be a number or null.
 This type is used to provide type safety to the useState hooks below.

StateCounter is a functional component written in TypeScript, where React.FC specifies it’s a React Functional Component.
state1 and state2 are both created using useState, with state1 initialized with count: null and state2 with count: 0.
state1 uses <MyComponentState> directly as the type argument for useState, while state2 uses as MyComponentState to explicitly assert the type.

incrementCount1: Updates state1 by setting count to the previous count + 1.
 The expression (prevState.count || 0) + 1 ensures that null is converted to 0 if count is currently null.
incrementCount2: Performs the same action as incrementCount1 but on state2.

Renders the current count values of state1 and state2, along with two buttons to trigger each increment function.
For state1, if count is null, it displays "null"; otherwise, it displays the count value. 
For state2, it directly shows the count since it’s never null (initialized to 0).
*/