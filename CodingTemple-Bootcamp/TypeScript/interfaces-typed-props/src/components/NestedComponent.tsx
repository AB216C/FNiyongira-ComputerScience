

type NestedComponentProp = {
    children: React.ReactNode;
}

const NestedComponent: React.FC<NestedComponentProp> = ({ children }: NestedComponentProp) => {
    return (
        <div>
            {children}
        </div>
    )
}

export default NestedComponent;

/*
type NestedComponentProp: This defines the shape of the props the component will accept.
children: React.ReactNode: This specifies that the children prop should be of type React.ReactNode.
React.ReactNode is a broad type that includes anything that can be rendered in React, such as strings, numbers, elements, arrays of elements, null, or undefined. This is ideal for children because it can accommodate any type of content nested inside the component.

const NestedComponent: React.FC<NestedComponentProp>: This declares NestedComponent as a functional component (React.FC) with the NestedComponentProp type.
React.FC<NestedComponentProp>: React.FC is a generic type that takes the props type as a parameter. This setup provides type-checking and autocomplete support for props in TypeScript.
{ children }: This is destructuring the children prop from NestedComponentProp.
*/