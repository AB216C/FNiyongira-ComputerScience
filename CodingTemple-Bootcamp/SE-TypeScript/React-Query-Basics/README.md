## 1st Step: installation
npx create-vite ReactQueryBasics --template react-ts

npm i @tanstack/react-query

npm i @tanstack/react-query-devtools

## 2nd Step: CREATING A REACT QUERY PROVIDER FOR THE WHOLE APPLICATION IN THE MAIN.TSX

This will allow us to do react querries
This done by importing QueryClient and QueryClientProvider and creating new queryClient


//TWO THINGS TO DO IN REACTQUERY

# A QUERY:
A query refers to getting data from somewhere
Example: Getting a list of a post

Hook:useQuery

queryKey: A key that uniquely identify the QUERy

# A MUTATION
A mutation refers to changing some types of data
Example: Creating a brand new post

Hook:useMutation

