import React from "react";
import type { ProfileProps } from "../models/Person.model";

const PersonComponent: React.FC<ProfileProps>= (props)  => {
    return (
      <div>
        <h1>Person Details</h1>
        <h2>{props.person.name}</h2>
        <p>{`Age: ${props.person.age}`}</p>
        <p>{`Email: ${props.person.email || 'No email provided'}`}</p>
        <p>{`message: ${props.message }`}</p>
      </div>
    );
  };

export default PersonComponent;