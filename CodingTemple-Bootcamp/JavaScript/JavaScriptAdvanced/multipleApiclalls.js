
//Chaining Multiple API calls

//Sequential API calls

    async function fetchMultipleData() {
    try {
        const userResponse = await fetch('https://jsonplaceholder.typicode.com/users/1');
        const user = await userResponse.json();

        const postsResponse = await fetch(`https://jsonplaceholder.typicode.com/users/${user.id}/posts`);
        const posts = await postsResponse.json();

        console.log('User:', user);
        console.log('User Posts:', posts);
    } catch (error) {
        console.error('Error:', error);
    }
}

fetchMultipleData();


    //Parallel API requests
   // If the API calls are independent of each other, you can run them in parallel using Promise.all

    async function fetchParallelData() {
    try {
        const [userResponse, postsResponse] = await Promise.all([
            fetch('https://jsonplaceholder.typicode.com/users/1'),
            fetch('https://jsonplaceholder.typicode.com/posts')
        ]);

        const user = await userResponse.json();
        const posts = await postsResponse.json();

        console.log('User:', user);
        console.log('Posts:', posts);
    } catch (error) {
        console.error('Error:', error);
    }
}

fetchParallelData();
