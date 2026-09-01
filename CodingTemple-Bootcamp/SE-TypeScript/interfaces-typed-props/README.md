# TypeScript interfaces
Now, we're kicking off our exploration of React with TypeScript by diving into the fascinating realm of TypeScript interfaces. We'll begin by unraveling the magic behind using interfaces to define the shape of data – a crucial skill in structuring information effectively within your applications.


# To kick things off, we’ll create a new react TypeScript project and make use of the previously learned react-bootstrap library to show off our data.  Run the following commands:

npx create-vite@latest interfaces-typed-props --template react-ts
cd interfaces-typed-props 
npm install 
npm install react-bootstrap bootstrap
npm run dev


## TypeScript interfaces

Using interfaces to define the shape of data
TypeScript interfaces act as your blueprint, allowing you to explicitly specify the expected properties and their types. For instance, when designing a user profile component, you can create an interface defining properties like name (string), age (number), and email (string). This not only enhances code readability but also serves as a contract, ensuring that data adheres to the specified structure.

## Advanced Props
As your journey through React development deepens, it's time to unlock the potential of advanced prop types, specifically focusing on union string literals, children props and event props.
# Union String literals

Imagine a scenario where you not only want to specify a prop's type but also narrow down its possible values to a predefined set. Union string literals shine in such situations, providing a concise and type-safe way to declare a limited set of string options. By doing so, you not only enhance code readability but also catch potential errors at compile-time, ensuring that your components receive the right inputs.


# Children Props
When it comes to flexibility in composing React components, the children prop takes center stage. This advanced prop type allows you to accept a variety of React nodes – be it components, strings, or fragments. It empowers you to build highly adaptable and reusable components that can seamlessly integrate with diverse content structures. Harnessing the power of React.ReactNode, you'll discover a new level of composability and expressiveness in your component design.

# Event Props

In the context of React, event props are essential for handling user interactions. TypeScript allows us to define the types of event handlers precisely, ensuring that the correct event types and parameters are used.


